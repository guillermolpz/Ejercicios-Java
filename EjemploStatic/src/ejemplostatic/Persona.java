/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostatic;

/**
 *
 * @author Guillermo Alberto Luna López
 */
public class Persona {
    
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;

    public Persona(String nombre){
        //Cada que creamos un objeto persona incrementamos el contador 
        //para obtener un nuevo idPersona
        contadorPersonas++;
        //asignamos el nuevo valor al idPersona
        idPersona = contadorPersonas;
        //Asignamos el nombre recibido
        this.nombre = nombre;
    }
    
    public String toString(){
        return "Persona[idPersona: " + idPersona + ", nombre: " + nombre + "]";
    }

    public static int getContadorPersonas(){
        return contadorPersonas;
    }   
}
