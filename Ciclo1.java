/*
 * 29. Leer un número entero y determinar a cuánto 
 * es igual el primero de sus dígitos.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);  
        
        System.out.println("Digite el numero deseado:");
        
        int num = entrada.nextInt();
        
        int dig = 0;
        
        while (num > 10)
        {
            dig = num/10;
            num = num/10;
            int dig2 = num % 10;
            
        }
        
        System.out.println("El primer digito del numero leido es: "+dig);
        
        
        
    
    }
    
        
    
}
