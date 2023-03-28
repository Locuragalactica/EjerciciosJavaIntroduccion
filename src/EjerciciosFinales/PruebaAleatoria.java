/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFinales;

/**
 *
 * @author felip
 */
public class PruebaAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
         */

        int num;
        do {
            num = (int) (Math.random() * 10);
            System.out.println(num);
        } while (num > 5 || num < 1);

        switch (num) {

            case 1:
                int ran;
                ran = (int) (Math.random() * 10);

                System.out.println(ran);
                break;

            case 2:
                int ran2;
                ran2 = (int) (Math.random() * 100);

                System.out.println(ran2);
                break;

            case 3:
                int ran3;
                ran3 = (int) (Math.random() * 1000);

                System.out.println(ran3);
                break;

            case 4:
                int ran4;
                ran4 = (int) (Math.random() * 10000);

                System.out.println(ran4);
                break;

            case 5:
                int ran5;
                ran5 = (int) (Math.random() * 100000);

                System.out.println(ran5);
                break;
        }

    }

}
