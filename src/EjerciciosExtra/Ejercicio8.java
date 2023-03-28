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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
        la cantidad de números impares. Al igual que en el ejercicio anterior los números
        negativos no deben sumarse
         */
        Scanner leer = new Scanner(System.in);
        int contp = 0, contim = 0;
        int num;
        do {
            System.out.println("Ingrese numeros enteros");
            num = leer.nextInt();
            if (num >= 0) {
                if (num % 5 == 0) {
                    break;
                }
                if (num % 2 == 0) {
                    contp++;
                } else {
                    contim++;
                }
            }
        } while (true);
        System.out.println("La cantidad de numeros pares es: " + contp);
        System.out.println("La cantidad de numeros impares es: " + contim);
    }

}
