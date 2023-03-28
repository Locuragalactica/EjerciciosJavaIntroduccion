/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Ejercicio10A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e
         * imprima el número ingresado seguido de tantos asteriscos como indique
         * su valor. Por ejemplo: 5 ***** 3 *** 11 *********** 2 **
         *
         */
        Scanner leer = new Scanner(System.in);

        int n, n2, n3, n4;

        System.out.println("Por favor ingrese cuatro números");
        n = leer.nextInt();
        n2 = leer.nextInt();
        n3 = leer.nextInt();
        n4 = leer.nextInt();

        System.out.print(n + " ");

        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
        System.out.println("");
        System.out.print(n2 + " ");
        for (int i = 0; i < n2; i++) {
            System.out.print(" * ");
        }
        System.out.println("");
        System.out.print(n3 + " ");

        for (int i = 0; i < n3; i++) {
            System.out.print(" * ");
        }
        System.out.println("");
        System.out.print(n4 + " ");
        for (int i = 0; i < n4; i++) {
            System.out.print(" * ");
        }
        System.out.println("");

    }

}
