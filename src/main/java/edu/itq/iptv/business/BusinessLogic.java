package edu.itq.iptv.business;

import java.util.List;

import edu.itq.iptv.dao.ClienteDao;
import edu.itq.iptv.dao.PaqueteDao;
import edu.itq.iptv.dao.SolicitudDao;
import edu.itq.iptv.dto.SolicitudDto;

public class BusinessLogic {

    private ClienteDao clienteDao;
    private PaqueteDao paqueteDao;
    private SolicitudDao solicitudDao;

    public boolean actualizarPaqueteCliente(int idSolicitud) {
        
        // Se busca en el sistema la solicitud
        List<SolicitudDto> solicitudList = solicitudDao
                .buscarSolicitud(idSolicitud);
        SolicitudDto solicitud;
        
        // Se verifica exista la solicitud en el sistema
        if (solicitudList == null) {
            return false;
        }
        else if (solicitudList.size() > 0) {
            solicitud = solicitudList.get(0);
        } else {
            return false;
        }
        
        // Se obtiene el id del nuevo paquete a establecerle al usuario
        int idPaqueteNuevo = solicitud.getIdPaquete();
        int idCliente = solicitud.getIdCliente();
        
        // Se actualiza el id del paquete del usuario por el nuevo
        try {
            clienteDao.updatePaquete(idPaqueteNuevo, idCliente);            
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }

    /**
     * @param clienteDao the clienteDao to set
     */
    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    /**
     * @param paqueteDao the paqueteDao to set
     */
    public void setPaqueteDao(PaqueteDao paqueteDao) {
        this.paqueteDao = paqueteDao;
    }

    /**
     * @param solicitudDao the solicitudDao to set
     */
    public void setSolicitudDao(SolicitudDao solicitudDao) {
        this.solicitudDao = solicitudDao;
    }

}
