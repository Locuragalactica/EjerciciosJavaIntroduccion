/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 *
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
 * el número ingresado seguido de tantos asteriscos como indique su valor. Por
 * ejemplo: 5 ***** 3 *** 11 *********** 2 **
 *
 */
public class EjercicioM10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cont2 = 1;
        do {
            System.out.println("Ingrese un número del 1 al 20");

            int num = leer.nextInt();
            while (num < 1 || num > 20) {
                System.out.println("Incorrecto, Ingrese un número del 1 al 20.");
                num = leer.nextInt();
            }

            System.out.print(num + " ");
            for (int cont = 0; cont < num; cont++) {

                System.out.print(" * ");
            }
            System.out.println(" ");
            cont2++;
        } while (cont2 < 5);
    }
}
