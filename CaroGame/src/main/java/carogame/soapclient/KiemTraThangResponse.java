
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
 *         &lt;element name="ketQua" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="moTa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quanCo" type="{http://carogameservice/ws}QuanCo"/&gt;
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
    "ketQua",
    "moTa",
    "quanCo"
})
@XmlRootElement(name = "kiemTraThangResponse")
public class KiemTraThangResponse {

    protected boolean ketQua;
    @XmlElement(required = true)
    protected String moTa;
    @XmlElement(required = true)
    protected QuanCo quanCo;

    /**
     * Gets the value of the ketQua property.
     * 
     */
    public boolean isKetQua() {
        return ketQua;
    }

    /**
     * Sets the value of the ketQua property.
     * 
     */
    public void setKetQua(boolean value) {
        this.ketQua = value;
    }

    /**
     * Gets the value of the moTa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * Sets the value of the moTa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoTa(String value) {
        this.moTa = value;
    }

    /**
     * Gets the value of the quanCo property.
     * 
     * @return
     *     possible object is
     *     {@link QuanCo }
     *     
     */
    public QuanCo getQuanCo() {
        return quanCo;
    }

    /**
     * Sets the value of the quanCo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuanCo }
     *     
     */
    public void setQuanCo(QuanCo value) {
        this.quanCo = value;
    }

}
