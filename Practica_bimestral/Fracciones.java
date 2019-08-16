/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_bimestral;

/**
 *
 * @author Oscar
 */
public class Fracciones {

    private int numerador;
    private int denominador;
    private int signo;

    public Fracciones() {
        this.numerador = 1;
        this.denominador = 1;
        this.signo = 1;
    }

    public Fracciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.signo = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getSigno() {
        return signo;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void cambiarSigno() {
        signo *= -1;
    }

    public void procesar() {
        if (numerador >= 0 && denominador < 0) {
            signo = -1;
        } else if (numerador < 0 && denominador >= 0) {
            signo = -1;
        }
        numerador = Math.abs(numerador);
        denominador = Math.abs(denominador);
    }

    public void invertir() {
        int aux = numerador;
        numerador = denominador;
        denominador = aux;
    }

    public void simplificar() {
        System.out.println("Simplificando...");
        int cont = 2;
        while (cont <= Math.abs(numerador) && cont <= Math.abs(denominador)) {
            if (numerador % cont == 0 && denominador % cont == 0) {
                numerador = numerador / cont;
                denominador = denominador / cont;
                System.out.println(toString());
            } else {
                cont++;
            }
        }
        System.out.println("Fin");
    }

    public double getResultado() {
        try {
            return (double) numerador / (double) denominador;
        } catch (Exception e) {
            System.out.println("Error: División por CERO.");
            return 0;
        }
    }

    @Override
    public String toString() {
        if (signo == 1) {
            return "(" + numerador + "/" + denominador + ")";
        } else {
            return "-(" + numerador + "/" + denominador + ")";
        }
    }
}


    
