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
public class Ejercicio1 {

    /**
    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);

        System.out.println("Escriba un número entero");
        
       int num1 = leer.nextInt();
        
        System.out.println("Escriba otro número entero"); 
       
       int num2 = leer.nextInt();      
        
        int suma = num1 + num2;
        
        System.out.println("La suma de sus dos números es: "+suma); 
                
    }
    
}
