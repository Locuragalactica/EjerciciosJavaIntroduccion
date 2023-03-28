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
public class Ejercicio5Franco {

    /**
     * @param args the command line arguments
     */
    public static void menuSocios() {
        Scanner leer = new Scanner(System.in);
        int salir = 0;
        String respuesta;

        while (salir == 0) {

            System.out.println("Seleccione su tipo de Socio");
            System.out.println("Tipo de socio 'A'");
            System.out.println("Tipo de socio 'B'");
            System.out.println("Tipo de socio 'C'");
            System.out.println("D. Salir");
            char seleccion = leer.next().charAt(0);
            //System.out.println("El caracter seleccionado fue: "+ seleccion); al pedo
            String strSeleccion = Character.toString(seleccion);
            switch (strSeleccion = strSeleccion.toUpperCase()) {
                case "A":

                    System.out.println("Usted eligio Tipo de socio 'A', a continuacion ingrese el valor de su tratamiento: ");
                    double tratamiento = leer.nextDouble();
                    System.out.println("Ya que usted realiza un aporte mayor,"
                            + " tiene un 50% de descuento sobre el valor de todos los tipos de tratamientos");
                    tratamiento = tratamiento * 0.5;
                    System.out.println("El costo final de su tratamiento, pagando en efectivo es de: " + tratamiento);

                    break;
                case "B":
                    System.out.println("Usted eligio Tipo de socio 'B', a continuacion ingrese el valor de su tratamiento: ");
                    double tratamientoB = leer.nextDouble();
                    System.out.println("Ya que usted realiza un aporte moderado,"
                            + " tiene un 35% de descuento sobre el valor de todos los tipos de tratamientos");
                    tratamientoB = tratamientoB * 0.65;
                    System.out.println("El costo final de su tratamiento, pagando en efectivo es de: " + tratamientoB);

                    break;
                case "C":
                    System.out.println("Usted eligio Tipo de socio 'C', a continuacion ingrese el valor de su tratamiento: ");
                    double tratamientoC = leer.nextDouble();
                    System.out.println("Ya que usted realiza un aporte basico,no tiene descuentos sobre los tratamientos");
                    System.out.println("El costo final de su tratamiento, pagando en efectivo es de: " + tratamientoC);

                    break;
                case "D":
                    System.out.println("¿Esta seguro que desea salir?, Si es asi, ingrese S para si y N para no");
                    respuesta = leer.next();
                    respuesta = respuesta.toUpperCase();
                    switch (respuesta) {
                        case "N":
                            break;
                        case "S":
                            salir = 1;
                            break;
                        default:
                            System.out.println("Si desaea salir del programa ingrese S, caso contrario N");
                            respuesta = leer.next();
                            respuesta = respuesta.toUpperCase();
                    }
                    break;

            }

        }

    }

    public static void main(String[] args) {
        menuSocios();

        // TODO code application logic here
    }

}
