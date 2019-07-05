/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

/**
 *
 * @author IST.LOJA
 */
public class Main {
    public static void main(String[] args) {
        Pilas pila = new Pilas();
        
        pila.push(4.3);
        pila.push(true);
        pila.push("pila");
        pila.push('D');
        pila.push('C');
        
        while(pila.empty()==false){
            System.out.println(pila.pop());
        }
    }
    
}
