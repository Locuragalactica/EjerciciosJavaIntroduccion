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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        Scanner leer = new Scanner(System.in);
        /*
        Definidor de contadores de cifras
         */
        int un = 0;
        int dos = 0;
        int tre = 0;
        int cua = 0;
        int cin = 0;

        System.out.println("Ingrese el tamaño del vector");

        int N = leer.nextInt();

        /*
        Monstruo generador de aleatorios
         */
        int vector[] = new int[N];

        for (int i = 0; i < N; i++) {

            int num;
            do {
                num = (int) (Math.random() * 10);
            } while (num > 5 || num < 1);

            switch (num) {

                case 1:
                    int ran;
                    ran = (int) (Math.random() * 10);
                    num = ran;
                    break;

                case 2:
                    int ran2;
                    ran2 = (int) (Math.random() * 100);
                    num = ran2;
                    break;

                case 3:
                    int ran3;
                    ran3 = (int) (Math.random() * 1000);
                    num = ran3;
                    break;

                case 4:
                    int ran4;
                    ran4 = (int) (Math.random() * 10000);
                    num = ran4;
                    break;

                case 5:
                    int ran5;
                    ran5 = (int) (Math.random() * 100000);
                    num = ran5;
                    break;

            }
            vector[i] = num;

            if (vector[i] < 10) {
                un = un + 1;
            } else if (vector[i] > 9 && vector[i] < 100) {
                dos = dos + 1;
            } else if (vector[i] > 99 && vector[i] < 1000) {
                tre = tre + 1;
            } else if (vector[i] > 999 && vector[i] < 10000) {
                cua = cua + 1;
            } else if (vector[i] > 9999 && vector[i] < 100000) {
                cin = cin + 1;
            }
        }

        for (int i = 0; i < N; i++) {

            System.out.print("[" + vector[i] + "]");

        }
        System.out.println(" ");
        System.out.println("Hay: " + un + " numeros de una cifra");
        System.out.println("Hay: " + dos + " numeros de dos cifra");
        System.out.println("Hay: " + tre + " numeros de tres cifra");
        System.out.println("Hay: " + cua + " numeros de cuatro cifra");
        System.out.println("Hay: " + cin + " numeros de cinco cifra");

    }

}
