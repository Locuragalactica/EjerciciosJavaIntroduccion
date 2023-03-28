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
public class Ejercicio20 {

    /**
     *
     * @param num
     * @param relleno
     * @return
     */
    public static void relleno(int[] num) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            num[i] = (int) (Math.random() * 10);
        }

    }

    public static void impresion(int[] num) {
        System.out.print("Arreglo = ");
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.print("[" + num[i] + "]");
            } else {
                System.out.print("[" + num[i] + "], ");
            }

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        /*
        Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
        parámetro. Después haremos otra función o procedimiento que imprima el vector.
         */

        int[] num = new int[3];
        relleno(num);
        impresion(num);

    }

}
