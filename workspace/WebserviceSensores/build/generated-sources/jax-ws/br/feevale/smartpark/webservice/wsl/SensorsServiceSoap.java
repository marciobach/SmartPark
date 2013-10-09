
package br.feevale.smartpark.webservice.wsl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SensorsServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SensorsServiceSoap {


    /**
     * 
     * @return
     *     returns br.feevale.smartpark.webservice.wsl.ArrayOfString
     */
    @WebMethod(operationName = "RetornaListaDeSensores", action = "http://tempuri.org/RetornaListaDeSensores")
    @WebResult(name = "RetornaListaDeSensoresResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornaListaDeSensores", targetNamespace = "http://tempuri.org/", className = "br.feevale.smartpark.webservice.wsl.RetornaListaDeSensores")
    @ResponseWrapper(localName = "RetornaListaDeSensoresResponse", targetNamespace = "http://tempuri.org/", className = "br.feevale.smartpark.webservice.wsl.RetornaListaDeSensoresResponse")
    public ArrayOfString retornaListaDeSensores();

    /**
     * 
     * @param id
     * @return
     *     returns int
     */
    @WebMethod(operationName = "EstadoSensor", action = "http://tempuri.org/EstadoSensor")
    @WebResult(name = "EstadoSensorResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EstadoSensor", targetNamespace = "http://tempuri.org/", className = "br.feevale.smartpark.webservice.wsl.EstadoSensor")
    @ResponseWrapper(localName = "EstadoSensorResponse", targetNamespace = "http://tempuri.org/", className = "br.feevale.smartpark.webservice.wsl.EstadoSensorResponse")
    public int estadoSensor(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        String id);

    /**
     * 
     * @return
     *     returns br.feevale.smartpark.webservice.wsl.ArrayOfString
     */
    @WebMethod(operationName = "RetornaListaEstados", action = "http://tempuri.org/RetornaListaEstados")
    @WebResult(name = "RetornaListaEstadosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RetornaListaEstados", targetNamespace = "http://tempuri.org/", className = "br.feevale.smartpark.webservice.wsl.RetornaListaEstados")
    @ResponseWrapper(localName = "RetornaListaEstadosResponse", targetNamespace = "http://tempuri.org/", className = "br.feevale.smartpark.webservice.wsl.RetornaListaEstadosResponse")
    public ArrayOfString retornaListaEstados();

}
