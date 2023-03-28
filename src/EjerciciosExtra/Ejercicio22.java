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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
        muestre la suma de sus elementos.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las dos dimenciones de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int suma = 0;

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
                System.out.print( "[" +matriz[i][j]+"]");

            }
            System.out.println(" ");
        }
        System.out.println("La suma de la matriz es: "+suma);
    }

}
