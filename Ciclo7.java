/*
 * 14. Mostrar en pantalla los primeros 20 múltiplos de 3.
 */
package ciclos;

/**
 *
 * @author gustavo
 */
public class Ciclo7 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 60; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }

    }
    
}
