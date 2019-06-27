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
public class Multiplo_de_un_Numero {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        int num1, num2,datos, residuo;
        System.out.println("Ingrese un numero");
        num1= entrada.nextInt();
        System.out.println("Ingrese otro numero");
        num2= entrada.nextInt();
        datos =num1/num2;
        residuo= num1%num2;
      
        if (datos==0){
            System.out.println(num1+" "+"es mutiplo de"+" "+num2);
        }else {
            System.out.println(num1+" "+"No es multiplo de"+" "+num2);
        }
        System.out.println("Residuo:"+" "+residuo);
        System.out.println("Resultado:"+" "+datos);
    }
    
}


