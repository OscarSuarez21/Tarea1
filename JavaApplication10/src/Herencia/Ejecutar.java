/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Scanner;

/**
 *
 * @author IST.LOJA
 */
public class Ejecutar {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese uno para circulo 2 para"
                + "triangulo y 3 para cuadrado");
        int valor = Entrada.nextInt();

        switch (valor) {

            case 1:
                System.out.println("Ingrese el radio del circulo");
                double radio = Entrada.nextDouble();
                Circulo objeto = new Circulo();//para crear un objeto de una clase 
                double AreaCirculo = objeto.calcularArea(radio);
                double PerimetroCirculo = objeto.calcularPerimetro(radio);
                System.out.println("Este es area" + AreaCirculo + " y el perimetro:" + PerimetroCirculo);//muetra mensaje
                break;//este va despues de cada case

            case 2:
                System.out.println("Ingrese el lado del triangulo");
                double lado1 = Entrada.nextDouble();
                double lado2 = Entrada.nextDouble();
                double lado3 = Entrada.nextDouble();
                double base = Entrada.nextDouble();
                double altura = Entrada.nextDouble();
                Triangulo objeto1 = new Triangulo();

                double AreaTriangulo = objeto1.calcularArea(base, altura);
                double PerimetroTriangulo = objeto1.calcularPerimetro(lado1, lado2, lado3);
                System.out.println("Este es el area" + AreaTriangulo + "Este es el Perimetro" + PerimetroTriangulo);
                break;

            case 3:
                System.out.println("Ingrese el lado del cuadrado");
                double lado = Entrada.nextDouble();
                Cuadrado objeto3 = new Cuadrado();
                double AreaCuadrado = objeto3.calcularArea(lado);
                double PerimetroCuadrado = objeto3.calcularPerimetro(lado);
                System.out.println("Este es el area" + AreaCuadrado + "Este es el Perimetro" + PerimetroCuadrado);

                break;
            default:
                System.out.println("Ingrese un numero correcto");
                break;
        }

    }
}
