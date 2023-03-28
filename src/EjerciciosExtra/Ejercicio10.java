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
public class Ejercicio10 {

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
        int num, num2,multi, acier, cont = 3;

        num = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        multi = num*num2;
        
        System.out.println("Se ha creado el numero aleatorio del 1 al 10");

        do {
            switch (cont) {
                case 3:
                    System.out.println("¡Adivine! Tiene " + cont + " intentos. Escriba su numero");
                    acier = leer.nextInt();
                    break;
                case 2:
                    System.out.println("¡Vamos! Tiene " + cont + " intentos. No los desperdicie");
                    acier = leer.nextInt();
                    break;
                default:
                    System.out.println("¡Ultimo Intento! ¿Podra acertar?");
                    acier = leer.nextInt();
                    break;
            }
            
            cont--;
        } while ((cont != 0) && (acier != multi));
        
        if (acier==num){
            System.out.println("Usted ha acertado. El numero era: " +num);
        } else 
        {
            System.out.println("Espero la proxima tenga mejor suerte. El numero era: " +num);
        }

    }
}
