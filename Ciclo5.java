/*
 * 11. Leer un número entero de dos dígitos y mostrar en pantalla todos 
 * los enteros comprendidos entre un dígito y otro.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo5 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero de dos digitos, positivo:");
        
        int num = entrada.nextInt();
        
        int dig1 = num/10;
        int dig2 = num%10;
        
        if (dig1 > 0 && dig1 < 10 && dig2 > 0 && dig2 < 10) {
            for (int i = 0; dig1 < dig2; dig1++) {
                System.out.println(dig1);
            }

            for (int j = 0; dig2 < dig1; dig2++) {
                System.out.println(dig2);
            }
        }
        
        else
            System.out.println("El numero ingresado debe ser de dos digitos "
                    + "y positivo...");
    }
}
