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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un número");

        int num = leer.nextInt();

        int doble = num * 2;

        int triple = num * 3;

        System.out.println(doble);
        System.out.println(triple);
        System.out.println(Math.sqrt(num));
    }

}
