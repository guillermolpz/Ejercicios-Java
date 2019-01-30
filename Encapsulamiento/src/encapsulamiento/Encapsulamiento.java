/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author alberto
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crearemos el objeto
        Persona p1 = new Persona ("Juan", "Perez", false);
        //Accedemos al atributo nombre
        System.out.println("Nombre de p1: " + p1.getNombre());
        
        //Creamos objeto
        Persona p2 = new Persona("Karla", "Gonzalez", false);
        //Imprimimos el estado completo del objeto
        System.out.println("Estado del objeto p2: " + p2);
        
        //Marcamos como eliminada a la persona
        p2.setBorrado(true);
        //Imprimimos el estado completo del objeto
        System.out.println("Estado del objeto p2: " + p2);
        
        //creamos un  tercer objeto vacio
        Persona p3 = new Persona();
        //Imprimimos el estado completo del objeto
        System.out.println("Estado objeto p3: " + p3);
    }
    
}
