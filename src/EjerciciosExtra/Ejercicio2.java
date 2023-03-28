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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
        tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
         */

        Scanner leer = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("Ingrese el valor de A");
        a = leer.nextInt();
        System.out.println("Ingrese el valor de B");
        b = leer.nextInt();
        System.out.println("Ingrese el valor de C");
        c = leer.nextInt();
        System.out.println("Ingrese el valor de D");
        d = leer.nextInt();

        e = a;
        a = d;
        d = b;
        b = c;
        c = e;

        System.out.println("El valor inicial de A es: " + e + ". Y su valor vinal es: " + a);
        System.out.println("El valor inicial de B es: " + d + ". Y su valor vinal es: " + b);
        System.out.println("El valor inicial de C es: " + b + ". Y su valor vinal es: " + c);
        System.out.println("El valor inicial de d es: " + a + ". Y su valor vinal es: " + d);
    }

}
