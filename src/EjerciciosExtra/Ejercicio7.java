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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
        de n números (n>0). El valor de n se solicitará al principio del programa y los números
        serán introducidos por el usuario. Realice dos versiones del programa, una usando el
        bucle “while” y otra con el bucle “do - while”.
         */

        Scanner leer = new Scanner(System.in);
        int n, num, cont = 0, may = 0, men = 0;
        float prom = 0;

        System.out.println("Ingrese la cantidad de numeros");
        n = leer.nextInt();

        while (cont < n) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            prom = prom + num;

            if (cont == 0) {
                may = num;
                men = num;
            } else if (num > may) {
                may = num;
            } else if (num < men) {
                men = num;
            }
            cont++;
        }
        System.out.println("El valor maximo fue: " + may);
        System.out.println("El valor minimo fue: " + men);
        System.out.println("El promedio de sus: " + n + " numeros es de: " + (prom / n));
    }

}
