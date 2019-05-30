/*
 * 19. Leer un número entero y determinar si es primo.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo6 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero, positivo:");
        
        int num = entrada.nextInt();
        
        int mult = 0;
        
        for (int i = 1; i<=num; i++) {
            if (num%i == 0) {
                mult ++;
            }
           
        }
        
        if (mult == 2) {
            System.out.println("El numero es primo.");
        }
        
        else
            System.out.println("El numero ingresado no es primo.");
    }
}
