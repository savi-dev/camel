// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ConnectToNetwork request class.
 * <p>
 * @author Eliot J. Kang <eliot@savinetwork.ca>
 * @version 0.4
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "authentication", "uuid",
    "resourcePort", "networkUuid", "xmlString" })
@XmlRootElement(name = "connectToNetworkRequest")
public class ConnectToNetworkRequest {
  @XmlElement(required = true)
  protected SecurityObject authentication;
  protected String uuid;
  @XmlSchemaType(name = "unsignedInt")
  protected int port;
  protected String networkUuid;
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
  public void setAuthentication(SecurityObject authentication) {
    this.authentication = authentication;
  }

  /**
   * Gets the value of the uuid property.
   */
  public String getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the uuid property.
   */
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Gets the value of the port property.
   */
  public int getPort() {
    return port;
  }

  /**
   * Sets the value of the port property.
   */
  public void setPort(int port) {
    this.port = port;
  }

  /**
   * Gets the value of the networkUuid property.
   */
  public String getNetworkUuid() {
    return networkUuid;
  }

  /**
   * Sets the value of the networkUuid property.
   */
  public void setNetworkUuid(String networkUuid) {
    this.networkUuid = networkUuid;
  }

  /**
   * Gets the value of the xmlString property.
   */
  public String getXmlString() {
    return xmlString;
  }

  /**
   * Sets the value of the xmlString property.
   */
  public void setXmlString(String xmlString) {
    this.xmlString = xmlString;
  }
}
