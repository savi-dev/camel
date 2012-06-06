// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StorageHttpTuple complex type.
 * <p>
 * @author Eliot J. Kang <eliot@savinetwork.ca>
 * @version 0.4
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageHttpTuple", propOrder = { "fservName", "port", "tid",
    "stringID" })
public class StorageHttpTuple {
  @XmlElement(required = true)
  protected String fservName;
  protected int port;
  @XmlSchemaType(name = "unsignedInt")
  protected long tid;
  @XmlElement(required = true)
  protected String stringID;

  /**
   * Gets the value of the fservName property.
   * @return possible object is {@link String }
   */
  public String getFservName() {
    return fservName;
  }

  /**
   * Sets the value of the fservName property.
   * @param value allowed object is {@link String }
   */
  public void setFservName(String value) {
    this.fservName = value;
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
  public void setPort(int value) {
    this.port = value;
  }

  /**
   * Gets the value of the tid property.
   */
  public long getTid() {
    return tid;
  }

  /**
   * Sets the value of the tid property.
   */
  public void setTid(long value) {
    this.tid = value;
  }

  /**
   * Gets the value of the stringID property.
   * @return possible object is {@link String }
   */
  public String getStringID() {
    return stringID;
  }

  /**
   * Sets the value of the stringID property.
   * @param value allowed object is {@link String }
   */
  public void setStringID(String value) {
    this.stringID = value;
  }
}
