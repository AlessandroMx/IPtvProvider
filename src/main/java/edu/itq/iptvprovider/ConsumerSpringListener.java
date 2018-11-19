package edu.itq.iptvprovider;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import edu.itq.iptv.IptvProveedorDefinicionServiceStub;
import edu.itq.iptv.IptvProveedorSeleccionServiceStub;
import edu.itq.iptv.business.BusinessLogic;
import iptv.itq.edu.RequestIptvProvDefDocument;
import iptv.itq.edu.RequestIptvProvDefDocument.RequestIptvProvDef;
import iptv.itq.edu.RequestIptvProvSelDocument;
import iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel;
import iptv.itq.edu.ResponseIptvProvDefDocument;
import iptv.itq.edu.ResponseIptvProvSelDocument;
import provider.iptv.itq.edu.RequestProviderDocument;
import provider.iptv.itq.edu.RequestProviderDocument.RequestProvider;

public class ConsumerSpringListener implements MessageListener {

    private JmsSender jmsSender;
    private BusinessLogic businessLogic;

    // CreditServiceStub stubBuro;
    @Override
    public void onMessage(Message message) {
        try {
            final String msg = ((TextMessage) message).getText();
            RequestProviderDocument doc = RequestProviderDocument.Factory
                    .parse(msg);
            // Objeto que nos ayudara a acceder a los datos del XML de la cola
            RequestProvider req = doc.getRequestProvider();

            // Contactar al servicio web dedicado a simular que el proveedor
            // selecciona la instalación del servicio y dice si está disponible
            // la instalación
            int respuesta = req.getIdSolicitud();

            // Lógica de negocio para actualizar el paquete del cliente al que
            // pidió
            boolean actualizo = businessLogic
                    .actualizarPaqueteCliente(respuesta);

            if (!actualizo) {
                jmsSender.sendMessage("queue/C", "No se pudo actualizar el "
                        + "paquete que el usuario desea contratar.");
                return;
            }

            // Se avisa al proveedor que le seleccione al usuario la instalación
            // debida de acuerdo al nuevo paquete contratado
            IptvProveedorSeleccionServiceStub stubSelect = new IptvProveedorSeleccionServiceStub(
                    "http://localhost:8089/axis2/services/iptvProveedorSeleccionService?wsdl");

            RequestIptvProvSelDocument requestIptvProvSelDoc = RequestIptvProvSelDocument.Factory
                    .newInstance();
            RequestIptvProvSel requestIptvProvSel = requestIptvProvSelDoc.addNewRequestIptvProvSel();
            requestIptvProvSel.setIdSolicitud(respuesta);
            requestIptvProvSelDoc.setRequestIptvProvSel(requestIptvProvSel);
            ResponseIptvProvSelDocument responseIptvDoc = stubSelect
                    .iptvOperation(requestIptvProvSelDoc);
            String resp = responseIptvDoc.getResponseIptvProvSel().getRespuesta();

            System.out.println(resp);
            
            // El proveedor da un mensaje final con todo lo que se hizo
            // este mensaje final se va a la cola C para que sea consumida...
            IptvProveedorDefinicionServiceStub stubDefine = new IptvProveedorDefinicionServiceStub(
                    "http://localhost:8089/axis2/services/iptvProveedorDefinicionService?wsdl");

            RequestIptvProvDefDocument requestIptvProvDefDoc = RequestIptvProvDefDocument.Factory.newInstance();
            RequestIptvProvDef requestIptvProvDef = requestIptvProvDefDoc.addNewRequestIptvProvDef();
            requestIptvProvDef.setIdSolicitud(respuesta);
            requestIptvProvDefDoc.setRequestIptvProvDef(requestIptvProvDef);
            ResponseIptvProvDefDocument responseIptvProvDefDoc = stubDefine.iptvOperation((RequestIptvProvDefDocument)requestIptvProvDefDoc) ;
            String respFinal = responseIptvProvDefDoc.getResponseIptvProvDef().getRespuesta();

            jmsSender.sendMessage("queue/C", respFinal);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param jmsSender the jmsSender to set
     */
    public void setJmsSender(JmsSender jmsSender) {
        this.jmsSender = jmsSender;
    }

    /**
     * @param businessLogic the businessLogic to set
     */
    public void setBusinessLogic(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

}
