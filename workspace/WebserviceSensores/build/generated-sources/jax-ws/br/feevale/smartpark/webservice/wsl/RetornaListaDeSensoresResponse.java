
package br.feevale.smartpark.webservice.wsl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte\u00fado esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetornaListaDeSensoresResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retornaListaDeSensoresResult"
})
@XmlRootElement(name = "RetornaListaDeSensoresResponse")
public class RetornaListaDeSensoresResponse {

    @XmlElement(name = "RetornaListaDeSensoresResult")
    protected ArrayOfString retornaListaDeSensoresResult;

    /**
     * Obt\u00e9m o valor da propriedade retornaListaDeSensoresResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRetornaListaDeSensoresResult() {
        return retornaListaDeSensoresResult;
    }

    /**
     * Define o valor da propriedade retornaListaDeSensoresResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRetornaListaDeSensoresResult(ArrayOfString value) {
        this.retornaListaDeSensoresResult = value;
    }

}
