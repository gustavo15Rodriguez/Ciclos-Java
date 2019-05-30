/*
 * 22. Leer un número entero y determinar cuántas veces tiene el dígito 1.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo8 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el numero deseado:");

        int num = entrada.nextInt();
        
        int dig = 0;
        int cont = 0;
        
        while (num > 0) {
            int dig2 = num % 10;
            dig = num/10;
            num = num/10;
                 
            if (dig2 == 1) {
                cont ++;
            }
            
        }
        
        System.out.println("El numero 1 se repite "+ cont +" dentro del numero anterior.");
        
    }
}
