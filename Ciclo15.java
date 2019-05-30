/*
 * 21. Leer un número entero y determinar a cuánto es igual la suma de sus dígitos.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo15 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite el numero deseado: ");
        
        int num = in.nextInt();
        int suma = 0;
        int cont = 0;
        
        while (num != 0) {
            
            int dig1 = num%10;
            suma+=dig1;
            num = num/10;
            
  
        }

        System.out.println("La suma de los digitos del numero anterior es igual a: "+suma);

    }
            
    
}
