/*
 *24. Leer un número entero y determinar a cuánto es igual la suma de sus dígitos pares.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo9 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el numero deseado:");

        int num = entrada.nextInt();
        int dig = 0;
        int suma = 0;
        
        while (num > 0)
        {
            int dig2 = num % 10;
            dig = num/10;
            num = num/10;
            
            if (dig2%2 == 0) {
                suma += dig2;
            }
        }
        
        System.out.println("La suma de todos los digitos del numero anterior es: "+suma);
    }
    
}
