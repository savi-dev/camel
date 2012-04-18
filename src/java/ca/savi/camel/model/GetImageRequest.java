package ca.savi.camel.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="authentication" type="{http://xml.netbeans.org/schema/AORResourceSchema}SecurityObject"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storageHttpTuple" type="{http://xml.netbeans.org/schema/AORResourceSchema}StorageHttpTuple" minOccurs="0"/>
 *         &lt;element name="storageHttpFilenames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "authentication", "uuid", "xmlString",
    "storageHttpTuple", "storageHttpFilenames" })
@XmlRootElement(name = "getImageRequest")
public class GetImageRequest {
  @XmlElement(required = true)
  protected SecurityObject authentication;
  protected String uuid;
  protected String xmlString;
  protected StorageHttpTuple storageHttpTuple;
  protected List<String> storageHttpFilenames;

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

  /**
   * Gets the value of the storageHttpFilenames property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the storageHttpFilenames property.
   * <p>
   * For example, to add a new item, do as follows:
   *
   * <pre>
   * getStorageHttpFilenames().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getStorageHttpFilenames() {
    if (storageHttpFilenames == null) {
      storageHttpFilenames = new ArrayList<String>();
    }
    return this.storageHttpFilenames;
  }
}
