package tarea2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Comision_Ventas {
    Scanner entrada = new Scanner(System.in);
private int numeroEmpleado;
private int numero;
private float salarioEmpleado = 0;

public void Recibe()
{ 

System.out.println("\nIntroduzca un entero positivo si quiere introducir datos para un proximo empleado o -1 para terminar:");
numeroEmpleado = entrada.nextInt();

while (-1 != numeroEmpleado)
{ 

System.out.printf("\nPor favor introduzca que articulo ha vendido el empleado %d (1, 2, 3, 4 ) o -1 para terminar: ", numeroEmpleado);
numero = entrada.nextInt();

while ( -1 != numero)
{ 

if ( 1 == numero )
salarioEmpleado += 239.99;
if ( 2 == numero)
salarioEmpleado += 129.75;
if ( 3 == numero)
salarioEmpleado += 99.95;
if ( 4 == numero)
salarioEmpleado += 350.89;

System.out.printf("\nPor favor introduzca que articulo ha vendido el empleado %d (1, 2, 3, 4 ) o -1 para terminar: ", numeroEmpleado);
numero = entrada.nextInt();
} // Cierra while anidado

System.out.printf("\nEl salario total del empleado %d es %.2f\n", numeroEmpleado, 200 + Retorna(salarioEmpleado));

System.out.println("\nIntroduzca un entero positivo si quiere introducir datos para un proximo empleado o -1 para terminar: ");
numeroEmpleado = entrada.nextInt();
} 
} 

public double Retorna( double salario)
{
return salario*9/100;
} 
} 



