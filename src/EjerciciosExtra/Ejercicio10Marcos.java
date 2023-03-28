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
public class Ejercicio10Marcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa para que el usuario adivine el resultado de una multiplicación entre
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.
        
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Adivine el resultado de la multiplicacion");

        int respuesta = leer.nextInt();
        int multiplicacion;

        int num1 = 1;
        int num2 = (int) (Math.random() * 10);

        //int num1 = 5;
        //int num2 = 5;
        multiplicacion = num1 * num2;

        while (respuesta != multiplicacion) {
            System.out.println("Adivine de nuevo");
            respuesta = leer.nextInt();
        }

        System.out.println("Su respuesta " + respuesta + " es correcta. "
                + "La multiplicacion de " + num1 + " * " + num2 + " : " + multiplicacion);
    }

}
