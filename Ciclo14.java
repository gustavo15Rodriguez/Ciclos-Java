/*
 * 12. Leer un número entero de 3 dígitos y determinar si tiene el dígito 1..
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo14 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero de tres digitos:");
        
        int num = entrada.nextInt();
        
        int cont = 0;
        
        while (num >= 100 || num < 1000) {
            int dig1 = num/100;
            int dig2 = (num/100)%10;
            int dig3 = num % 10;
            
            
            if (dig1 == 1 || dig2 == 1 || dig3 == 1) {
                cont ++;  
            }
            break;
        }
        
        if (cont > 0) {
            System.out.println("El numero ingresado si posee el digito 1.");
        }
        
        else
            System.out.println("El numero ingreso no posee el digito 1.");
    }
}
