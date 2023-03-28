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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        elementos).
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int cont = 0;
        int[] vec = new int[n];
        int[] vec2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el: " + (i + 1) + " numero de su vector 1");
            vec[i] = leer.nextInt();
            System.out.println("Ingrese el: " + (i + 1) + " numero de su vector 2");
            vec2[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vec[i] != vec2[i]) {
                System.out.println("Sus dos vectores son diferentes");
                break;
            } else {
                cont++;
            }

        }
        if (cont == n) {
            System.out.println("Sus dos vectores son iguales");
        }
    }

}
