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
public class EjercicioM11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
        en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
        reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
        vocales acentuadas) se mantienen sin cambios.
         */

        Scanner leer = new Scanner(System.in);
        String frase;
        int largo;

        do {
            /*
            Do while para poder corroborar que la frase termine con "."
             */
            System.out.println("Ingrese una frase que finalice con '.'");
            frase = leer.nextLine();
        } while (frase.endsWith(".") != true);

        /*
            Se entra en la función para sustituir.
         */
        String retorno = code(frase);
        System.out.println(retorno);

    }

    public static String code(String frase) {
        /*
         No termino de entender por que tiene que traer String en frase.
         Luego se crea variable largo, donde se registra por cadena el largo de la frase.
         */
        int largo = frase.length();

        for (int i = 0; i < largo; i++) {
            /*
            El for ingresara por cada letra de la frase para corroborar los cambios.
            ldfrase va ir mutando segun la posición en la cadena de frase.
            Esta parte me costo, pero me di cuenta que tiene que tomarse dos posiciones,
            siendo i e i+1.
            nfrase ira creando la nueva frase y debe estar inicializada.
             */

            String ldfrase = frase.substring(i, i + 1);
            String nfrase = "";
            switch (ldfrase) {

                /*
                Es necesario ir concatenando cada ldfrase en nfrase.
                 */
                case "a":
                    nfrase = nfrase.concat(frase.replace('a', '@'));
                    break;
                case "e":
                    nfrase = nfrase.concat(frase.replace('e', '#'));
                    break;
                case "i":
                    nfrase = nfrase.concat(frase.replace('i', '$'));
                    break;
                case "o":
                    nfrase = nfrase.concat(frase.replace('o', '%'));
                    break;
                case "u":
                    nfrase = nfrase.concat(frase.replace('u', '*'));
                    break;
                default:
                    nfrase = nfrase.concat(frase);
                    break;
            }

            frase = nfrase;
        }

        return frase;
    }

}
