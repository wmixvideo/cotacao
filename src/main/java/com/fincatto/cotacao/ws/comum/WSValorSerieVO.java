/**
 * WSValorSerieVO.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincatto.cotacao.ws.comum;

public class WSValorSerieVO implements java.io.Serializable {
    private int ano;
    private int anoFim;
    private boolean bloqueado;
    private boolean bloqueioLiberado;
    private int dia;
    private int diaFim;
    private int mes;
    private int mesFim;
    private long oid;
    private long oidSerie;
    private String svalor;
    private java.math.BigDecimal valor;

    public WSValorSerieVO() {
    }

    public WSValorSerieVO(
            int ano,
            int anoFim,
            boolean bloqueado,
            boolean bloqueioLiberado,
            int dia,
            int diaFim,
            int mes,
            int mesFim,
            long oid,
            long oidSerie,
            String svalor,
            java.math.BigDecimal valor) {
        this.ano = ano;
        this.anoFim = anoFim;
        this.bloqueado = bloqueado;
        this.bloqueioLiberado = bloqueioLiberado;
        this.dia = dia;
        this.diaFim = diaFim;
        this.mes = mes;
        this.mesFim = mesFim;
        this.oid = oid;
        this.oidSerie = oidSerie;
        this.svalor = svalor;
        this.valor = valor;
    }


    /**
     * Gets the ano value for this WSValorSerieVO.
     *
     * @return ano
     */
    public int getAno() {
        return ano;
    }


    /**
     * Sets the ano value for this WSValorSerieVO.
     *
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }


    /**
     * Gets the anoFim value for this WSValorSerieVO.
     *
     * @return anoFim
     */
    public int getAnoFim() {
        return anoFim;
    }


    /**
     * Sets the anoFim value for this WSValorSerieVO.
     *
     * @param anoFim
     */
    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }


    /**
     * Gets the bloqueado value for this WSValorSerieVO.
     *
     * @return bloqueado
     */
    public boolean isBloqueado() {
        return bloqueado;
    }


    /**
     * Sets the bloqueado value for this WSValorSerieVO.
     *
     * @param bloqueado
     */
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }


    /**
     * Gets the bloqueioLiberado value for this WSValorSerieVO.
     *
     * @return bloqueioLiberado
     */
    public boolean isBloqueioLiberado() {
        return bloqueioLiberado;
    }


    /**
     * Sets the bloqueioLiberado value for this WSValorSerieVO.
     *
     * @param bloqueioLiberado
     */
    public void setBloqueioLiberado(boolean bloqueioLiberado) {
        this.bloqueioLiberado = bloqueioLiberado;
    }


    /**
     * Gets the dia value for this WSValorSerieVO.
     *
     * @return dia
     */
    public int getDia() {
        return dia;
    }


    /**
     * Sets the dia value for this WSValorSerieVO.
     *
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }


    /**
     * Gets the diaFim value for this WSValorSerieVO.
     *
     * @return diaFim
     */
    public int getDiaFim() {
        return diaFim;
    }


    /**
     * Sets the diaFim value for this WSValorSerieVO.
     *
     * @param diaFim
     */
    public void setDiaFim(int diaFim) {
        this.diaFim = diaFim;
    }


    /**
     * Gets the mes value for this WSValorSerieVO.
     *
     * @return mes
     */
    public int getMes() {
        return mes;
    }


    /**
     * Sets the mes value for this WSValorSerieVO.
     *
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }


    /**
     * Gets the mesFim value for this WSValorSerieVO.
     *
     * @return mesFim
     */
    public int getMesFim() {
        return mesFim;
    }


    /**
     * Sets the mesFim value for this WSValorSerieVO.
     *
     * @param mesFim
     */
    public void setMesFim(int mesFim) {
        this.mesFim = mesFim;
    }


    /**
     * Gets the oid value for this WSValorSerieVO.
     *
     * @return oid
     */
    public long getOid() {
        return oid;
    }


    /**
     * Sets the oid value for this WSValorSerieVO.
     *
     * @param oid
     */
    public void setOid(long oid) {
        this.oid = oid;
    }


    /**
     * Gets the oidSerie value for this WSValorSerieVO.
     *
     * @return oidSerie
     */
    public long getOidSerie() {
        return oidSerie;
    }


    /**
     * Sets the oidSerie value for this WSValorSerieVO.
     *
     * @param oidSerie
     */
    public void setOidSerie(long oidSerie) {
        this.oidSerie = oidSerie;
    }


    /**
     * Gets the svalor value for this WSValorSerieVO.
     *
     * @return svalor
     */
    public String getSvalor() {
        return svalor;
    }


    /**
     * Sets the svalor value for this WSValorSerieVO.
     *
     * @param svalor
     */
    public void setSvalor(String svalor) {
        this.svalor = svalor;
    }


    /**
     * Gets the valor value for this WSValorSerieVO.
     *
     * @return valor
     */
    public java.math.BigDecimal getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this WSValorSerieVO.
     *
     * @param valor
     */
    public void setValor(java.math.BigDecimal valor) {
        this.valor = valor;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WSValorSerieVO)) return false;
        WSValorSerieVO other = (WSValorSerieVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.ano == other.getAno() &&
                this.anoFim == other.getAnoFim() &&
                this.bloqueado == other.isBloqueado() &&
                this.bloqueioLiberado == other.isBloqueioLiberado() &&
                this.dia == other.getDia() &&
                this.diaFim == other.getDiaFim() &&
                this.mes == other.getMes() &&
                this.mesFim == other.getMesFim() &&
                this.oid == other.getOid() &&
                this.oidSerie == other.getOidSerie() &&
                ((this.svalor == null && other.getSvalor() == null) ||
                        (this.svalor != null &&
                                this.svalor.equals(other.getSvalor()))) &&
                ((this.valor == null && other.getValor() == null) ||
                        (this.valor != null &&
                                this.valor.equals(other.getValor())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAno();
        _hashCode += getAnoFim();
        _hashCode += (isBloqueado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBloqueioLiberado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDia();
        _hashCode += getDiaFim();
        _hashCode += getMes();
        _hashCode += getMesFim();
        _hashCode += new Long(getOid()).hashCode();
        _hashCode += new Long(getOidSerie()).hashCode();
        if (getSvalor() != null) {
            _hashCode += getSvalor().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WSValorSerieVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br", "WSValorSerieVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ano");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anoFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bloqueado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bloqueado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bloqueioLiberado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bloqueioLiberado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diaFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mesFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svalor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svalor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
