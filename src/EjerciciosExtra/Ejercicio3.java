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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
         */

        Scanner read = new Scanner(System.in);
        char letra;
        System.out.println("Ingrese una letra.");
        letra = read.next().charAt(0);
        String let = String.valueOf(letra);

        if (let.equalsIgnoreCase("a") || let.equalsIgnoreCase("e") || let.equalsIgnoreCase("i") || let.equalsIgnoreCase("o") || let.equalsIgnoreCase("u")) {
            System.out.println("Su caracter es una vocal");
        } else {
            System.out.println("Su caracter no es una vocal");
        }

    }

}
