/*
 * 37. Generar todas las tablas de multiplicar del 1 al 10.
 */
package ciclos;

/**
 *
 * @author gustavo
 */
public class Ciclo2 {
    
    public static void main(String[] args){
        
        for (int i = 1; i <=10; i++)
        {
            System.out.println("\n\n-----Tabla del------"+i);
            for(int k=0;k<=10;k++){
                
                int result = i*k;
                
                System.out.println(i+"*"+k+"="+result);
                
            }
        }

    
    }
    
}
