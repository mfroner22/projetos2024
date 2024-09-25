package Array;

import java.util.Scanner;

/**
 *
 * 3. Escreva um programa que armazene 5 nomes em um vetor de String e exiba o
 * nome com o maior número de caracteres.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        String maiornome = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome" + (i + 1) + ":");
            nomes[i] = entrada.next();
            if (nomes[i].length() > maiornome.length()) {
                maiornome = nomes[i];

            }
        }
        System.out.println("O nome com mais caracteres é: " + maiornome);

    }
}
