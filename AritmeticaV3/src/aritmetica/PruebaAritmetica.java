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
        //Variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica obj1 = new Aritmetica(operandoA, operandoB);
       
        //Imprimimos operandos
        System.out.println("OperandoA : " + operandoA + " y operandoB: " + operandoB);
        
        //Reultado de la suma
        System.out.println("Resultado suma: " + obj1.sumar() );
        //Reultado de la resta
        System.out.println("Resultado resta: " + obj1.restar() );
        //Reultado de la multiplicacion
        System.out.println("Resultado multiplicar: " + obj1.multiplicar() );
        //Reultado de la divicion
        System.out.println("Resultado dividir: " + obj1.dividir() );
        
    }
}
