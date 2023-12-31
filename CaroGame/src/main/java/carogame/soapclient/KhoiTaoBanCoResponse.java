
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
 *         &lt;element name="banCo" type="{http://carogameservice/ws}BanCo"/&gt;
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
    "banCo"
})
@XmlRootElement(name = "khoiTaoBanCoResponse")
public class KhoiTaoBanCoResponse {

    protected boolean ketQua;
    @XmlElement(required = true)
    protected String moTa;
    @XmlElement(required = true)
    protected BanCo banCo;

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
     * Gets the value of the banCo property.
     * 
     * @return
     *     possible object is
     *     {@link BanCo }
     *     
     */
    public BanCo getBanCo() {
        return banCo;
    }

    /**
     * Sets the value of the banCo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BanCo }
     *     
     */
    public void setBanCo(BanCo value) {
        this.banCo = value;
    }

}
