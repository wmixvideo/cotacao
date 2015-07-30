/**
 * WSSerieVO.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincatto.cotacao.ws.comum;

public class WSSerieVO implements java.io.Serializable {

    private int anoFim;
    private int anoInicio;
    private String aviso;
    private int diaFim;
    private int diaInicio;
    private boolean especial;
    private String fonte;
    private String fullName;
    private String gestorProprietario;
    private int mesFim;
    private int mesInicio;
    private String nomeAbreviado;
    private String nomeCompleto;
    private long oid;
    private String periodicidade;
    private String periodicidadeSigla;
    private boolean possuiBloqueios;
    private boolean publica;
    private String shortName;
    private WSValorSerieVO ultimoValor;
    private String unidadePadrao;
    private String unidadePadraoIngles;
    private boolean valorDiaNaoUtil;
    private WSValorSerieVO[] valores;

    public WSSerieVO() {
    }

    public WSSerieVO(
            int anoFim,
            int anoInicio,
            String aviso,
            int diaFim,
            int diaInicio,
            boolean especial,
            String fonte,
            String fullName,
            String gestorProprietario,
            int mesFim,
            int mesInicio,
            String nomeAbreviado,
            String nomeCompleto,
            long oid,
            String periodicidade,
            String periodicidadeSigla,
            boolean possuiBloqueios,
            boolean publica,
            String shortName,
            WSValorSerieVO ultimoValor,
            String unidadePadrao,
            String unidadePadraoIngles,
            boolean valorDiaNaoUtil,
            WSValorSerieVO[] valores) {
        this.anoFim = anoFim;
        this.anoInicio = anoInicio;
        this.aviso = aviso;
        this.diaFim = diaFim;
        this.diaInicio = diaInicio;
        this.especial = especial;
        this.fonte = fonte;
        this.fullName = fullName;
        this.gestorProprietario = gestorProprietario;
        this.mesFim = mesFim;
        this.mesInicio = mesInicio;
        this.nomeAbreviado = nomeAbreviado;
        this.nomeCompleto = nomeCompleto;
        this.oid = oid;
        this.periodicidade = periodicidade;
        this.periodicidadeSigla = periodicidadeSigla;
        this.possuiBloqueios = possuiBloqueios;
        this.publica = publica;
        this.shortName = shortName;
        this.ultimoValor = ultimoValor;
        this.unidadePadrao = unidadePadrao;
        this.unidadePadraoIngles = unidadePadraoIngles;
        this.valorDiaNaoUtil = valorDiaNaoUtil;
        this.valores = valores;
    }


    /**
     * Gets the anoFim value for this WSSerieVO.
     *
     * @return anoFim
     */
    public int getAnoFim() {
        return anoFim;
    }


    /**
     * Sets the anoFim value for this WSSerieVO.
     *
     * @param anoFim
     */
    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }


    /**
     * Gets the anoInicio value for this WSSerieVO.
     *
     * @return anoInicio
     */
    public int getAnoInicio() {
        return anoInicio;
    }


    /**
     * Sets the anoInicio value for this WSSerieVO.
     *
     * @param anoInicio
     */
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }


    /**
     * Gets the aviso value for this WSSerieVO.
     *
     * @return aviso
     */
    public String getAviso() {
        return aviso;
    }


    /**
     * Sets the aviso value for this WSSerieVO.
     *
     * @param aviso
     */
    public void setAviso(String aviso) {
        this.aviso = aviso;
    }


    /**
     * Gets the diaFim value for this WSSerieVO.
     *
     * @return diaFim
     */
    public int getDiaFim() {
        return diaFim;
    }


    /**
     * Sets the diaFim value for this WSSerieVO.
     *
     * @param diaFim
     */
    public void setDiaFim(int diaFim) {
        this.diaFim = diaFim;
    }


    /**
     * Gets the diaInicio value for this WSSerieVO.
     *
     * @return diaInicio
     */
    public int getDiaInicio() {
        return diaInicio;
    }


    /**
     * Sets the diaInicio value for this WSSerieVO.
     *
     * @param diaInicio
     */
    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }


    /**
     * Gets the especial value for this WSSerieVO.
     *
     * @return especial
     */
    public boolean isEspecial() {
        return especial;
    }


    /**
     * Sets the especial value for this WSSerieVO.
     *
     * @param especial
     */
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }


    /**
     * Gets the fonte value for this WSSerieVO.
     *
     * @return fonte
     */
    public String getFonte() {
        return fonte;
    }


    /**
     * Sets the fonte value for this WSSerieVO.
     *
     * @param fonte
     */
    public void setFonte(String fonte) {
        this.fonte = fonte;
    }


    /**
     * Gets the fullName value for this WSSerieVO.
     *
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this WSSerieVO.
     *
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the gestorProprietario value for this WSSerieVO.
     *
     * @return gestorProprietario
     */
    public String getGestorProprietario() {
        return gestorProprietario;
    }


    /**
     * Sets the gestorProprietario value for this WSSerieVO.
     *
     * @param gestorProprietario
     */
    public void setGestorProprietario(String gestorProprietario) {
        this.gestorProprietario = gestorProprietario;
    }


    /**
     * Gets the mesFim value for this WSSerieVO.
     *
     * @return mesFim
     */
    public int getMesFim() {
        return mesFim;
    }


    /**
     * Sets the mesFim value for this WSSerieVO.
     *
     * @param mesFim
     */
    public void setMesFim(int mesFim) {
        this.mesFim = mesFim;
    }


    /**
     * Gets the mesInicio value for this WSSerieVO.
     *
     * @return mesInicio
     */
    public int getMesInicio() {
        return mesInicio;
    }


    /**
     * Sets the mesInicio value for this WSSerieVO.
     *
     * @param mesInicio
     */
    public void setMesInicio(int mesInicio) {
        this.mesInicio = mesInicio;
    }


    /**
     * Gets the nomeAbreviado value for this WSSerieVO.
     *
     * @return nomeAbreviado
     */
    public String getNomeAbreviado() {
        return nomeAbreviado;
    }


    /**
     * Sets the nomeAbreviado value for this WSSerieVO.
     *
     * @param nomeAbreviado
     */
    public void setNomeAbreviado(String nomeAbreviado) {
        this.nomeAbreviado = nomeAbreviado;
    }


    /**
     * Gets the nomeCompleto value for this WSSerieVO.
     *
     * @return nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }


    /**
     * Sets the nomeCompleto value for this WSSerieVO.
     *
     * @param nomeCompleto
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    /**
     * Gets the oid value for this WSSerieVO.
     *
     * @return oid
     */
    public long getOid() {
        return oid;
    }


    /**
     * Sets the oid value for this WSSerieVO.
     *
     * @param oid
     */
    public void setOid(long oid) {
        this.oid = oid;
    }


    /**
     * Gets the periodicidade value for this WSSerieVO.
     *
     * @return periodicidade
     */
    public String getPeriodicidade() {
        return periodicidade;
    }


    /**
     * Sets the periodicidade value for this WSSerieVO.
     *
     * @param periodicidade
     */
    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }


    /**
     * Gets the periodicidadeSigla value for this WSSerieVO.
     *
     * @return periodicidadeSigla
     */
    public String getPeriodicidadeSigla() {
        return periodicidadeSigla;
    }


    /**
     * Sets the periodicidadeSigla value for this WSSerieVO.
     *
     * @param periodicidadeSigla
     */
    public void setPeriodicidadeSigla(String periodicidadeSigla) {
        this.periodicidadeSigla = periodicidadeSigla;
    }


    /**
     * Gets the possuiBloqueios value for this WSSerieVO.
     *
     * @return possuiBloqueios
     */
    public boolean isPossuiBloqueios() {
        return possuiBloqueios;
    }


    /**
     * Sets the possuiBloqueios value for this WSSerieVO.
     *
     * @param possuiBloqueios
     */
    public void setPossuiBloqueios(boolean possuiBloqueios) {
        this.possuiBloqueios = possuiBloqueios;
    }


    /**
     * Gets the publica value for this WSSerieVO.
     *
     * @return publica
     */
    public boolean isPublica() {
        return publica;
    }


    /**
     * Sets the publica value for this WSSerieVO.
     *
     * @param publica
     */
    public void setPublica(boolean publica) {
        this.publica = publica;
    }


    /**
     * Gets the shortName value for this WSSerieVO.
     *
     * @return shortName
     */
    public String getShortName() {
        return shortName;
    }


    /**
     * Sets the shortName value for this WSSerieVO.
     *
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }


    /**
     * Gets the ultimoValor value for this WSSerieVO.
     *
     * @return ultimoValor
     */
    public WSValorSerieVO getUltimoValor() {
        return ultimoValor;
    }


    /**
     * Sets the ultimoValor value for this WSSerieVO.
     *
     * @param ultimoValor
     */
    public void setUltimoValor(WSValorSerieVO ultimoValor) {
        this.ultimoValor = ultimoValor;
    }


    /**
     * Gets the unidadePadrao value for this WSSerieVO.
     *
     * @return unidadePadrao
     */
    public String getUnidadePadrao() {
        return unidadePadrao;
    }


    /**
     * Sets the unidadePadrao value for this WSSerieVO.
     *
     * @param unidadePadrao
     */
    public void setUnidadePadrao(String unidadePadrao) {
        this.unidadePadrao = unidadePadrao;
    }


    /**
     * Gets the unidadePadraoIngles value for this WSSerieVO.
     *
     * @return unidadePadraoIngles
     */
    public String getUnidadePadraoIngles() {
        return unidadePadraoIngles;
    }


    /**
     * Sets the unidadePadraoIngles value for this WSSerieVO.
     *
     * @param unidadePadraoIngles
     */
    public void setUnidadePadraoIngles(String unidadePadraoIngles) {
        this.unidadePadraoIngles = unidadePadraoIngles;
    }


    /**
     * Gets the valorDiaNaoUtil value for this WSSerieVO.
     *
     * @return valorDiaNaoUtil
     */
    public boolean isValorDiaNaoUtil() {
        return valorDiaNaoUtil;
    }


    /**
     * Sets the valorDiaNaoUtil value for this WSSerieVO.
     *
     * @param valorDiaNaoUtil
     */
    public void setValorDiaNaoUtil(boolean valorDiaNaoUtil) {
        this.valorDiaNaoUtil = valorDiaNaoUtil;
    }


    /**
     * Gets the valores value for this WSSerieVO.
     *
     * @return valores
     */
    public WSValorSerieVO[] getValores() {
        return valores;
    }


    /**
     * Sets the valores value for this WSSerieVO.
     *
     * @param valores
     */
    public void setValores(WSValorSerieVO[] valores) {
        this.valores = valores;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WSSerieVO)) return false;
        WSSerieVO other = (WSSerieVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.anoFim == other.getAnoFim() &&
                this.anoInicio == other.getAnoInicio() &&
                ((this.aviso == null && other.getAviso() == null) ||
                        (this.aviso != null &&
                                this.aviso.equals(other.getAviso()))) &&
                this.diaFim == other.getDiaFim() &&
                this.diaInicio == other.getDiaInicio() &&
                this.especial == other.isEspecial() &&
                ((this.fonte == null && other.getFonte() == null) ||
                        (this.fonte != null &&
                                this.fonte.equals(other.getFonte()))) &&
                ((this.fullName == null && other.getFullName() == null) ||
                        (this.fullName != null &&
                                this.fullName.equals(other.getFullName()))) &&
                ((this.gestorProprietario == null && other.getGestorProprietario() == null) ||
                        (this.gestorProprietario != null &&
                                this.gestorProprietario.equals(other.getGestorProprietario()))) &&
                this.mesFim == other.getMesFim() &&
                this.mesInicio == other.getMesInicio() &&
                ((this.nomeAbreviado == null && other.getNomeAbreviado() == null) ||
                        (this.nomeAbreviado != null &&
                                this.nomeAbreviado.equals(other.getNomeAbreviado()))) &&
                ((this.nomeCompleto == null && other.getNomeCompleto() == null) ||
                        (this.nomeCompleto != null &&
                                this.nomeCompleto.equals(other.getNomeCompleto()))) &&
                this.oid == other.getOid() &&
                ((this.periodicidade == null && other.getPeriodicidade() == null) ||
                        (this.periodicidade != null &&
                                this.periodicidade.equals(other.getPeriodicidade()))) &&
                ((this.periodicidadeSigla == null && other.getPeriodicidadeSigla() == null) ||
                        (this.periodicidadeSigla != null &&
                                this.periodicidadeSigla.equals(other.getPeriodicidadeSigla()))) &&
                this.possuiBloqueios == other.isPossuiBloqueios() &&
                this.publica == other.isPublica() &&
                ((this.shortName == null && other.getShortName() == null) ||
                        (this.shortName != null &&
                                this.shortName.equals(other.getShortName()))) &&
                ((this.ultimoValor == null && other.getUltimoValor() == null) ||
                        (this.ultimoValor != null &&
                                this.ultimoValor.equals(other.getUltimoValor()))) &&
                ((this.unidadePadrao == null && other.getUnidadePadrao() == null) ||
                        (this.unidadePadrao != null &&
                                this.unidadePadrao.equals(other.getUnidadePadrao()))) &&
                ((this.unidadePadraoIngles == null && other.getUnidadePadraoIngles() == null) ||
                        (this.unidadePadraoIngles != null &&
                                this.unidadePadraoIngles.equals(other.getUnidadePadraoIngles()))) &&
                this.valorDiaNaoUtil == other.isValorDiaNaoUtil() &&
                ((this.valores == null && other.getValores() == null) ||
                        (this.valores != null &&
                                java.util.Arrays.equals(this.valores, other.getValores())));
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
        _hashCode += getAnoFim();
        _hashCode += getAnoInicio();
        if (getAviso() != null) {
            _hashCode += getAviso().hashCode();
        }
        _hashCode += getDiaFim();
        _hashCode += getDiaInicio();
        _hashCode += (isEspecial() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFonte() != null) {
            _hashCode += getFonte().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getGestorProprietario() != null) {
            _hashCode += getGestorProprietario().hashCode();
        }
        _hashCode += getMesFim();
        _hashCode += getMesInicio();
        if (getNomeAbreviado() != null) {
            _hashCode += getNomeAbreviado().hashCode();
        }
        if (getNomeCompleto() != null) {
            _hashCode += getNomeCompleto().hashCode();
        }
        _hashCode += new Long(getOid()).hashCode();
        if (getPeriodicidade() != null) {
            _hashCode += getPeriodicidade().hashCode();
        }
        if (getPeriodicidadeSigla() != null) {
            _hashCode += getPeriodicidadeSigla().hashCode();
        }
        _hashCode += (isPossuiBloqueios() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPublica() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getShortName() != null) {
            _hashCode += getShortName().hashCode();
        }
        if (getUltimoValor() != null) {
            _hashCode += getUltimoValor().hashCode();
        }
        if (getUnidadePadrao() != null) {
            _hashCode += getUnidadePadrao().hashCode();
        }
        if (getUnidadePadraoIngles() != null) {
            _hashCode += getUnidadePadraoIngles().hashCode();
        }
        _hashCode += (isValorDiaNaoUtil() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValores() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getValores());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getValores(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WSSerieVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br", "WSSerieVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anoFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anoInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aviso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aviso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diaFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "especial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fonte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fonte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gestorProprietario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gestorProprietario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mesFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mesInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAbreviado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeAbreviado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCompleto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeCompleto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodicidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicidadeSigla");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodicidadeSigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possuiBloqueios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "possuiBloqueios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimoValor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ultimoValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br", "WSValorSerieVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadePadrao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadePadrao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadePadraoIngles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadePadraoIngles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDiaNaoUtil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorDiaNaoUtil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br", "WSValorSerieVO"));
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
