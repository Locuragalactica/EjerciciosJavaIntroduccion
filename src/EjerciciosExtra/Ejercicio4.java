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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.
        */
        Scanner read = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Ingrese un numero del 1 al 10");
              num = read.nextInt();
        } while (num<1 || num > 10);
        
        switch (num) {
            case 1: System.out.println("Su numero en romano es: I");
            break;
            case 2: System.out.println("Su numero en romano es: II");
            break;
            case 3: System.out.println("Su numero en romano es: III");
            break;
            case 4: System.out.println("Su numero en romano es: IV");
            break;
            case 5: System.out.println("Su numero en romano es: V");
            break;
            case 6: System.out.println("Su numero en romano es: VI");
            break;
            case 7: System.out.println("Su numero en romano es: VII");
            break;
            case 8: System.out.println("Su numero en romano es: VIII");
            break;
            case 9: System.out.println("Su numero en romano es: IX");
            break;
            case 10: System.out.println("Su numero en romano es: X");
            break;
        }
      
        
        
    }
    
}
