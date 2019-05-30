/*
 * 40. Leer un número de dos dígitos y determinar si pertenece a la 
 * serie de Fibonacci.
 */

package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero deseado, mayor a 0:");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero deseado, mayor a 0:");
        
        int num2 = entrada.nextInt();
        
        int numero = 1;
        int ultimo = 0;
        int penultimo = 0;
        
        int cont1 = 0;
        int cont2 = 0;
        
        for (int i = 0; i < 20; i++) {
            
            penultimo = ultimo;
            ultimo = numero;
            numero = penultimo + ultimo;
            
            if (num1 == numero ) {
                cont1++;
            }
            
            if (num2 == numero ) {
                cont2++;
            }
        }
        
        if (cont1 > 0 && cont2 > 0) {
            System.out.println("Ambos numeros pertenecen a la serie Fibonacci.");
        }
        
        else if (cont1 > 0) {
            System.out.println("Solo el primer numero pertenece a la serie Fibonacci.");
        }
        
        else if (cont2 > 0) {
            System.out.println("Solo el segundo numero pertenece a la serie Fibonacci.");
        }
         
        else
             System.out.println("Ninguno de los numeros anteriores pertenecen a "
                     + "la serie Fibonacci.");
        
        
    }
    
}
