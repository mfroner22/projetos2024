
package introducaoaojava;

import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println(" Calcular a média final do Aluno");
         Scanner entrada = new Scanner (System.in);
        System.out.println("Informe a Nota 1 do aluno:");
        double nota1 = entrada.nextDouble();
         System.out.println("Informe a Nota 2 do aluno::");
        double nota2 = entrada.nextDouble();
         System.out.println("Informe a Nota 3 do aluno::");
          double nota3 = entrada.nextDouble();
         System.out.println("Média Final do Aluno: " + ((nota1 * 2 + nota2 * 3 + nota3 * 5 )/ 10));
         
         
         
         
         
         
         
    }
    
}
