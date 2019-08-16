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
public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = año > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (esBisiesto ()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                    } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
               
                }
        return diaCorrecto && mesCorrecto && añoCorrecto;
        
         }
    private boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
        
    }
    public void diaSiguiente() {
        dia++;
        if ( ! fechaCorrecta ()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                año++;
                
            }
        }
    }
    @Override
     public String toString() {
         
         StringBuilder sb = new StringBuilder();
         if (dia<10){
             sb.append("0");
             
         }
         sb.append(dia);
         sb.append("-");
         if (mes < 10) 
             sb . append ( " 0 " );
         {
             sb.append("0");
             sb.append(mes);
             sb.append("-");
             sb.append(año);
             return sb.toString();
         }
         
     } 
               
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, a;
        
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("año: ");
        a = sc.nextInt();
        
        Fecha fecha = new Fecha(d,m,a);
        if (fecha.fechaCorrecta()) {
            System.out.println("Fecha introducida: " + fecha);
            System.out.println("Los 10 días siguientes son:");
            for (int i = 1; i <= 10; i++) {
                fecha.diaSiguiente();
                System.out.println(fecha);
                
            }
        }else {
            System.out.println("Fecha no valida");
        }
        
    }
        
    }
        
    

        
        
    

