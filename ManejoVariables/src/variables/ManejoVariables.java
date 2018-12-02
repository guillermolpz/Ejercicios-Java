/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author alberto
 */
public class ManejoVariables {
    public static void main(String [] args){
        //Variables boolean, declaracion
        boolean bool1;
        //inicializacion
        bool1 = true;
        //Declaracion e inicializacion
        boolean bool2 = false;
        System.out.println("Valor bool1:" + bool1);
        System.out.println("Valor bool2:" + bool2);
        System.out.println("");
        
        //Variables byte
        byte b1 = 10;
        //Literal en hexadecimal
        byte b2 = 0xa;
        System.out.println("Valor byte1:" + b1);
        System.out.println("Valor byte2:" + b2);
        System.out.println("");
        
        //Variables short
        short s1 = 2;
        System.out.println("Valor short1" + s1);
        System.out.println("");
        
        //Variables char, declaracion e inicializacion en una sola linea
        //La primeradeclaracion es en UNICODE
        //http://www.icursos.net/referencias/TablaUnicode.html
        char ch1 = 65, ch2 = 'A';
        System.out.println("Valor char1:" + ch1);
        System.out.println("Valor char2:" + ch2);
        System.out.println("");
        
        //Variables enteras
        int decimal = 100;
        int octal = 0144;//valor octal inica con 0
        int hexa = 0x64;//valor hexadecimal inicia con 0x
        System.out.println("Valor int decimal:" + decimal);
        System.out.println("Valor int octal:" + octal);
        System.out.println("Valor int hexadeciaml:" + hexa);
        System.out.println("");
        
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1:" + long1);
        System.out.println("Valor long2:" + long2);
        System.out.println("");
        
        //Variables float
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor float1:" + f1);
        System.out.println("Valor float2:" + f2);
        System.out.println("");
        
        //Variables double
        double d1 = 11.0, d2 = 30.15D;
        System.out.println("Valor double1:" + d1);
        System.out.println("Valor double2:" + d1);
        System.out.println("");
    }
}
