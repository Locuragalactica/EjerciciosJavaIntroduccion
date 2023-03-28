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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.
         */

        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int cont2 = 0;
        float promb = 0, promt = 0;
        System.out.println("Ingrese la cantidad de personas a medir");
        int per = leer.nextInt();

        for (int i = 0; i < per; i++) {
            System.out.println("Ingrese la altura de la persona: " + (i+1) + " en centimetros");
            int alt = leer.nextInt();
            cont2++;
            promt = alt + promt;
            if (alt < 160) {
                cont++;
                promb = alt + promb;
            }

        }

        System.out.println("La cantidad de personas que miden menos de 160 es de: " + cont + ". El promedio de altura de estas es de: " + (promb / cont));
        System.out.println("La cantidad de personas medidas es de: " + cont2 + ". El promedio de altura de todas es de: " + (promt / cont2));
    }

}
