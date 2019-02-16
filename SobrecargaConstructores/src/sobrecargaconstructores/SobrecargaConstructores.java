/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaconstructores;

/**
 *
 * @author Guillermo Alberto Luna López
 */
public class SobrecargaConstructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //El constructor vacío es privado, por lo que nos obliga a 
        //utilizar el único constructor público y por lo tanto
        //proporcionar valores en los campos de nombre y edad

        Persona p1 = new Persona("Lilia", 22);
        System.out.println("Imprimimos el objeto p1");
        System.out.println(p1);

        //Creamos un nuevo objeto de tipo persona
        Persona p2 = new Persona("Juan", 33);
        System.out.println("\nImprimimos el objeto p2");
        System.out.println(p2);

        //Creamos un objeto empleado
        Empleado e1 = new Empleado("Pedro", 29, 18000);
        System.out.println("\nImprimimos el objeto e1");
        System.out.println(e1);
    }
    
}
