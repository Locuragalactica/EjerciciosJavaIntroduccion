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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
        de hijos para averiguar la media de edad de los hijos de todas las familias.
         */

        Scanner leer = new Scanner(System.in);
        int numfam, numhij, edad, sumaedad = 0, sumhijos = 0;
        double promedio;
        
        System.out.println("Por favor, ingrese la cantidad de familias");
        numfam = leer.nextInt();

        for (int i = 0; i < numfam; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia: " + (i + 1));
            numhij = leer.nextInt();
            sumhijos = sumhijos + numhij;

            for (int j = 0; j < numhij; j++) {
                System.out.println("Ingrese la edad del hijo: " + (j + 1));
                edad = leer.nextInt();
                sumaedad = sumaedad + edad;
            }
        }
        promedio = sumaedad / sumhijos;
        System.out.println("El promedio de edad de los " + sumhijos + " hijos de las " + numfam + " familias es de: " + promedio + " años");

    }

}
