
package ejerciciosemana4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana");
        String dia=entrada.next().toUpperCase();
        
        switch(dia){
        
            case "LUNES":
                    System.out.println("Es un dia de laboral");
        break;
            case "MARTES":
                System.out.println("Es un dia de laboral");
        break;
           case "MIERCOLES":
                System.out.println("Es un dia de laboral");
        break;
           case "JUEVES":
                System.out.println("Es un dia de laboral");
        break;
           case "VIERNES":
                System.out.println("Es un dia de laboral");
        break;
           case "SABADO":
                System.out.println("No es un dia de laboral");
        break;
           case "DOMINGO":
                System.out.println("No es un dia de laboral");
        break;
           default:
               System.out.println("No es un dia valido");
               break;
        }                
        
    }
}
