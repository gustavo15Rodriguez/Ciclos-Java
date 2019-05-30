/*
 * 36. Mostrar en pantalla la tabla de multiplicar del número 5.
 */
package ciclos;

/**
 *
 * @author gustavo
 */
public class Ciclo19 {
    public static void main(String[] args) {
        int mult = 0;
        
        for (int i = 1; i <=10; i++) {
            mult= i*5;
            System.out.println(i+"*"+"5"+" = "+mult);
        }
    }
    
}
