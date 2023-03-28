/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

/**
 *
 * @author felip
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.
         */

        int n1, n2, n3;
        String e;

        for (int i = 0; i < 10; i++) {
            n1 = i;
            for (int j = 0; j < 10; j++) {
                n2 = j;
                for (int k = 0; k < 10; k++) {
                    n3 = k;

                    if (n1 == 3) {
                        System.out.println("E" + "-" + n2 + "-" + n3);
                    } else if (n2 == 3) {
                        System.out.println(n1 + "-" + "E" + "-" + n3);
                    } else if (n3 == 3) {
                        System.out.println(n1 + "-" + n2 + "-" + "E");
                    } else {
                        System.out.println(n1 + "-" + n2 + "-" + n3);
                    }

                }
            }
        }

    }
}
