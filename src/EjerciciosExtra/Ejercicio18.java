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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
        N, con los valores ingresados por el usuario.
        */
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n= leer.nextInt(); 
        int suma = 0;
        int [] vec = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el: " +(i+1)+ " numero");
            vec[i] = leer.nextInt();
            
        }
        
        for (int i = 0; i < n; i++) {
            suma = suma + vec [i];
        }

        System.out.println("La suma de sus numeros es: "+suma);
    }
    
}
