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
public class Kilometraje {
    public static void main(String args[])
{ 
Scanner entrada = new Scanner(System.in);
double galon = 0;
double kilometros;

Deitel_4_17 miObjeto = new Deitel_4_17();


System.out.println("\nIntroduzca el numero de galones: (-1 para terminar)\n");
galon = entrada.nextDouble();

while ( -1 != galon)
{ 

System.out.println("\nIntroduzca el numero de kilometros: \n");
kilometros = entrada.nextDouble();

System.out.printf("\nLos kilometros por galon fueron: %.2f: ", miObjeto.Procesa_Datos(galon, kilometros));
System.out.println("\nIntroduzca el numero de galones: (-1 para terminar) \n");
galon = entrada.nextDouble();
} 
} 

    private static class Deitel_4_17 {

        public Deitel_4_17() {
        }

        private Object[] Procesa_Datos(double galon, double kilometros) {
            throw new UnsupportedOperationException(" n"); 
        }
    }
 
}
