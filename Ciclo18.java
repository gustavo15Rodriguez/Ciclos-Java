/*
 * 16. Mostrar en pantalla el promedio entero de los n primeros múltiplos 
 * de 3 para un número n leído.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo18 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite el numero deseado:");
        
        int num = entrada.nextInt();
        
        int suma = 0;
        int cont = 0;
        int prom = 0;
        
        for (int i = 1; i < num; i++) {
            
            if (i%3 == 0) {
                
                suma+=i;
                cont += 1;
                prom = suma/cont;
            }
            
            
        }
        System.out.println("El promedio de los numeros multiplos de 3 para el"
                +" numero leido es: "+prom);
            
    }
}
