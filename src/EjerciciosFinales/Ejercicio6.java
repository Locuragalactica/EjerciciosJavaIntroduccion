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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que dado un numero determine si es par o impar.
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un número");
        int num = leer.nextInt();
        if (num % 2 != 0) {
            System.out.println("Su número es impar");
        } else {
            System.out.println("Su numero es par");
        }

    }

}
