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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido
         */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");

        int N = leer.nextInt();

        int vector[] = new int[N];

        for (int i = 0; i < N; i++) {

            vector[i] = (int) (Math.random() * 10);

        }

        for (int i = 0; i < N; i++) {

            System.out.print("[" + vector[i] + "]");

        }

        System.out.println(" ");

        System.out.println("Indique el numero que quiere buscar en el vector");

        int numBuscar = leer.nextInt();

        for (int i = 0; i < N; i++) {
            if (vector[i] == numBuscar) {
                System.out.println("El valor " + numBuscar + " esta en la posicion: " + (i+1));
            }
        }
    }
}
