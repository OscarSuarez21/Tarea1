/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_bimestral;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejecutar_Cuenta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nombre, Numero;
        double Tipo, Importe;

        //
        //
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre :");
        Nombre = sc.nextLine();
        System.out.print("Número de cuenta :");
        Numero = sc.nextLine();
        System.out.print("Tipo de interes :");
        Tipo = sc.nextDouble();
        System.out.print("Saldo :");
        Importe = sc.nextDouble();

        cuenta1.setNombre(Nombre);
        cuenta1.setNumeroCuenta(Numero);
        cuenta1.setTipoInteres(Tipo);
        cuenta1.setSaldo(Importe);

        //
        //
        Cuenta cuenta2 = new Cuenta(" Daniel Suarez", "1596834934"1.75,150);
        
        
        Cuenta cuenta3 = new Cuenta(cuenta1);

        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Numero de cuenta :" + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de ineres :" + cuenta1.getTipoInteres());
        System.out.println("saldo :" + cuenta1.getSaldo());
        System.out.println("");

        //
        cuenta1.ingreso(500);

        //
        System.out.println("saldo : " + cuenta1.getSaldo());

        //
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Numero de cuenta :" + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de ineres :" + cuenta2.getTipoInteres());
        System.out.println("saldo :" + cuenta2.getSaldo());
        System.out.println("");

        //
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta3.getNombre());
        System.out.println("Numero de cuenta :" + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de ineres :" + cuenta3.getTipoInteres());
        System.out.println("saldo :" + cuenta3.getSaldo());
        System.out.println("");

        //
        cuenta3.transferencia(cuenta2, 10);

        //
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();
    }

}
