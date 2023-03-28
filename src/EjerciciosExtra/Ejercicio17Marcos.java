/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Ejercicio17Marcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es
        primo, sino false.
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para indicar si es primo o no");

        int num = leer.nextInt();

        esPrimo(num);

    }

    public static void esPrimo(int num) {

        if (num > 1) {
            boolean esPrimo = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(num + " es un número primo");
            } else {
                System.out.println(num + " no es un número primo");
            }
        } else {
            System.out.println(num + " no es un número primo");
        }

    }
}
