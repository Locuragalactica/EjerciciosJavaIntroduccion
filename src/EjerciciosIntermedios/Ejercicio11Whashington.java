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
public class Ejercicio11Whashington {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        char letra;
        String frase, frasemod = "";

        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine().toLowerCase();

        for (int i = 0; i <= frase.length() - 1; i++) {
            letra = frase.charAt(i);
            letra = cambiar(letra);
            frasemod = frasemod.concat(String.valueOf(letra));
        }

        System.out.println("Su frase modificada es: " + frasemod);
    }

    public static char cambiar(char letra) {

        char cambio;

        switch (letra) {
            case 'a':
                cambio = '@';
                break;
            case 'e':
                cambio = '#';
                break;
            case 'i':
                cambio = '$';
                break;
            case 'o':
                cambio = '%';
                break;
            case 'u':
                cambio = '*';
                break;
            default:
                cambio = letra;
        }
        return cambio;

    }

}
