
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
 *         &lt;element name="RetornaListaEstadosResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "retornaListaEstadosResult"
})
@XmlRootElement(name = "RetornaListaEstadosResponse")
public class RetornaListaEstadosResponse {

    @XmlElement(name = "RetornaListaEstadosResult")
    protected ArrayOfString retornaListaEstadosResult;

    /**
     * Obt\u00e9m o valor da propriedade retornaListaEstadosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRetornaListaEstadosResult() {
        return retornaListaEstadosResult;
    }

    /**
     * Define o valor da propriedade retornaListaEstadosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRetornaListaEstadosResult(ArrayOfString value) {
        this.retornaListaEstadosResult = value;
    }

}
