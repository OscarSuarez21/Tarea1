package tarea1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Clasificacion_de_Numeros {
     public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.println("Ingrese un numero");
        n1 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        n2 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        n3 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        n4 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        n5 = entrada.nextInt();
        if (n1 > 0) {
            positivos = positivos + 1;
        }

        if (n1 < 0) {
            negativos = negativos + 1;
        }

        if (0 == n1) {
            ceros = ceros + 1;
        }

        if (n2 > 0) {
            positivos = positivos + 1;
        }

        if (n2 < 0) {
            negativos = negativos + 1;
        }

        if (0 == n2) {
            ceros = ceros + 1;
        }

        if (n3 > 0) {
            positivos = positivos + 1;
        }

        if (n3 < 0) {
            negativos = negativos + 1;
        }

        if (0 == n3) {
            ceros = ceros + 1;
        }

        if (n4 > 0) {
            positivos = positivos + 1;
        }

        if (n4 < 0) {
            negativos = negativos + 1;
        }

        if (0 == n4) {
            ceros = ceros + 1;
        }

        if (n5 > 0) {
            positivos = positivos + 1;
        }

        if (n5 < 0) {
            negativos = negativos + 1;
        }

        if (0 == n5) {
            ceros = ceros + 1;
        }


  
        System.out.println("los numeros positivos son:"+positivos);
        System.out.println("los numeros negativos son:"+negativos);
        System.out.println("los numeros ceros son:"+ceros);
        

    }
    

    


}
