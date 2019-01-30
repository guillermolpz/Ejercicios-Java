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
        Aritmetica obj1 = new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        int resultado = obj1.sumar(5, 3);
       
        System.out.println("Resultado suma directa obj1 : " + resultado);
        
        //Si llamamos directamente el metodo sumar sin argumentos
        //el valor es cero, ya que los atributos del objeto nunca se inicializaron
        //ya que no se uso el constructor con argumentos, si no el constructor vacio
        System.out.println("Resultado suma atributos obj1 : " + obj1.sumar() );
        
        //Ahora creamos un objeto con el constructor con 2 argumentos
        Aritmetica obj2 = new Aritmetica(2, 1);
        
        //IMprimimos directamente el resultado.
        //Al llamar directamente al metodo suma, nos regresa el valor de la suma
        System.out.println("\nResultado suma atributos obj2 : " + obj2.sumar());
    }
}
