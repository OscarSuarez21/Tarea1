/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import java.util.Scanner;

/**
 *
 * @author IST.LOJA
 */
public class Transformador {

    public static void main(String[] args) {
        int opc;
        double km = 1, m = 1, millas = 1, pies = 1;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("ingrese una opcion");
        System.out.println("1.km a m.");
        System.out.println("2.m a km.");
        System.out.println("3. millas a m.");
        System.out.println("4.m a millas.");
        System.out.println("5.pies a m.");
        System.out.println("6. m a pies.");

        opc = Entrada.nextInt();
        switch (opc) {
            case 1:
                System.out.println("ingrese la cantidad de km a convertir");
                km = Entrada.nextDouble();
                km = m * 1000;
                System.out.println(km + "km es equivalente a" + m + "m.");
                break;
            case 2:
                System.out.println("ingrese la cantidad de m a convertir");
                m = Entrada.nextDouble();
                m = km % 1000;
                System.out.println(m + "m es equivalente a" + km + "km.");
                break;
            case 3:
                System.out.println("ingrese la cantidad de millas a convertir");
                millas = Entrada.nextDouble();
                millas = m * 1609.344;
                System.out.println(millas + "millas es equivalente a" + m + "m.");
                break;
            case 4:
                System.out.println("ingrese la cantidad de m a convertir");
                m = Entrada.nextDouble();
                m = millas % 1609.344;
                System.out.println(m + "m es equivalente a" + millas + "millas.");
                break;
            case 5:
                System.out.println("ingrese la cantidad de pies a convertir");
                pies = Entrada.nextDouble();
                pies = m %  3.281;
                System.out.println(pies+ "pies es equivalente a" + m + "m.");
                break;
            case 6:
                System.out.println("ingrese la cantidad de m a convertir");
                m = Entrada.nextDouble();
                m = pies * 3.281
;
                System.out.println(m+ "m es equivalente a" +pies+ "pies.");
                break;

        }

    }

}
