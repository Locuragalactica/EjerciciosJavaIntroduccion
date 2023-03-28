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
public class Ejercicio21B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
        adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
        prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
        programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
        igual al 7 de sus notas del curso.
         */
        int cont = 0, cont2 = 0;
        float[][] notas = new float[2][5];
        String[] nombres = new String[2];
        nombres[0] = "Pablo";
        nombres[1] = "Juan";
        /* nombres[2] = "Raul";
        nombres[3] = "Felipe";
        nombres[4] = "Nicolas";
        nombres[5] = "Viviana";
        nombres[6] = "Paola";
        nombres[7] = "Casandra";
        nombres[8] = "Joaquina";
        nombres[9] = "Sandra";*/

        notas(notas, nombres);

        for (int i = 0; i < 2; i++) {
            if (notas[i][4] < 7) {
                cont++;
            } else {
                cont2++;
            }
        }
        System.out.println("La cantidad de alumnos desaprobados es: " + cont + ". La cantidad de alumnos aprobados es: " + cont2);
    }

    public static float[][] notas(float[][] notas, String[] nombres) {
        Scanner leer = new Scanner(System.in);
        float promedio;
        int cont = 1;

        for (int j = 0; j < 2; j++) {
            System.out.println("Ingrese las notas de: " + nombres[j]);
            promedio = 0;
            for (int k = 0; k < 5; k++) {
                if (k == 0) {
                    System.out.println("Trabajo Practico: " + (k + 1));
                    notas[j][k] = leer.nextInt();
                    promedio += ((notas[j][k]) * 0.10);
                } else if (k == 1) {
                    System.out.println("Trabajo Practico: " + (k + 1));
                    notas[j][k] = leer.nextInt();
                    promedio += ((notas[j][k]) * 0.15);
                } else if (k == 2) {
                    System.out.println("Parcial " + cont);
                    notas[j][k] = leer.nextInt();
                    promedio += ((notas[j][k]) * 0.25);
                    cont++;
                } else if (k == 3) {
                    System.out.println("Parcial: " + cont);
                    notas[j][k] = leer.nextInt();
                    promedio += notas[j][k] * 0.5;
                } else {
                    notas[j][k] = promedio;
                }
            }
        }
        String[] titulos = new String[6];
        titulos[0] = "Nombres     ";
        titulos[1] = "      TP1";
        titulos[2] = "      TP2";
        titulos[3] = "      1er Int";
        titulos[4] = "      2do Int ";
        titulos[5] = "   Prom ";

        for (int i = 0; i < 6; i++) {
            System.out.print(titulos[i]);

        }
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            System.out.print(nombres[i] + "             ");
            for (int j = 0; j < 5; j++) {

                System.out.print("[" + notas[i][j] + "]" + "     ");
            }
            System.out.println(" ");
        }
        return notas;
    }
}
