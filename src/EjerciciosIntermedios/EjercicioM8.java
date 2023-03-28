/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class EjercicioM8 {

    /**
     *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
      pedirá de nuevo hasta que la nota sea correcta.
     * @param args
     */
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Escriba un nota numerica del 1 al 10");
        
        int nota = leer.nextInt(); 
        
        while (nota < 0 || nota > 10) {
            System.out.println("El valor ingresado es incorrecto, ingrese un valor entre 0 y 10");
        
            nota=leer.nextInt();    
        }     
    }
   
         
}
