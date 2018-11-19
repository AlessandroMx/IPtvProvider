/*
 * An XML document type.
 * Localname: responseIptvProvSel
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.ResponseIptvProvSelDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu.impl;
/**
 * A document containing one responseIptvProvSel(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public class ResponseIptvProvSelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.ResponseIptvProvSelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseIptvProvSelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEIPTVPROVSEL$0 = 
        new javax.xml.namespace.QName("edu.itq.iptv", "responseIptvProvSel");
    
    
    /**
     * Gets the "responseIptvProvSel" element
     */
    public iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel getResponseIptvProvSel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel target = null;
            target = (iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel)get_store().find_element_user(RESPONSEIPTVPROVSEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseIptvProvSel" element
     */
    public void setResponseIptvProvSel(iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel responseIptvProvSel)
    {
        generatedSetterHelperImpl(responseIptvProvSel, RESPONSEIPTVPROVSEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseIptvProvSel" element
     */
    public iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel addNewResponseIptvProvSel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel target = null;
            target = (iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel)get_store().add_element_user(RESPONSEIPTVPROVSEL$0);
            return target;
        }
    }
    /**
     * An XML responseIptvProvSel(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public static class ResponseIptvProvSelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseIptvProvSelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESPUESTA$0 = 
            new javax.xml.namespace.QName("edu.itq.iptv", "respuesta");
        
        
        /**
         * Gets the "respuesta" element
         */
        public java.lang.String getRespuesta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "respuesta" element
         */
        public org.apache.xmlbeans.XmlString xgetRespuesta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPUESTA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "respuesta" element
         */
        public void setRespuesta(java.lang.String respuesta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPUESTA$0);
                }
                target.setStringValue(respuesta);
            }
        }
        
        /**
         * Sets (as xml) the "respuesta" element
         */
        public void xsetRespuesta(org.apache.xmlbeans.XmlString respuesta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPUESTA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPUESTA$0);
                }
                target.set(respuesta);
            }
        }
    }
}
