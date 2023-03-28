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
public class Ejercicio17 {

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
        int num;
        boolean primo;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        primo = prim(num);
        
        if (primo == false) {
            System.out.println("Su numero no es primo");
        } else {
            System.out.println("Su numero es primo");
        }
    }

    public static boolean prim(int num) {
        boolean primo = true;
        if (num % 2 == 0) {
            primo = false;
        } else if (num % 3 == 0) {
            primo = false;
        } else if (num % 5 == 0) {
            primo = false;
        } else if (num % 7 == 0) {
            primo = false;
        } else if (num<0){
            primo = false;
        }
        
        if (num == 2 || num == 3 || num == 5 || num == 7) {
            primo = true;
        }
        return primo;
    }
}
