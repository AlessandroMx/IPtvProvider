/*
 * An XML document type.
 * Localname: requestIptvProvSel
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.RequestIptvProvSelDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu.impl;
/**
 * A document containing one requestIptvProvSel(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public class RequestIptvProvSelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.RequestIptvProvSelDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestIptvProvSelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTIPTVPROVSEL$0 = 
        new javax.xml.namespace.QName("edu.itq.iptv", "requestIptvProvSel");
    
    
    /**
     * Gets the "requestIptvProvSel" element
     */
    public iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel getRequestIptvProvSel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel target = null;
            target = (iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel)get_store().find_element_user(REQUESTIPTVPROVSEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestIptvProvSel" element
     */
    public void setRequestIptvProvSel(iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel requestIptvProvSel)
    {
        generatedSetterHelperImpl(requestIptvProvSel, REQUESTIPTVPROVSEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestIptvProvSel" element
     */
    public iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel addNewRequestIptvProvSel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel target = null;
            target = (iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel)get_store().add_element_user(REQUESTIPTVPROVSEL$0);
            return target;
        }
    }
    /**
     * An XML requestIptvProvSel(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public static class RequestIptvProvSelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.RequestIptvProvSelDocument.RequestIptvProvSel
    {
        private static final long serialVersionUID = 1L;
        
        public RequestIptvProvSelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDSOLICITUD$0 = 
            new javax.xml.namespace.QName("edu.itq.iptv", "id_solicitud");
        
        
        /**
         * Gets the "id_solicitud" element
         */
        public int getIdSolicitud()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSOLICITUD$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "id_solicitud" element
         */
        public org.apache.xmlbeans.XmlInt xgetIdSolicitud()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSOLICITUD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id_solicitud" element
         */
        public void setIdSolicitud(int idSolicitud)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDSOLICITUD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDSOLICITUD$0);
                }
                target.setIntValue(idSolicitud);
            }
        }
        
        /**
         * Sets (as xml) the "id_solicitud" element
         */
        public void xsetIdSolicitud(org.apache.xmlbeans.XmlInt idSolicitud)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDSOLICITUD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDSOLICITUD$0);
                }
                target.set(idSolicitud);
            }
        }
    }
}
