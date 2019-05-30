/*
 * 30. Leer un número entero y mostrar todos sus componentes numéricos 
 * o sea aquellos para quienes él sea un múltiplo.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo10 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el numero deseado:");

        int num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
            
                System.out.println(i);
            
            }
        }
    }
}
