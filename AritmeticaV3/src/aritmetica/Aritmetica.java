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
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    //Recordar que si agrgamos un constructor distinto al vacio
    //ya no debemos crear este constructor y nosotors debemos crearlo si lo necesitamos
    Aritmetica(){}
    
    
    //Constructor con 2 argumentos
    Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
    }
    
    //Este metodo toma nuevos valores
    int sumar(int a, int b){
        return a + b;
    }
    
    //Este metodo toma los atributos de la clase para hacer la suma
    int sumar(){
        return a + b;
    }
    //Método restar
    int restar(){
        return a - b;
    }
    //Metodo multiplicar
    int multiplicar(){
        return a * b;
    }
    //Método dividir
    int dividir(){
        return a / b;
    }
}
