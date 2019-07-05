/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.ArrayList;

/**
 *
 * @author IST.LOJA
 */
public class Pilas {
    
    private ArrayList<Object> pila = new ArrayList();
    
    public void push (Object o){ //push sirve para agregar valores a la pila
        pila.add(o); //se agrega el valor a la pila
        
}
    public Object pop (){  //pop muestra el ultimo valor y lo elimina
        if (!(pila.isEmpty())){
            Object o = pila.get(pila.size()-1);
            pila.remove(pila.size()-1);
            return o;
        }else{
            return null;
            
        }
            }
    public Object peek (){ //peek muestra el ultimo valor
        if (!(pila.isEmpty())){
            return pila.get(pila.size()-1);
        }else{
            return null;
        }
}
    public Boolean empty(){ //empty la pila esta llena o vacia
        return pila.isEmpty();
}
}