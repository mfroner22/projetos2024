package DesviosCondicionais;

import java.util.Scanner;

/**
 * Escreva um algoritmo que receba a idade e o nome da pessoa e indique se ela é
 * criança (0 a 15 anos)adulta (15 a 60 anos) ou idosa (maior de 60)
 *
 * @author Marcelo F Athayde
 */
public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe seu Nome :");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        System.out.println("Informe sua idade :");
        int idade = entrada.nextInt();
        if (idade < 15) {
            System.out.println("Você é uma Criança");
        }
        if ((idade >= 15) && (idade < 60)) {
            System.out.println("Você é um Adulto");
        }
        if (idade > 60) {
            System.out.println("Você é um Idoso");
        }

    }

}
