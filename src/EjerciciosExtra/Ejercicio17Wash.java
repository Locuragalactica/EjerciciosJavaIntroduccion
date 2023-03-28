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
public class Ejercicio17Wash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es
        primo, sino false.
         */
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();
        boolean retorno = esPrimo(num);
        System.out.println("¿El número " + num + " es primo? " + retorno);
    }

    public static boolean esPrimo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) { // 1-100
            if (num % i == 0) {
                cont++;
            }
            if (cont > 2) {
                break;
            }
        }
        return (cont == 2);
    }

}
