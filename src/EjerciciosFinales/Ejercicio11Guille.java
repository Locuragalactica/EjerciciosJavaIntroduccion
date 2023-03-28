/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFinales;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Ejercicio11Guille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opc;
        String confi = "n";
        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            opc = leer.nextInt();
            if (opc == 5) {
                do {
                    System.out.println("¿estas seguro de que quieres salir del programa? (s/n)");
                    confi = leer.next();
                } while (!confi.equals("n") && !confi.equals("s"));
                if (confi.equals("s")) {
                    break;
                } else {
                    continue;
                }
            }
            if (opc > 0 && opc <= 5) {
                System.out.println("Ingrese un numero entero: ");
                int num1 = leer.nextInt();

                System.out.println("Ingrese el siguiente numero: ");
                int num2 = leer.nextInt();
                switch (opc) {
                    case 1:
                        int suma = num1 + num2;
                        System.out.println("la suma de: " + num1 + " + " + num2 + " = " + suma);
                        break;
                    case 2:
                        int res = num1 - num2;
                        System.out.println("la resta de: " + num1 + " - " + num2 + " = " + res);
                        break;
                    case 3:
                        int mult = num1 * num2;
                        System.out.println("la multiplicacion de: " + num1 + " x " + num2 + " = " + mult);
                        break;
                    case 4:
                        int div = num1 / num2;
                        System.out.println("la suma de: " + num1 + " / " + num2 + " = " + div);
                        break;
                }
            } else {
                System.out.println("ingresaste una opcion invalida");
            }
        } while (confi.equals("n"));
        System.out.println("El programa a terminado");
    }
}
