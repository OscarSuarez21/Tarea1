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
public class Cuenta {
    
    private String Nombre;
    private String NumeroCuenta;
    private double TipoInteres;
    private double Saldo;

    //ponemos un constructor por defecto
    public Cuenta() {
    }
//ponemos contructores por parametros
    public Cuenta(String Nombre, String NumeroCuenta, double saldo) {
        this.Nombre = Nombre;
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
    }
    //hacemos una copia de constructor
    public Cuenta(final Cuenta c){
        Nombre = c.Nombre;
        NumeroCuenta = c.NumeroCuenta;
        TipoInteres = c.TipoInteres;
        Saldo = c.Saldo;
        
    }
//metodos  getters y setters
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public void setTipoInteres(double TipoInteres) {
        this.TipoInteres = TipoInteres;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public double getTipoInteres() {
        return TipoInteres;
    }

    public double getSaldo() {
        return Saldo;
    }
    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n<0){
            ingresoCorrecto = false;
        }else{
            Saldo = Saldo +n;
        }
        return ingresoCorrecto;
        }
    // ponemos u  metodo de reintegro
    public boolean reintegro (double n) {
        boolean reitegroCorrecto = true ;
        if (n < 0){
            reitegroCorrecto = false;
        }else if (Saldo >=n){
            Saldo -= n;
        }else{
            reitegroCorrecto = false;
        }
        return reitegroCorrecto;
        
    }
    // le ponemos un metodo de transferencia
    public boolean transferencia(Cuenta c, double n){
        boolean correcto = true;
        if (n < 0){
            correcto = false;
        }else if (Saldo >= n){
            reintegro(n);
            c.ingreso(n);
        }else{
            correcto = false;
        }
        return correcto;
    }

      }

    


