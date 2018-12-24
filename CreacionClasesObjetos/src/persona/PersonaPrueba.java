/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author alberto
 */
public class PersonaPrueba {
    public static void main(String[] args){
        //Creacion de un objeto
        Persona p1 = new Persona();
        
        //Llamamos a un metodo del objeto creado
        System.out.println("Valor por default del objeto persona");
        p1.desplegarNombre();
        
        //Modificar valores
        p1.nombre = "Alberto";
        p1.apellidoPaterno = "Luna";
        p1.apellidoMaterno = "Lopez";
        
        //Valvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto Persona");
        p1.desplegarNombre();
    }
}
