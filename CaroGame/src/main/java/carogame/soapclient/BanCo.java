
package carogame.soapclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BanCo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BanCo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="soHang" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="soCot" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="player" type="{http://carogameservice/ws}Player"/&gt;
 *         &lt;element name="listQuanCo" type="{http://carogameservice/ws}QuanCo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BanCo", propOrder = {
    "soHang",
    "soCot",
    "player",
    "listQuanCo"
})
public class BanCo {

    protected int soHang;
    protected int soCot;
    @XmlElement(required = true)
    protected Player player;
    protected List<QuanCo> listQuanCo;

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

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link Player }
     *     
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link Player }
     *     
     */
    public void setPlayer(Player value) {
        this.player = value;
    }

    /**
     * Gets the value of the listQuanCo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listQuanCo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListQuanCo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuanCo }
     * 
     * 
     */
    public List<QuanCo> getListQuanCo() {
        if (listQuanCo == null) {
            listQuanCo = new ArrayList<QuanCo>();
        }
        return this.listQuanCo;
    }

}
