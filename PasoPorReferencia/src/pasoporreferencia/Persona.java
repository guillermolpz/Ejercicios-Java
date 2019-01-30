/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

/**
 *
 * @author alberto
 */
public class Persona {
    String nombre;
    
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
}
