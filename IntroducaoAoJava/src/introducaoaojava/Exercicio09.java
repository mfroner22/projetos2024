
package introducaoaojava;

import java.util.Scanner;


public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println("Calcular a Raiz quadrada de um numero qualquer");
        System.out.println("Informe um numero : ");
         Scanner entrada = new Scanner (System.in);
         int numero = entrada.nextInt();
         // Para calcular raiz quadrada = Math.sqrt
         System.out.println("A Raiz quadrada é :"+ Math.sqrt(numero));
         
    }
    
}
