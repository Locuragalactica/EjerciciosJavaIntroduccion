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
public class Ejercicio23 {

    /**
     * @param palabras
     * @param args the command line arguments
     * @return
     */
    //FUNCION PARA EL INGRESO DE PALABRAS//
    public static String ingresoPalabras() {
        Scanner leer = new Scanner(System.in);
        boolean vali = false;
        String palabra;
        do {
            palabra = leer.next().toLowerCase();
            if (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Ingrese unicamente palabras de 3 a 5 caracteres");
            } else {
                vali = true;
            }
        } while (vali == false);

        return palabra;
    }

    public static void rellenosopa(String palabra) {
        String[][] sopaL = new String[20][20];

        int cont = 0, f, c;
        boolean relleno = true;

        //RELLENO DE MATRIZ//
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopaL[i][j] = "*";
            }
        }

        //DESARROLLO SOPA DE LETRAS//
        do {
            cont++;
            System.out.println("Ingrese la palabra N°: " + cont);

            //LLAMADO DE FUNCION DE INGRESO DE PALABRAS//
            String pal = ingresoPalabras();

            //ASIGNACIÓN DE ESPACIO A LETRAS DE PALABRA//
            do {
                //FILA Y COLUMNA ALEATORIA//
                c = (int) (Math.random() * (19 - pal.length()));//
                f = (int) (Math.random() * 19);
                //CORROBORACION DE ESPACIO VACIO//
                for (int i = c; i <= c + pal.length(); i++) {
                    if (sopaL[f][i].equals("*")) {
                        relleno = false;
                    } else {
                        relleno = true;
                        break;
                    }
                }
                if (relleno == false) {
                    int pos = 0;
                    for (int i = c; i < (c + pal.length()); i++) {
                        sopaL[f][i] = pal.substring(pos, pos + 1);

                        pos += 1;
                    }
                }
            } while (relleno == true);

        } while (cont < 10);

        //IMPRESIÓN DE SOPA DE LETRAS//
       for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaL[i][j].equals("*")) {
                    sopaL[i][j] = String.valueOf((int) (Math.random() * 10));
                }
                System.out.print(sopaL[i][j] + " ");
            }
            System.out.println("");
        }
       
       //IMPRESIÓN CON ASTERISCTOS DE PRUEBA//
        /*for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
 
                System.out.print(sopaL[i][j] + " ");
            }
            System.out.println("");
        }*/
    }

    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().
         */

        //LLAMADO DE FUNCIÓN//      
        System.out.println("Usted desarrollara una sopa de letras.");
        System.out.println("Unicamente seran validas palabras de 3 a 5 caracteres");
        System.out.println(" ");
        String pal = "";
        rellenosopa(pal);

    }
}
