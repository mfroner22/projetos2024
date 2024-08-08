
package introducaoaojava;

import java.util.Scanner;


public class Exercicio08 {
    public static void main(String[] args) {
         System.out.println(" Calcular a exponenciação");
         System.out.println("Informe a base : ");
         Scanner entrada = new Scanner (System.in);
         int base = entrada.nextInt();
          System.out.println("Informe o expoente : ");
         int expo = entrada.nextInt();
         //para calcular expoente
        System.out.println("Resultado da exponenciação: "+ Math.pow(base, expo));
        
        
        
         
         
         
         
    }
    
}
