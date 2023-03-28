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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
         */
        Scanner leer = new Scanner(System.in);
        double euros;
        String mon;
        System.out.println("Ingrese la cantidad de euros: ");
        euros = leer.nextDouble();
        System.out.println("Libras, dolares, yenes: ");
        mon = leer.next().toLowerCase();

        cambio(euros, mon);
    }

    public static void cambio(double euros, String mon) {

        switch (mon) {
            case "libras":
                System.out.println("El cambio en libras es: " + (euros * 0.86));
                break;
            case "yenes":
                System.out.println("El cambio en yenes es: " + (euros * 129.852));
                break;
            case "dolares":
                System.out.println("El cambio en dolares es: " + (euros * 1.28611));
                break;

        }

    }
}
