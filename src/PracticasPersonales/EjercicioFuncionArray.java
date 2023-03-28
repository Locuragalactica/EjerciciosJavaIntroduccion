/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasPersonales;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class EjercicioFuncionArray {

    /**
     * @param args the command line arguments
     */
    public static void relleno(int [] vector, int a, int b){
    
  
}
    
    
    public static void main(String[] args) {
        /*
        Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, 
        al final muestra por pantalla el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array 
        (que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido y la suma del array y un método 
        privado para generar número aleatorio (lo puedes usar para otros ejercicios).
         */
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de numeros de su arreglo");
        Integer num = leer.nextInt();
        int [] vector = new int [num];
        
        relleno(vector,0,9);
        
    }

}
