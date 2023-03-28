/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class EjercicioM9A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escriba un programa que lea 20 números. Si el número leído es igual a
         * cero se debe salir del bucle y mostrar el mensaje "Se capturó el
         * numero cero". El programa deberá calcular y mostrar el resultado de
         * la suma de los números leídos, pero si el número es negativo no debe
         * sumarse. Nota: recordar el uso de la sentencia break.
         */

        Scanner leer = new Scanner(System.in);
        int num;
        int suma = 0;
        int i = 0;

        do {
            System.out.println("Por favor ingrese 4 números");
            num = leer.nextInt();

            if (num > 0) {
                suma = num + suma;
                i++;
            } else if (num < 0) {
                i++;
            } else {
                System.out.println("Usted ha ingresado 0");
                break;
            }
        } while (i < 4);

        System.out.println("La suma de sus numeros es: " + suma);

    }

}
