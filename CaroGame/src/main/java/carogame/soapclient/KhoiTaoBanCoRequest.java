
package carogame.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="soHang" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="soCot" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "soHang",
    "soCot"
})
@XmlRootElement(name = "khoiTaoBanCoRequest")
public class KhoiTaoBanCoRequest {

    protected int soHang;
    protected int soCot;

    /**
     * Gets the value of the soHang property.
     * 
     */
    public int getSoHang() {
        return soHang;
    }

    /**
     * Sets the value of the soHang property.
     * 
     */
    public void setSoHang(int value) {
        this.soHang = value;
    }

    /**
     * Gets the value of the soCot property.
     * 
     */
    public int getSoCot() {
        return soCot;
    }

    /**
     * Sets the value of the soCot property.
     * 
     */
    public void setSoCot(int value) {
        this.soCot = value;
    }

}
