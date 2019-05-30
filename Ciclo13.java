/*
 * 2. Leer un número entero y mostrar todos los pares 
 * comprendidos entre 1 y el número leído.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo13 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero deseado: ");
        
        int num = entrada.nextInt();
        
        for (int i = 1; i < num; i++) {
            
            if (i%2 == 0) {
            System.out.println(i);
            }
       
        }
    }
}
