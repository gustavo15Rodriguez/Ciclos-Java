/*
 * 10. Leer un número entero y determinar a cuánto es igual la
 * suma de todos los enteros comprendidos entre 1 y el número leído.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo17 {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero deseado");
        
        int num = entrada.nextInt();
        
        int suma = 0;
        
        for (int i = 1; i < num; i++) {
            
            suma +=i;
        }
        
        System.out.println("La suma de todos los enteros comprendidos entre 1 y "
                + "el numero digitado es igual a: "+suma);
        
    }
}
