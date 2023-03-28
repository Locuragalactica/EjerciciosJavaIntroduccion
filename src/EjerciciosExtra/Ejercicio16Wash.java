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
public class Ejercicio16Wash {

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
        System.out.print("Ingrese la cantidad de personas: ");
        int N = leer.nextInt();
        String nombre;
        int edad;
        String[][] datos = new String[N][2];
        for (int i = 0; i < N; i++) {
            person(i, N, datos);
        }
        String opc;
        for (int i = 0; i < N; i++) {
            nombre = datos[i][0];
            edad = Integer.valueOf(datos[i][1]);
            System.out.println("PERSONA #" + (i + 1));
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            if (edad >= 18) {
                System.out.println("Mayor de edad");
            } else {
                System.out.println("Menor de edad");
            }
            if (i == N - 1) {
                break;
            }
            System.out.print("¿Deseas seguir visualizando? (S/N) ");
            do {
                opc = leer.next();
                if (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                    System.out.println("Ingrese una opción válida!!!!!!");
                }
            } while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N"));
            if (opc.equalsIgnoreCase("N")) {
                System.out.println("FINALIZADO!!");
                break;
            }
        }
    }

    public static String[][] person(int i, int N, String[][] datos) {
        Scanner leer = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Ingrese su nombre: ");
        name = leer.next();
        System.out.print("Ingrese su edad: ");
        age = leer.nextInt();
        datos[i][0] = name;
        datos[i][1] = String.valueOf(age);
        return datos;
    }
}
