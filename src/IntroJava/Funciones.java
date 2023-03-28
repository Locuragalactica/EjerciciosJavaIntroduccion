/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJava;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 *
 * @author felip
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int resultado =  suma (10, 10);
        
        System.out.println(resultado);
        
        saludoPersonalizado("Chiquito");
        
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.next();
        
        saludoPersonalizado(nombre);
        
        saludoPersonalizado(leer.next ());
        
        
                
                
       
    }
    
    public static int suma(int a, int b) {
        
        int c = a + b;
        return c;
        
    }
        
          public static void saludoPersonalizado(String nombre){
        System.out.println("Hola " + nombre + " ¿Cómo estas?"); 
          }
          
        
    }
    
  
