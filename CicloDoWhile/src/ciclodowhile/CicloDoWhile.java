/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;

/**
 *
 * @author alberto
 */
public class CicloDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int limite = 10;
        do{
            System.out.print("Contador = " + contador);
            contador++;
        } while (contador < limite);
    }
    
}
