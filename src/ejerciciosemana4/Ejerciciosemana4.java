package ejerciciosemana4;

import java.util.Scanner;

public class Ejerciciosemana4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar número de ventas
        System.out.println("Introduzca su numero de ventas");
        int numero = entrada.nextInt();
        
        // Comprobar que el número de ventas es positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número positivo de ventas.");
            System.exit(0);
        }
        
        int contador = 1;  
        int ventast = 0; 
        
        // Ingresamos las ventas
        while (contador <= numero) {
            System.out.println("Ingrese el valor de la venta " + contador + ":");
            int venta = entrada.nextInt();
            
            // Comprobar si la venta es positiva
            if (venta < 0) {
                System.out.println("Ingrese solo valores positivos para las ventas.");
            } else {
                ventast += venta;
                contador++;
            }
        }
        
        // Mostrar la suma de todos la ventas 
        System.out.println("El total de las ventas fue: " + ventast);
    }
}
