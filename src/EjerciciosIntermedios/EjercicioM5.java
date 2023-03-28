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
public class EjercicioM5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Verdadero o Falso");
        boolean dec = leer.nextBoolean();
        System.out.println("Ingrese un número con decimales");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese un caracter");
        char c = leer.next().charAt(0);
        
        System.out.println(dec +" " + num1 + " "+ c);
        
        

    }

}
