
package ejerciciosemana4;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        System.out.println("Los números primos entre 1 y 100 son: ");
        
        // Ciclo para usar los numeros del 1 al 100
        for (int i = 2; i <= 100; i++) {
            int numero = 0;  
            
            // Verificar los numeros
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numero++;  
                }
            }
            
            //Revisar si el numero es primo o no 
            if (numero == 2) {
                System.out.print(i + " ");
            }
        }
    }
}

