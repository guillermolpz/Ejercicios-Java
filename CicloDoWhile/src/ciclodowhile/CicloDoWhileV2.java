/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class CicloDoWhileV2 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Por favor introduce el número de elementos a iterar:");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in);//Creacion de un objeto Scanner para leer datos
        maxElementos = entradaEscaner.nextInt();//Leemos el valor porporcionado por el usuario
        int contador = 0;
        do{
            System.out.print("Contador = " + contador);
            contador++;
        } while (contador < maxElementos);
    }
}
