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
public class Ejercicio21Wash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        la matriz M en la cual empieza el primer elemento de la submatriz P.
        Ejemplo:
        Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
        4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
         */

        Scanner leer = new Scanner(System.in);
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        System.out.println("MATRIZ M");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("MATRIZ P");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matrizP[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println("");
        }

        int cont = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizP[0][0] == matrizM[i][j]) {
                    cont++;
                }
            }
        }

        int[][] pos = new int[cont][2];
        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizP[0][0] == matrizM[i][j]) {
                    pos[x][y] = i;
                    y++;
                    pos[x][y] = j;
                    y = 0;
                    x++;
                }
            }
        }
        boolean cond = true;
        int k = 0;
        for (int i = 0; i < cont; i++) {
            cond = true;
            x = pos[i][0]; //0
            y = pos[i][1]; //3
            int c = 0;
            int d = 0;
            if (x <= 7 && y <= 7) {
                for (int a = x; a < x + 3; a++) { //a = 0 ; a<3; a++
                    for (int b = y; b < y + 3; b++) { // b = 3; b < 6; b++
                        if (matrizM[a][b] != matrizP[c][d]) {
                            cond = false;
                        }
                        d++;
                    }
                    d = 0;
                    c++;
                }
            } else {
                cond = false;
            }
            if (cond == true) {
                System.out.println("LA MATRIZ P SE ENCUENTRA EN LAS SIGUIENTES COORDENADAS: ");
                for (int a = x; a < x + 3; a++) { //a = 0 ; a<2; a++
                    for (int b = y; b < y + 3; b++) { // b = 3; b < 5; b++
                        System.out.print("[" + a + "," + b + "] ");
                    }
                    System.out.println("");
                }
                k = 1;
            }
        }
        if (cond == false && k == 0) {
            System.out.println("No se encontró en la matriz M.");
        }
    }

}
