//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.16 at 06:45:55 PM CET 
//


package org.w3.ns.corevocabulary.aggregatecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3.ns.corevocabulary.basiccomponents.PeriodOfTimeEndDateType;
import org.w3.ns.corevocabulary.basiccomponents.PeriodOfTimeStartDateType;


/**
 * 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *                &lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;
 *                &lt;ccts:DictionaryEntryName&gt;Period Of Time. Details&lt;/ccts:DictionaryEntryName&gt;
 *                &lt;ccts:Definition&gt;An interval of time that is named or defined by its start and end dates.&lt;/ccts:Definition&gt;
 *                &lt;ccts:ObjectClass&gt;Period Of Time&lt;/ccts:ObjectClass&gt;
 *             &lt;/ccts:Component&gt;
 * </pre>
 * 
 *          
 * 
 * <p>Java class for PeriodOfTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodOfTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/ns/corevocabulary/BasicComponents}PeriodOfTimeStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/corevocabulary/BasicComponents}PeriodOfTimeEndDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodOfTimeType", propOrder = {
    "periodOfTimeStartDate",
    "periodOfTimeEndDate"
})
public class PeriodOfTimeType {

    @XmlElement(name = "PeriodOfTimeStartDate", namespace = "http://www.w3.org/ns/corevocabulary/BasicComponents")
    protected PeriodOfTimeStartDateType periodOfTimeStartDate;
    @XmlElement(name = "PeriodOfTimeEndDate", namespace = "http://www.w3.org/ns/corevocabulary/BasicComponents")
    protected PeriodOfTimeEndDateType periodOfTimeEndDate;

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Period Of Time. Period Of Time_ Start Date. Date&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;The start date of the period.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Period Of Time&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Period Of Time&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Start Date&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link PeriodOfTimeStartDateType }
     *     
     */
    public PeriodOfTimeStartDateType getPeriodOfTimeStartDate() {
        return periodOfTimeStartDate;
    }

    /**
     * Sets the value of the periodOfTimeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOfTimeStartDateType }
     *     
     */
    public void setPeriodOfTimeStartDate(PeriodOfTimeStartDateType value) {
        this.periodOfTimeStartDate = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Period Of Time. Period Of Time_ End Date. Date&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;The end date of the period.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Period Of Time&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Period Of Time&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;End Date&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link PeriodOfTimeEndDateType }
     *     
     */
    public PeriodOfTimeEndDateType getPeriodOfTimeEndDate() {
        return periodOfTimeEndDate;
    }

    /**
     * Sets the value of the periodOfTimeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOfTimeEndDateType }
     *     
     */
    public void setPeriodOfTimeEndDate(PeriodOfTimeEndDateType value) {
        this.periodOfTimeEndDate = value;
    }

}
