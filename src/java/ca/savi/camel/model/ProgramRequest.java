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
@XmlType(name = "", propOrder = { "authentication", "uuid", "xmlString",
    "storageHttpTuple" })
@XmlRootElement(name = "programRequest")
public class ProgramRequest {
  @XmlElement(required = true)
  protected SecurityObject authentication;
  protected String uuid;
  protected String xmlString;
  protected StorageHttpTuple storageHttpTuple;

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
   * Gets the value of the uuid property.
   * @return possible object is {@link String }
   */
  public String getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the uuid property.
   * @param value allowed object is {@link String }
   */
  public void setUuid(String value) {
    this.uuid = value;
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
   * Gets the value of the storageHttpTuple property.
   * @return possible object is {@link StorageHttpTuple }
   */
  public StorageHttpTuple getStorageHttpTuple() {
    return storageHttpTuple;
  }

  /**
   * Sets the value of the storageHttpTuple property.
   * @param value allowed object is {@link StorageHttpTuple }
   */
  public void setStorageHttpTuple(StorageHttpTuple value) {
    this.storageHttpTuple = value;
  }
}
