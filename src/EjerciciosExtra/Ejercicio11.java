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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
        de división. Nota: recordar que las variables de tipo entero truncan los números o
        resultados.
         */

        Scanner leer = new Scanner(System.in);
        int num, cont = 0;

        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        if (num > 10) {
            do {
                num = num / 10;
                cont++;

            } while (num > 10);
        } 

        cont++;

        System.out.println("Su numero tiene: " +cont + " cifras");

    }

}
