package ca.savi.camel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "successful", "error", "xmlString" })
@XmlRootElement(name = "rebootResponse")
public class RebootResponse {
  protected boolean successful;
  protected String error;
  protected String xmlString;

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
