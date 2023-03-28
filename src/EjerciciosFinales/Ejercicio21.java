/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFinales;

/**
 *
 * @author felip
 */
public class Ejercicio21 {

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

        //DECLARACIÓN DE VARIABLES//
        int matriz[][] = new int[10][10];
        int submatriz[][] = new int[3][3];
        int cont = 0, cont2 = 0, i, j, k, l, aux = 0, aux2 = 0;

        //RELLENO DE MATRICES//
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 2) + 1;
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                submatriz[i][j] = (int) (Math.random() * 2) + 1;
            }
        }
        //IMPRESIÓN DE MATRICES//
        System.out.println("Matriz Grande");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("Matriz Pequeña");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("[" + submatriz[i][j] + "] ");
            }
            System.out.println("");
        }
        // BUSCAR EL PRIMER ELEMENTO DE LA SUB MATRIZ//
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                // EXCLUSIÓN DE LAS 2 LINEAS FINALES //
                if (i == 8 || j == 8 || i == 9 || j == 9) {
                    break;
                } else if (submatriz[0][0] == matriz[i][j]) {
                    cont = 0;
                    for (k = 0; k < 3; k++) {
                        for (l = 0; l < 3; l++) {
                            if (submatriz[k][l] == matriz[(i + k)][(j + l)]) {
                                cont++;
                                aux = i + k;
                                aux2 = j + l;
                                if (cont == 9) {
                                    cont2 = cont;
                                    cont = 0;

                                }
                            }
                        }
                    }
                }
            }
        }
        if (cont == 9 || cont2
                == 9) {
            System.out.println("La matriz pequeña se encuentra contenida en la grande");
            System.out.println("La posición de la matriz pequeña es: ");
            for (int m = 0; m < 3; m++) {
                for (int n = 0; n < 3; n++) {

                    if (m == 2 && n == 2) {
                        System.out.print((aux + m) + "," + (aux2 + n));
                    } else {
                        System.out.print((aux + m) + "," + (aux2 + n) + " - ");
                    }
                }
                System.out.print("");
            }
        } else {
            System.out.println("La matriz pequeña no se encuentra contenida en la grande");
        }
        System.out.println(" ");
    }

}
