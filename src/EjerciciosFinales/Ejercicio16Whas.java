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
public class Ejercicio16Whas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, buscar;

        do {
            System.out.print("Ingrese el tamaño del vector: ");
            N = leer.nextInt();
        } while (N < 1);

        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = (int) (Math.random() * 10);
        }
        System.out.println("VECTOR");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + num[i] + "] ");
        }
        System.out.println("");

        System.out.print("Ingrese número a buscar: ");
        buscar = leer.nextInt();

        int cont = 0, pos = 0;

        for (int i = 0; i < N; i++) {
            if (num[i] == buscar) {
                if (cont == 0) {
                    pos = i;
                }
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println(buscar + " se encuentra en la posición: " + pos);
            // Como funciona ese cont
            System.out.println("¿Se encuentra repetido? " + (cont > 1));
        } else {
            System.out.println(buscar + " no se encuentra.");
        }
    }
}
