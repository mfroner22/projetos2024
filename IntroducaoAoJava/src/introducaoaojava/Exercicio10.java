
package introducaoaojava;

import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Verificar se as Paredes estão no esquadro");
        System.out.println("Informe medida parede 1 : ");
         Scanner entrada = new Scanner (System.in);
         int parede1 = entrada.nextInt();
         System.out.println("Informe medida parede 2 : ");
         int parede2 = entrada.nextInt();
         System.out.println("Resultado :"+ Math.sqrt(Math.pow(parede1, 2)+ Math.pow(parede2, 2)));
         
         
       
         
    }
    
}
