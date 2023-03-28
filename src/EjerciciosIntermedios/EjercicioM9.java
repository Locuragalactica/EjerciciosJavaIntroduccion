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
public class EjercicioM9 {

    /**
     * Escriba un programa que lea 20 números. Si el número leído es igual a
     * cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero
     * cero". El programa deberá calcular y mostrar el resultado de la suma de
     * los números leídos, pero si el número es negativo no debe sumarse. Nota:
     * recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 1, suma = 0, num;

        do {
            System.out.println("Ingrese un numero.");
            num = leer.nextInt();
            if (num >= 0) {
                suma += num;
            }
            if (num == 0) {
                System.out.println("Se capturo el numero 0.");
                break;
            }

            cont++;

            if (num < 0) {
                continue;
            }

        } while (cont <= 4);

        System.out.println("La suma de los numeros ingresados es: " + suma);

    }

}
