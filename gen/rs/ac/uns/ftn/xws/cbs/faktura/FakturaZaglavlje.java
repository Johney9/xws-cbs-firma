
package rs.ac.uns.ftn.xws.cbs.faktura;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FakturaZaglavlje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FakturaZaglavlje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_poruke" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TID"/>
 *         &lt;element name="naziv_dobavljaca" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TNaziv"/>
 *         &lt;element name="adresa_dobavljaca" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TNaziv"/>
 *         &lt;element name="pib_dobavljaca" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TPIB"/>
 *         &lt;element name="naziv_kupca">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="55"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="adresa_kupca">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="55"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pib_kupca" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TPIB"/>
 *         &lt;element name="broj_racuna">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datum_racuna" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="vrednost_robe" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="vrednost_usluga" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="ukupno_roba_i_usluge" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="ukupan_rabat" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="ukupan_porez" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="oznaka_valute" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TSifraValute"/>
 *         &lt;element name="iznos_za_uplatu" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="uplata_na_racun" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TRacun"/>
 *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FakturaZaglavlje", propOrder = {
    "idPoruke",
    "nazivDobavljaca",
    "adresaDobavljaca",
    "pibDobavljaca",
    "nazivKupca",
    "adresaKupca",
    "pibKupca",
    "brojRacuna",
    "datumRacuna",
    "vrednostRobe",
    "vrednostUsluga",
    "ukupnoRobaIUsluge",
    "ukupanRabat",
    "ukupanPorez",
    "oznakaValute",
    "iznosZaUplatu",
    "uplataNaRacun",
    "datumValute"
})
public class FakturaZaglavlje {

    @XmlElement(name = "id_poruke", required = true)
    protected String idPoruke;
    @XmlElement(name = "naziv_dobavljaca", required = true)
    protected String nazivDobavljaca;
    @XmlElement(name = "adresa_dobavljaca", required = true)
    protected String adresaDobavljaca;
    @XmlElement(name = "pib_dobavljaca", required = true)
    protected String pibDobavljaca;
    @XmlElement(name = "naziv_kupca", required = true)
    protected String nazivKupca;
    @XmlElement(name = "adresa_kupca", required = true)
    protected String adresaKupca;
    @XmlElement(name = "pib_kupca", required = true)
    protected String pibKupca;
    @XmlElement(name = "broj_racuna", required = true)
    protected String brojRacuna;
    @XmlElement(name = "datum_racuna", required = true)
    protected Object datumRacuna;
    @XmlElement(name = "vrednost_robe", required = true)
    protected BigDecimal vrednostRobe;
    @XmlElement(name = "vrednost_usluga", required = true)
    protected BigDecimal vrednostUsluga;
    @XmlElement(name = "ukupno_roba_i_usluge", required = true)
    protected BigDecimal ukupnoRobaIUsluge;
    @XmlElement(name = "ukupan_rabat", required = true)
    protected BigDecimal ukupanRabat;
    @XmlElement(name = "ukupan_porez", required = true)
    protected BigDecimal ukupanPorez;
    @XmlElement(name = "oznaka_valute", required = true)
    protected String oznakaValute;
    @XmlElement(name = "iznos_za_uplatu", required = true)
    protected BigDecimal iznosZaUplatu;
    @XmlElement(name = "uplata_na_racun", required = true)
    protected String uplataNaRacun;
    @XmlElement(name = "datum_valute", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumValute;

    /**
     * Gets the value of the idPoruke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPoruke() {
        return idPoruke;
    }

    /**
     * Sets the value of the idPoruke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPoruke(String value) {
        this.idPoruke = value;
    }

    /**
     * Gets the value of the nazivDobavljaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivDobavljaca() {
        return nazivDobavljaca;
    }

    /**
     * Sets the value of the nazivDobavljaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivDobavljaca(String value) {
        this.nazivDobavljaca = value;
    }

    /**
     * Gets the value of the adresaDobavljaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresaDobavljaca() {
        return adresaDobavljaca;
    }

    /**
     * Sets the value of the adresaDobavljaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresaDobavljaca(String value) {
        this.adresaDobavljaca = value;
    }

    /**
     * Gets the value of the pibDobavljaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPibDobavljaca() {
        return pibDobavljaca;
    }

    /**
     * Sets the value of the pibDobavljaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPibDobavljaca(String value) {
        this.pibDobavljaca = value;
    }

    /**
     * Gets the value of the nazivKupca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivKupca() {
        return nazivKupca;
    }

    /**
     * Sets the value of the nazivKupca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivKupca(String value) {
        this.nazivKupca = value;
    }

    /**
     * Gets the value of the adresaKupca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresaKupca() {
        return adresaKupca;
    }

    /**
     * Sets the value of the adresaKupca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresaKupca(String value) {
        this.adresaKupca = value;
    }

    /**
     * Gets the value of the pibKupca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPibKupca() {
        return pibKupca;
    }

    /**
     * Sets the value of the pibKupca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPibKupca(String value) {
        this.pibKupca = value;
    }

    /**
     * Gets the value of the brojRacuna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojRacuna() {
        return brojRacuna;
    }

    /**
     * Sets the value of the brojRacuna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojRacuna(String value) {
        this.brojRacuna = value;
    }

    /**
     * Gets the value of the datumRacuna property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDatumRacuna() {
        return datumRacuna;
    }

    /**
     * Sets the value of the datumRacuna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDatumRacuna(Object value) {
        this.datumRacuna = value;
    }

    /**
     * Gets the value of the vrednostRobe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrednostRobe() {
        return vrednostRobe;
    }

    /**
     * Sets the value of the vrednostRobe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrednostRobe(BigDecimal value) {
        this.vrednostRobe = value;
    }

    /**
     * Gets the value of the vrednostUsluga property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrednostUsluga() {
        return vrednostUsluga;
    }

    /**
     * Sets the value of the vrednostUsluga property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrednostUsluga(BigDecimal value) {
        this.vrednostUsluga = value;
    }

    /**
     * Gets the value of the ukupnoRobaIUsluge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupnoRobaIUsluge() {
        return ukupnoRobaIUsluge;
    }

    /**
     * Sets the value of the ukupnoRobaIUsluge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupnoRobaIUsluge(BigDecimal value) {
        this.ukupnoRobaIUsluge = value;
    }

    /**
     * Gets the value of the ukupanRabat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupanRabat() {
        return ukupanRabat;
    }

    /**
     * Sets the value of the ukupanRabat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupanRabat(BigDecimal value) {
        this.ukupanRabat = value;
    }

    /**
     * Gets the value of the ukupanPorez property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupanPorez() {
        return ukupanPorez;
    }

    /**
     * Sets the value of the ukupanPorez property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupanPorez(BigDecimal value) {
        this.ukupanPorez = value;
    }

    /**
     * Gets the value of the oznakaValute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOznakaValute() {
        return oznakaValute;
    }

    /**
     * Sets the value of the oznakaValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOznakaValute(String value) {
        this.oznakaValute = value;
    }

    /**
     * Gets the value of the iznosZaUplatu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIznosZaUplatu() {
        return iznosZaUplatu;
    }

    /**
     * Sets the value of the iznosZaUplatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIznosZaUplatu(BigDecimal value) {
        this.iznosZaUplatu = value;
    }

    /**
     * Gets the value of the uplataNaRacun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplataNaRacun() {
        return uplataNaRacun;
    }

    /**
     * Sets the value of the uplataNaRacun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplataNaRacun(String value) {
        this.uplataNaRacun = value;
    }

    /**
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

}
