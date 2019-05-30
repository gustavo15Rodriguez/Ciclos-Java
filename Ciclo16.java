/*
 * 5. Leer dos números y mostrar todos los números terminados 
 * en 4 comprendidos entre ellos.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo16 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero deseado");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero deseado");
        
        int num2 = entrada.nextInt();
        
        for (int i = num1; i < num2; i++) {
            
            if (i%4 == 0) {
                System.out.println(i);
                
            }
            
        }
        
        for (int i = num2; i < num1; i++) {
            
            if (i%4 == 0) {
                System.out.println(i);
                
            }
            
        }
    }
}
