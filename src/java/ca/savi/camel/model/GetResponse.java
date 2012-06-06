// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlType(name = "", propOrder = { "uuidList", "successful", "error",
    "xmlString" })
@XmlRootElement(name = "getResponse")
public class GetResponse {
  protected List<String> uuidList;
  protected boolean successful;
  protected String error;
  protected String xmlString;

  /**
   * Gets the value of the uuidList property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the uuidList property.
   * <p>
   * For example, to add a new item, do as follows:
   *
   * <pre>
   * getUuidList().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getUuidList() {
    if (uuidList == null) {
      uuidList = new ArrayList<String>();
    }
    return this.uuidList;
  }

  /**
   * Gets the value of the successful property.
   */
  public boolean isSuccessful() {
    return successful;
  }

  /**
   * Sets the value of the successful property.
   */
  public void setSuccessful(boolean value) {
    this.successful = value;
  }

  /**
   * Gets the value of the error property.
   * @return possible object is {@link String }
   */
  public String getError() {
    return error;
  }

  /**
   * Sets the value of the error property.
   * @param value allowed object is {@link String }
   */
  public void setError(String value) {
    this.error = value;
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
}
