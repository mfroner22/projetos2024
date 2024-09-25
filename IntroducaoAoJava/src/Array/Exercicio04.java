package Array;

import java.util.Scanner;

/**
 * 4. Desenvolva um programa que armazene 8 números reais em um vetor. Calcule e
 * exiba a média desses números. O programa também deve mostrar os números que
 * são maiores que a média.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numero = new int[8];
        double soma = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Informe um numero " + (i + 1) + ":");
            numero[i] = entrada.nextInt();
            soma += numero[i];

        }
        double media = soma / 8;
        System.out.println("Media = " + soma / 8);
        for (int i = 0; i < 8; i++) {
            if (numero[i] > media) {
                System.out.println(" numero maior media" + numero[i]);
            }
        }

    }
}
