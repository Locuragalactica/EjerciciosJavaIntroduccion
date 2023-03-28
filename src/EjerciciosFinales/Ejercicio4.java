/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFinales;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba la cantidad de grados");

        int grad = leer.nextInt();
        
        float trans = 32 + (9 * grad /5);

        System.out.println("Los " +grad + " grados centigrados, son equivalentes a " +trans+ " grados Farenheit");
    }

}
