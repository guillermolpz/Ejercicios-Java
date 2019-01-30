/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class CicloForV2 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Por favor introduce el número de elementos a iterar:");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in);//Creacion de un objeto Scanner para leer datos
        maxElementos = entradaEscaner.nextInt();//Leemos el valor porporcionado por el usuario
        for (int contador = 0; contador < maxElementos; contador++){
            System.out.println("Contador = " + contador);
        }
    }
}
