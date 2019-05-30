/*
 * 38. Leer un número entero y mostrar en pantalla su tabla de multiplicar.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo20 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero deseado:");
        
        int num = entrada.nextInt();
        int mult = 0;
        
        System.out.println("**********************************");
        System.out.println(" Tabla de multiplicar del: "+num);
        System.out.println("**********************************");
        
        for (int i = 1; i <= 10; i++) {
            mult = num*i;
            
            System.out.println(i+"*"+num+" = "+mult);
        }
    }
}
