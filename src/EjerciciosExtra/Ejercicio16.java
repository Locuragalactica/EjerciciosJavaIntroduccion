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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
        las personas ingresadas por teclado e indique si son mayores o menores de edad.
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
        mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
         */

        Scanner leer = new Scanner(System.in);
        String nom, dec;
        int edad;

        do {
            System.out.println("Ingrese el nombre de la persona");
            nom = leer.next();
            System.out.println("Ahora ingrese la edad de: " + nom);
            edad = leer.nextInt();

            System.out.println("Usted ha ingresado a: " + nom + " de " + edad + " años de edad.");
            if (edad > 18) {
                System.out.println(nom + " es mayor de edad.");
            } else {
                System.out.println(nom + " es menor de edad.");
            }

            do {
                System.out.println("Usted desea ingresar una nueva persona: si/no ");
                dec = leer.next();
            } while (!dec.equalsIgnoreCase("no") && !dec.equalsIgnoreCase("si"));

        } while (!dec.equalsIgnoreCase("no"));

    }

}
