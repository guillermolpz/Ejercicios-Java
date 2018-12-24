/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author alberto
 */
public class PruebaAritmetica {
    public static void main(String args[]){
        //Creamos un objeto de la calse Aritmetica
        Aritmetica a = new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        int resultado = a.sumar(5, 3);
        
        System.out.println("Resultado : " + resultado);
    }
}
