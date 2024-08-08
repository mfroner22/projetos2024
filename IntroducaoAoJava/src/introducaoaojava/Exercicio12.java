/*
 * T
 */
package introducaoaojava;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio12 {
    //Escreva um algoritmo para contar dinheiro.O usuário irá informar a quantia
    //de cédulas de 2, 5, 10, 20, 50,100, 200, Após isto o programa deve informar
    //o valor total de dinheiro contado.
    public static void main(String[] args) {
        System.out.println("Contador de Dinheiro");
        System.out.println("Informe Quantidade de Notas de 2 :");
        Scanner entrada = new Scanner (System.in);
         int notas2 = entrada.nextInt();
         System.out.println("Informe Quantidade de Notas de 5 :");
        int notas5 = entrada.nextInt();
         System.out.println("Informe Quantidade de Notas de 10 :");
        int notas10 = entrada.nextInt();
        System.out.println("Informe Quantidade de Notas de 20 :");
        int notas20 = entrada.nextInt();
        System.out.println("Informe Quantidade de Notas de 50 :");
        int notas50 = entrada.nextInt();
        System.out.println("Informe Quantidade de Notas de 100 :");
        int notas100 = entrada.nextInt();
        System.out.println("Informe Quantidade de Notas de 200 :");
        int notas200 = entrada.nextInt();
        System.out.println("Total de dinheiro = R$ "+ (notas2 *2 + notas5 * 5 +notas10 *10 + notas20 *20 + notas50 *50 + notas100 *100 + notas200 * 200));
        
        
        
         
    }
        
    
    
}
