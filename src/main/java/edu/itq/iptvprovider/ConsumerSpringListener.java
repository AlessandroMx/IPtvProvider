package edu.itq.iptvprovider;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.xmlbeans.XmlException;

import provider.iptv.itq.edu.RequestProviderDocument;
import provider.iptv.itq.edu.RequestProviderDocument.RequestProvider;
import provider.iptv.itq.edu.ResponseProviderDocument;
import provider.iptv.itq.edu.ResponseProviderDocument.ResponseProvider;

public class ConsumerSpringListener implements MessageListener {

    private JmsSender jmsSender;

    // CreditServiceStub stubBuro;
    @Override
    public void onMessage(Message message) {
        try {
            final String msg = ((TextMessage) message).getText();
            RequestProviderDocument doc = RequestProviderDocument.Factory
                    .parse(msg);
            // objeto que nos ayudara a acceder a los datos del XML de la cola
            RequestProvider req = doc.getRequestProvider();

            int respuesta = req.getIdSolicitud();

            ResponseProviderDocument responseProviderDocument = ResponseProviderDocument.Factory
                    .newInstance();
            ResponseProvider respProvider = responseProviderDocument
                    .addNewResponseProvider();
            // agrego el id_solicitud como respuesta al xml
            respProvider.setRespuesta(Integer.toString(respuesta));
            // agrego a la cola el xml con la respesta
            jmsSender.sendMessage("queue/C", respProvider.toString());
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
     * @param validarUsuario the validarUsuario to set
     */

}
