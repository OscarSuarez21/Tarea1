/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author IST.LOJA
 */
public class Fecha {

    public static void main(String[] args) {
        Date fechaActual = new Date(); //muestra la fecha actual
        System.out.println(fechaActual);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");//para pasar de un strin a una fecha
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la fecha en el formato dd/MM/yyyy");
        String fecha = entrada.nextLine();
        Date fechadenacimiento = null;
        try {
            fechadenacimiento = formato.parse("21/08/1993");//pasando del strin a una fecha

            System.out.println(fechadenacimiento);
            //System.out.println(fechadenacimiento.before(fechaActual));
        } catch (Exception e) {
            System.out.println(e);

        }
        GregorianCalendar calendario = new GregorianCalendar(); //permitir manejar fechas
        calendario.setTime(fechaActual);
        int anioactual = calendario.get(GregorianCalendar.YEAR);
        int mesactual = calendario.get(GregorianCalendar.MONTH) + 1;
        int diactual = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        //System.out.println("anioactual "+anioactual+" mes "+mesactual+" dia "+diactual);
       
        GregorianCalendar calendario1 = new GregorianCalendar();
        calendario1.setTime(fechadenacimiento);
        int anioac = calendario1.get(GregorianCalendar.YEAR);
        int mesac = calendario1.get(GregorianCalendar.MONTH);
        int diaac = calendario1.get(GregorianCalendar.DAY_OF_MONTH);
        
        
        System.out.println("anioac"+anioac+"mesac"+mesac+"diac"+diaac);
    }

}
