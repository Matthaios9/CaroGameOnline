
package carogame.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hang" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cot" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hang",
    "cot",
    "type"
})
@XmlRootElement(name = "kiemTraThangRequest")
public class KiemTraThangRequest {

    protected int hang;
    protected int cot;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the hang property.
     * 
     */
    public int getHang() {
        return hang;
    }

    /**
     * Sets the value of the hang property.
     * 
     */
    public void setHang(int value) {
        this.hang = value;
    }

    /**
     * Gets the value of the cot property.
     * 
     */
    public int getCot() {
        return cot;
    }

    /**
     * Sets the value of the cot property.
     * 
     */
    public void setCot(int value) {
        this.cot = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
