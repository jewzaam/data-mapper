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
 * <p>Java class for jsonDataFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jsonDataFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="prettyPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="library" type="{http://camel.apache.org/schema/spring}jsonLibrary" />
 *       &lt;attribute name="unmarshalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jsonView" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="include" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowJmsType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="collectionTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useList" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jsonDataFormat")
public class JsonDataFormat
    extends DataFormat
{

    @XmlAttribute(name = "prettyPrint")
    protected Boolean prettyPrint;
    @XmlAttribute(name = "library")
    protected JsonLibrary library;
    @XmlAttribute(name = "unmarshalTypeName")
    protected String unmarshalTypeName;
    @XmlAttribute(name = "jsonView")
    protected String jsonView;
    @XmlAttribute(name = "include")
    protected String include;
    @XmlAttribute(name = "allowJmsType")
    protected Boolean allowJmsType;
    @XmlAttribute(name = "collectionTypeName")
    protected String collectionTypeName;
    @XmlAttribute(name = "useList")
    protected Boolean useList;

    /**
     * Gets the value of the prettyPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrettyPrint() {
        return prettyPrint;
    }

    /**
     * Sets the value of the prettyPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrettyPrint(Boolean value) {
        this.prettyPrint = value;
    }

    /**
     * Gets the value of the library property.
     * 
     * @return
     *     possible object is
     *     {@link JsonLibrary }
     *     
     */
    public JsonLibrary getLibrary() {
        return library;
    }

    /**
     * Sets the value of the library property.
     * 
     * @param value
     *     allowed object is
     *     {@link JsonLibrary }
     *     
     */
    public void setLibrary(JsonLibrary value) {
        this.library = value;
    }

    /**
     * Gets the value of the unmarshalTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmarshalTypeName() {
        return unmarshalTypeName;
    }

    /**
     * Sets the value of the unmarshalTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmarshalTypeName(String value) {
        this.unmarshalTypeName = value;
    }

    /**
     * Gets the value of the jsonView property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonView() {
        return jsonView;
    }

    /**
     * Sets the value of the jsonView property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonView(String value) {
        this.jsonView = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclude(String value) {
        this.include = value;
    }

    /**
     * Gets the value of the allowJmsType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowJmsType() {
        return allowJmsType;
    }

    /**
     * Sets the value of the allowJmsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowJmsType(Boolean value) {
        this.allowJmsType = value;
    }

    /**
     * Gets the value of the collectionTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionTypeName() {
        return collectionTypeName;
    }

    /**
     * Sets the value of the collectionTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionTypeName(String value) {
        this.collectionTypeName = value;
    }

    /**
     * Gets the value of the useList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseList() {
        return useList;
    }

    /**
     * Sets the value of the useList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseList(Boolean value) {
        this.useList = value;
    }

}
