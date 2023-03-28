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
public class PruebaEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;
        int largo;
        System.out.println("Ingrese una frase que finalice con '.'");
        frase = leer.nextLine();
        largo = frase.length();

        String frase2 = frase.replace('a', '#');

        System.out.println(frase2);

    }

}
