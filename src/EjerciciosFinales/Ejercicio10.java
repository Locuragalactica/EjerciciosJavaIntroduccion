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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        */
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un numero tope");

        int top = leer.nextInt();
        int num;
        int suma = 0;
        
        while (suma < top){
            System.out.println("Escriba un numero");
            
          num = leer.nextInt();
          
          suma = suma + num;
          
        }
        System.out.println("Usted ha pasado el tope");
    }

}