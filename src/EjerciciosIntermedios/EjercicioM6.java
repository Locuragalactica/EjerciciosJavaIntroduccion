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
public class EjercicioM6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementar un programa que le pida dos números enteros a usuario y determine si ambos o alguno de ellos es mayor a 25.

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos números enteros");

        int num = leer.nextInt();

        int num2 = leer.nextInt();

        if (num > 25 && num2 > 25) {
            System.out.println("Sus números: " + num + " y " + num2 + " son mayores a 25");
        } else if (num > 25) {
            System.out.println("Su número: " + num + " es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("Su número: " + num2 + " es mayor a 25");
        } else {
            System.out.println("Niguno de sus numeros es mayor a 25");
        }
    }

}
