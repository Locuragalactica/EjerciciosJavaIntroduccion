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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.
         */

        Scanner read = new Scanner(System.in);
        String plan;

        do {
            System.out.println("Ingrese su plan A, B o C");
            plan = read.next();
        } while ((!plan.equalsIgnoreCase("a")) && (!plan.equalsIgnoreCase("b")) && (!plan.equalsIgnoreCase("c")));

        float trat;
        System.out.println("Ingrese el costo de su tratamiento");
        trat = read.nextFloat();

        switch (plan) {
            case "a":
                System.out.println("El precio de su tratamiento es: " + trat + ". Usted dispone un descuento del 50%. Por lo que su costo es: " + (trat * 0.5));
                break;
            case "b":
                System.out.println("El precio de su tratamiento es: " + trat + ". Usted dispone un descuento del 35%. Por lo que su costo es: " + (trat * 0.65));
                break;
            case "c":
                System.out.println("El precio de su tratamiento es: " + trat + ". Usted dispone un descuento del 0%. Por lo que su costo es: " + trat);
                break;
        }
    }

}
