//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 02:37:57 PM EST 
//


package org.jboss.mapper.camel.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for batchResequencerConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="batchResequencerConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}resequencerConfig">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="batchSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="batchTimeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="allowDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="reverse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreInvalidExchanges" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batchResequencerConfig")
public class BatchResequencerConfig
    extends ResequencerConfig
{

    @XmlAttribute(name = "batchSize")
    protected Integer batchSize;
    @XmlAttribute(name = "batchTimeout")
    protected Long batchTimeout;
    @XmlAttribute(name = "allowDuplicates")
    protected Boolean allowDuplicates;
    @XmlAttribute(name = "reverse")
    protected Boolean reverse;
    @XmlAttribute(name = "ignoreInvalidExchanges")
    protected Boolean ignoreInvalidExchanges;

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the batchTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchTimeout() {
        return batchTimeout;
    }

    /**
     * Sets the value of the batchTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchTimeout(Long value) {
        this.batchTimeout = value;
    }

    /**
     * Gets the value of the allowDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDuplicates() {
        return allowDuplicates;
    }

    /**
     * Sets the value of the allowDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDuplicates(Boolean value) {
        this.allowDuplicates = value;
    }

    /**
     * Gets the value of the reverse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverse() {
        return reverse;
    }

    /**
     * Sets the value of the reverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverse(Boolean value) {
        this.reverse = value;
    }

    /**
     * Gets the value of the ignoreInvalidExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreInvalidExchanges() {
        return ignoreInvalidExchanges;
    }

    /**
     * Sets the value of the ignoreInvalidExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreInvalidExchanges(Boolean value) {
        this.ignoreInvalidExchanges = value;
    }

}
