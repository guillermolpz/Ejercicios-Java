/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author root
 */
public class PalabraThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p =  new Persona("Juan");
    }
}

class Persona {
    String nombre;//atributo de la clase

    Persona (String nombre){
        this.nombre = nombre; //this es el objeto Persona (actual)

        //Imprimir el objeto persona
        Imprimir i = new Imprimir();
        i.imprimir(this);//this es el objeto Persona (actual)
    }
}

class Imprimir {
    public void imprimir (Object o) {
        System.out.println("Imprimir parametro: " + o);//el parametro es el objeto persona
        System.out.println("Imprimir objeto actual (this): " + this);//this es el objeto imprimir
    }
}
