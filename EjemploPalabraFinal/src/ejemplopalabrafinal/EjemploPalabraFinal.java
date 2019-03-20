/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopalabrafinal;

/**
 *
 * @author alberto
 */
public class EjemploPalabraFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Marca error, no se puede modificar el valor de una variable final
        //ClaseFinal.persona = 10;
        
        //No es posible cambiar la refEjeerencia de la variable persona
        //ClaseFinal.persona = new Persona();
        
        System.out.println("Nombre persona:" + ClaseFinal.persona.getNombre());
        
        //Pero si es posible cambiar el estado del objeto
        //referenciado por la variable persona
        ClaseFinal.persona.setNombre("Otro");
        
        System.out.println("Nombre persona:" + ClaseFinal.persona.getNombre());

    }
    
}
