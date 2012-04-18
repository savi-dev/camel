package ca.savi.camel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SecurityObject complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="SecurityObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityObject", propOrder = { "string" })
public class SecurityObject {
  @XmlElement(required = true)
  protected String string;

  /**
   * Gets the value of the string property.
   * @return possible object is {@link String }
   */
  public String getString() {
    return string;
  }

  /**
   * Sets the value of the string property.
   * @param value allowed object is {@link String }
   */
  public void setString(String value) {
    this.string = value;
  }
}
