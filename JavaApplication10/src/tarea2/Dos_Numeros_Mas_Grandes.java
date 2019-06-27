package tarea2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Dos_Numeros_Mas_Grandes {
     public static void main(String[] args) {



        int vector[] = {2, 1, 3,9, 5, 6, 4, 8, 7};
        int max = 0;
        max = mayorVector(vector);

        if (vector[vector.length - 1] > max) {            
            max = vector[vector.length - 1];
        }
        System.out.println("Del Vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("El mayor es " + max);

    }

    public static int mayorVector(int vector[]) {

        int vector2[] = new int[vector.length - 1];       
        int max = 0;                                        

        for (int i = 0; i < vector2.length; i++) {             
            vector2[i] = vector[i];
        }

        if (vector.length == 1) {                                      
            max = vector[0];

        } else {
            max = mayorVector(vector2);

            if (max < vector[vector.length - 1]) {            
                max = vector[vector.length - 1];

            }
        }
        return max;
    }

}
