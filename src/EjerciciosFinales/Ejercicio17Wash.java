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
public class Ejercicio17Wash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;

        do {
            System.out.print("Ingrese el tamaño del vector: ");
            N = leer.nextInt();
        } while (N < 1);

        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese un número: ");
            num[i] = leer.nextInt();
        }
        System.out.println("VECTOR");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + num[i] + "] ");
        }
        System.out.println("");

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        for (int i = 0; i < N; i++) {
            if (num[i] >= 0 && num[i] <= 9) {
                c1++;
            } else if (num[i] > 9 && num[i] <= 99) {
                c2++;
            } else if (num[i] > 99 && num[i] <= 999) {
                c3++;
            } else if (num[i] > 999 && num[i] <= 9999) {
                c4++;
            } else if (num[i] > 9999 && num[i] <= 99999) {
                c5++;
            }
        }

        System.out.println("1 Dígito: " + c1);
        System.out.println("2 Dígito: " + c2);
        System.out.println("3 Dígito: " + c3);
        System.out.println("4 Dígito: " + c4);
        System.out.println("5 Dígito: " + c5);
    }

}
