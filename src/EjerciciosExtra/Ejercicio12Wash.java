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
public class Ejercicio12Wash {

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

        String ichart, jchart, kchart;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    ichart = String.valueOf(i);
                    jchart = String.valueOf(j);
                    kchart = String.valueOf(k);
                    if (ichart.equals("3")) {
                        ichart = "E";
                    }
                    if (jchart.equals("3")) {
                        jchart = "E";
                    }
                    if (kchart.equals("3")) {
                        kchart = "E";
                    }
                    System.out.println(ichart + "-" + jchart + "-" + kchart);
                }

            }
        }
    }
}
