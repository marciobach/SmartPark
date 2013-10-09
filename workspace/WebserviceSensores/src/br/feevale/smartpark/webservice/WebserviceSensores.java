/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.feevale.smartpark.webservice;

import br.feevale.smartpark.webservice.wsl.ArrayOfString;
import br.feevale.smartpark.webservice.wsl.SensorsService;
import br.feevale.smartpark.webservice.wsl.SensorsServiceSoap;

/**
 *
 * @author samuel
 */
public class WebserviceSensores {
    
    private static ArrayOfString a;
    
    public static void main(String[] args) {
        
        a = ( retornaListaDeSensores() );
       int i = 0;
       for( String s : a.getString() ) {
           i++;
       }
       
       a = ( retornaListaEstados() );
        
       System.out.println( i );
       
       i = 0;
       for( String s : a.getString() ) {
           System.out.println( s );
       }
       
        System.out.println(  estadoSensor( "9052472" ) );
    }
    
    
    
   public static ArrayOfString retornaListaDeSensores() {
        SensorsService service = new SensorsService();
        SensorsServiceSoap port = service.getSensorsServiceSoap();
        return port.retornaListaDeSensores();
    }

    public static ArrayOfString retornaListaEstados() {
        SensorsService service = new SensorsService();
        SensorsServiceSoap port = service.getSensorsServiceSoap();
        return port.retornaListaEstados();
    }

    public static int estadoSensor(java.lang.String id) {
        SensorsService service = new SensorsService();
        SensorsServiceSoap port = service.getSensorsServiceSoap();
        return port.estadoSensor(id);
    }
   
}
