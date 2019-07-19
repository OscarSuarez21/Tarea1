/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author IST.LOJA
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        

        System.out.println("1 suma, 2 resta, 3 multiplicacion, 4 divicion");
        
        System.out.println("Escoga una opcion");
        
        
        
        
         int opc = entrada.nextInt();
         
          switch(opc)
        {
            case 1:
                try{
                    System.out.println("Ingrese dos numeros");
                    int num1 = entrada.nextInt();
                    int num2 = entrada.nextInt();
                    int rtd = num1 + num2;
                    System.out.println("La suma es "+rtd);
                }catch(Exception e){
                    
                }
                 break;   

            case 2:
                try{
                    System.out.println("Ingrese dos numeros");
                    int num1 = entrada.nextInt();
                    int num2 = entrada.nextInt();
                    int rtd = num1 - num2;
                    System.out.println("la resta es: "+rtd);
                }catch(Exception e){
                    
                }
                break;

            case 3:
                try{
                    System.out.println("Ingrese dos numeros");
                    int num1 = entrada.nextInt();
                    int num2 = entrada.nextInt();
                    int rtd = num1 * num2;
                    System.out.println("la multiplicacion es: "+rtd);
                }catch(Exception e){
                }

                
                break;
                
            case 4:
                 try{
                    System.out.println("Ingrese dos numeros");
                    int num1 = entrada.nextInt();
                    int num2 = entrada.nextInt();
                    int rtd = num1 * num2;
                    System.out.println("la multiplicacion es: "+rtd);
                }catch(Exception e){
                    
                }
                
                    
          
              

         

    }
    }
}
