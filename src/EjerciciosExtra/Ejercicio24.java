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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void calculo(int num) {
        int c = 0;

        Integer[] fibo = new Integer[num];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 0; i < (num); i++) {
            System.out.print("[" + fibo[i] + "]");

            if (i < num - 2) {
                System.out.print(" , ");
                fibo[i + 2] = fibo[i] + fibo[i + 1];

            } else if (i < num - 1) {
                System.out.print(" , ");
            }

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        /*
        Realizar un programa que complete un vector con los N primeros números de la sucesión
        de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
        números:
        0,1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
        La sucesión del número 2 se calcula sumando (1+1)
        Análogamente, la sucesión del número 3 es (1+2),
        Y la del 5 es (2+3),
        Y así sucesivamente…
        La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
        Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
        Fibonaccin = 1 para todo n<=1
        Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
        como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
         */
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros de la secuencia Fibonacci desea ver: ");
        n = leer.nextInt();

        calculo(n);

    }

}
