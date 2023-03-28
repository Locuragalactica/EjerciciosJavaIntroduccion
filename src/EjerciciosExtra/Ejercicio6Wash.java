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
public class Ejercicio6Wash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.
         */
        
        Scanner leer = new Scanner(System.in);
        int cM = 0, cG = 0;
        float estaturaM = 0, estaturaG = 0, promM, promG, estatura;
        String opc;
        do {
            System.out.print("Estatura #" + (cG + 1) + ": ");
            estatura = leer.nextFloat();
            cG++;
            estaturaG += estatura;
            if (estatura < 1.60) {
                cM++;
                estaturaM += estatura;
            }
            System.out.println("¿Desea ingresar otro usuario? (S/N) ");
            do {
                opc = leer.next();
                if (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                    System.out.println("Ingrese una opción válida!!!");
                }
            } while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n"));

        } while (!opc.equalsIgnoreCase("n"));

        System.out.println("El promedio (<1.60)  : " + (estaturaM / cM));
        System.out.println("El promedio generales: " + (estaturaG / cG));
    }

}
