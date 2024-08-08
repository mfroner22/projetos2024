
package introducaoaojava;

import java.util.Scanner;


public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Preço de Fábrica do Veículo:");
        
        double fabrica = entrada.nextDouble();
        double distribuidor = fabrica * 28 /100;
         double imposto = fabrica * 45 /100;
         
        
         System.out.println("Distribuidor = 28% Imposto = 45%");
          System.out.println("Preço final ao consumidor: "+(fabrica + distribuidor + imposto) );
          
                  ;
          
        
    }
    
}
