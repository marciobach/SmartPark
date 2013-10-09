
package br.feevale.smartpark.webservice.wsl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.feevale.smartpark.webservice.wsl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.feevale.smartpark.webservice.wsl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EstadoSensorResponse }
     * 
     */
    public EstadoSensorResponse createEstadoSensorResponse() {
        return new EstadoSensorResponse();
    }

    /**
     * Create an instance of {@link EstadoSensor }
     * 
     */
    public EstadoSensor createEstadoSensor() {
        return new EstadoSensor();
    }

    /**
     * Create an instance of {@link RetornaListaEstados }
     * 
     */
    public RetornaListaEstados createRetornaListaEstados() {
        return new RetornaListaEstados();
    }

    /**
     * Create an instance of {@link RetornaListaEstadosResponse }
     * 
     */
    public RetornaListaEstadosResponse createRetornaListaEstadosResponse() {
        return new RetornaListaEstadosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link RetornaListaDeSensores }
     * 
     */
    public RetornaListaDeSensores createRetornaListaDeSensores() {
        return new RetornaListaDeSensores();
    }

    /**
     * Create an instance of {@link RetornaListaDeSensoresResponse }
     * 
     */
    public RetornaListaDeSensoresResponse createRetornaListaDeSensoresResponse() {
        return new RetornaListaDeSensoresResponse();
    }

}
