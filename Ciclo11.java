/*
 * 8. Mostrar en pantalla todos los pares 
 * comprendidos entre 20 y 200.
 */
package ciclos;

/**
 *
 * @author gustavo
 */
public class Ciclo11 {
    
    public static void main(String[] args) {
        
        for (int i = 20; i <= 200; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
