/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntermedios;

/**
 *
 * @author felip
 */
public class EjercicioM13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
        define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
         */
        
        String [] vector = new String[6];
        vector [0] = "Damian";
        vector [1] = "Karina";
        vector [2] = "Felipe";
        vector [3] = "Guille";
        vector [4] = "Jennifer";
        vector [5] = "Alfo";
        
        
        for (int i=0; i<6; i++){
            System.out.println(vector[i]);
        }
        
    
    }
}
