
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
 *         &lt;element name="EstadoSensorResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "estadoSensorResult"
})
@XmlRootElement(name = "EstadoSensorResponse")
public class EstadoSensorResponse {

    @XmlElement(name = "EstadoSensorResult")
    protected int estadoSensorResult;

    /**
     * Obt\u00e9m o valor da propriedade estadoSensorResult.
     * 
     */
    public int getEstadoSensorResult() {
        return estadoSensorResult;
    }

    /**
     * Define o valor da propriedade estadoSensorResult.
     * 
     */
    public void setEstadoSensorResult(int value) {
        this.estadoSensorResult = value;
    }

}
