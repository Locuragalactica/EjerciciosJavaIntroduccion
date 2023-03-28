/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFinales;

import java.util.Arrays;
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
        Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
         */

///////////////////////// VARIABLES ///////////////////////////////////////////////////////////

        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        /////////////////////////  SCANNER ///////////////////////////////////////////////////////
        Scanner leer = new Scanner(System.in);

        //////////////////////// RELLENO DE MATRIZ ALEATORIO ///////////////////////////////////
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = matriz[j][i];
            }
        }
        //////////////////////// MUESTRA DE MATRIZ ALEATORIO ///////////////////////////////////  

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }

//////////////////////////////// Matriz Traspuesta //////////////////////////////////////////////////
        System.out.println("");
        System.out.println("Matriz Traspuesta");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + -matriz2[i][j] + "] ");
            }
            System.out.println("");
        }

        System.out.println("");

        if (Arrays.deepEquals(matriz, matriz2)) {
            System.out.println("La matriz no es antisimetrica");

        } else {
            System.out.println("La matriz es antisimetrica.");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
