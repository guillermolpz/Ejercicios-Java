/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculames;

/**
 *
 * @author alberto
 */
public class CalculaMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes = 1; //Mes del año
        String estacion;
        
        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }else{
            estacion = "Mes incorrecto";
        }
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
    }
    
}
