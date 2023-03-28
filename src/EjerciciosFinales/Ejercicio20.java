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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.
         */
//Scanner//

        Scanner leer = new Scanner(System.in);

        // Matriz //
        int magico[][] = new int[3][3];

        // Rellenamos matriz por teclado y presentamos //
        System.out.println("Ingrese los valores correspondientes al cuadrado mágico");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                magico[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + magico[i][j] + "]");

            }
            System.out.println(" ");
        }
        ///////////////////////////////////////

//// (para el for y evitar el engendro) cont desde 0 hasta lenght magico ////
        ///Sumas de matriz///
        int sumaDiag1 = (magico[0][0] + magico[1][1] + magico[2][2]);
        int sumaDiag2 = (magico[0][2] + magico[1][1] + magico[2][0]);
        int sumaFil1 = (magico[0][0] + magico[0][1] + magico[0][2]);
        int sumaFil2 = (magico[1][0] + magico[1][1] + magico[1][2]);
        int sumaFil3 = (magico[2][0] + magico[2][1] + magico[2][2]);
        int sumaCol1 = (magico[0][0] + magico[1][0] + magico[2][0]);
        int sumCol2 = (magico[0][1] + magico[1][1] + magico[2][1]);
        int sumCol3 = (magico[0][2] + magico[1][2] + magico[2][2]);

        if ((sumaDiag1 == 15 && sumaDiag2 == 15 && sumaFil1 == 15 && sumaFil2 == 15 && sumaFil3 == 15 && sumaCol1 == 15 && sumCol2 == 15 && sumCol3 == 15)) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado NO es mágico");
        }
    }
}
