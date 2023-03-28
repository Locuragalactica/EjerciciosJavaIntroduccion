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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de tiempo en minutos");
        int dato = leer.nextInt();

        int hora, dia, res, min, s;
        dia = dato / 1440;
        res = dato % 1440;
        hora = res / 60;
        min = res % 60;

        System.out.println("Dia: " + dia);
        System.out.println(hora + "hs : " + min + "min" );
    }

}
