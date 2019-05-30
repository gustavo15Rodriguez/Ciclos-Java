/*
 * 31. Leer números hasta que digiten 0 y determinar a cuánto es igual 
 * el promedio de los números terminados en 5.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Ciclo12 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num = -1;
        int suma = 0;
        int promedio = 0;
        int cont = 0;
        
        while (num !=0) {
            System.out.println("Digite el numero que desee: ");   
            num = entrada.nextInt();
           
            if (num%5 == 0 && num!=0) {
                suma +=num;
                cont++;
                
            }
            
        }
        
        if (cont!=0) {
            promedio = suma/cont;
            System.out.println("El promedio de los numeros terminados "
                    + "en 5 es: "+promedio);
        }
        
        else
            System.out.println("El promedio de los numeros terminados en 5 no se puede"
                    + " realizar.");
        
    }
}
