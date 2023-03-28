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
public class Ejercicio23Wash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().
         */

        Scanner leer = new Scanner(System.in);
        String[][] Crucigrama = new String[20][20];
        int[] pos = new int[10];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Crucigrama[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }
        String phrase;
        char letter;
        for (int i = 0; i < 10; i++) {

            do {
                System.out.print("Ingrese palabra # " + (i + 1));
                phrase = leer.next();
                if (phrase.length() < 3 || phrase.length() > 5) {
                    System.out.println("Su palabra está fuera del rango (3-5)");
                }
            } while (phrase.length() < 3 || phrase.length() > 5);

            pos[i] = (int) (Math.random() * 10);
            System.out.println(pos[i]);
            for (int x = 0; x < i; x++) {
                if (pos[i] == pos[x]) {
                    System.out.println("El valor se ha reemplazado");
                    pos[i] = (int) (Math.random() * 10);
                    System.out.println(pos[i]);
                    x = 0;
                }
            }

            for (int j = 0; j < phrase.length(); j++) {
                letter = phrase.charAt(j);
                Crucigrama[pos[i]][j] = String.valueOf(letter);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + Crucigrama[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
