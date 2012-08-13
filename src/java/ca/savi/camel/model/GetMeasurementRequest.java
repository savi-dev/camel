// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * @author Eliot J. Kang <eliot@savinetwork.ca>
 * @version 0.4
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "authentication", "resourceType",
"measurementUUID", "xmlString" })
@XmlRootElement(name = "getMeasurementRequest")
public class GetMeasurementRequest {
  @XmlElement(required = true)
  protected SecurityObject authentication;
  @XmlElement(required = true)
  protected String resourceType;
  protected String measurementUUID;
  protected String xmlString;

  /**
   * Gets the value of the authentication property.
   * @return possible object is {@link SecurityObject }
   */
  public SecurityObject getAuthentication() {
    return authentication;
  }

  /**
   * Sets the value of the authentication property.
   * @param value allowed object is {@link SecurityObject }
   */
  public void setAuthentication(SecurityObject value) {
    this.authentication = value;
  }

  /**
   * Gets the value of the measurementUUID property.
   * @return possible object is {@link String }
   */
  public String getMeasurementUUID() {
    return measurementUUID;
  }

  /**
   * Sets the value of the measurementUUID property.
   * @param value allowed object is {@link String }
   */
  public void setMeasurementUUID(String value) {
    this.measurementUUID = value;
  }

  /**
   * Gets the value of the xmlString property.
   * @return possible object is {@link String }
   */
  public String getXmlString() {
    return xmlString;
  }

  /**
   * Sets the value of the xmlString property.
   * @param value allowed object is {@link String }
   */
  public void setXmlString(String value) {
    this.xmlString = value;
  }

  /**
   * Gets the value of the resourceType property.
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Sets the value of the resourceType property.
   */
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }
}
