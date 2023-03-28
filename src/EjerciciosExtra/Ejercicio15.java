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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.
         */

        Scanner leer = new Scanner(System.in);
        int n1, n2, menu;
        System.out.println("Ingrese dos numeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();

        do {
            System.out.println("Bienvenido al Menu:");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    int retorno = sumar(n1, n2);
                    System.out.println("La suma de sus numeros es: " + retorno);
                    break;
                case 2:
                    retorno = restar(n1, n2);
                    System.out.println("La resta de sus numeros es: " + retorno);
                    break;
                case 3:
                    float ret = multip(n1, n2);
                    System.out.println("La multiplicacion de sus numeros es: " + ret);
                    break;
                case 4:
                    ret = div(n1, n2);
                    System.out.println("La division de sus numeros es: " + ret);
                    break;
            }
            System.out.println(" ");
        } while (menu != 5);

    }

    public static int sumar(int n1, int n2) {
        int suma;
        suma = n1 + n2;
        return suma;
    }

    public static int restar(int n1, int n2) {
        int resta;
        resta = n1 - n2;
        return resta;
    }

    public static float multip(int n1, int n2) {
        float multi;
        multi = n1 * n2;
        return multi;
    }

    public static float div(int n1, int n2) {
        float div;
        div = n1 / n2;
        return div;
    }

}
