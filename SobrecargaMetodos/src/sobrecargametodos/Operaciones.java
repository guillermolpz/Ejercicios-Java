/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos;

/**
 *
 * @author alberto
 */
public class Operaciones {
    //Metodos sumar 
    public static int sumar(int a, int b){
        System.out.println("metodo sumar (int, int)");
        return a + b;
    }
    //Sobrecarga del metodo sumar
    public static double sumar(double a, double b){
        System.out.println("metodo sumar (double, double)");
        return a + b;
    }
    
    public static double sumar (int a, double b){
        System.out.println("metodo sumar (int, double)");
        return a + b;
    }
    
    public static double sumar(double a, int b){
        System.out.println("metodos sumar (double, int)");
        return a + b;
    }
}
