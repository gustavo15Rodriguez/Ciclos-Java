/*
 * Se define la serie de Fibonacci como la serie que comienza con los dígitos 1 y 0 y va
 * sumando progresivamente los dos últimos elementos de la serie, así:
 * 0 1 1 2 3 5 8 13 21 34.......
 * Utilizando el concepto de ciclo generar la serie de Fibonacci hasta llegar o sobrepasas el
 * número 10000.
 */
package ciclos;

/**
 *
 * @author gustavo
 */
public class Ciclo3 {
    
    public static void main(String[] args) {
        
        int num = 1;
        int ultimo = 0;
        int penultimo = 0;
        
        System.out.println(0);
        System.out.println(1);
        
        for ( int i = 0; i <20; i++) {
            penultimo = ultimo;
            ultimo = num;
            num = penultimo + ultimo;
            
            System.out.println(num);
            
        }
       
    }
    
}
