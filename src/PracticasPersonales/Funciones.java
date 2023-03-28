/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasPersonales;

/**
 *
 * @author felip
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void impresion(int sum, int numeros[]) {
        
        for (int i = 0; i < 5; i++) {
            System.out.print("["+numeros[i]+"]");
        }
        System.out.println("");
        System.out.println("La suma del vector es: "+sum);
    }

    public static void suma(int numeros[]) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numeros[i];
        }
        impresion(sum, numeros);
    }

    public static void num() {
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
        suma(numeros);
    }

    public static void main(String[] args) {
        /*
        Crear funciones dentro de funciones.
         */

        num();

    }

}
