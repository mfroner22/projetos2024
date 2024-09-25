package Array;

import java.util.Scanner;

/**
 * 5. Desenvolva um programa que receba dois vetores de 5 números inteiros cada
 * um. * O programa deve gerar um terceiro vetor, onde cada elemento é o
 * resultado da multiplicação dos elementos correspondentes dos dois vetores *
 * iniciais. Exiba o vetor resultante.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros1 = new int[5];
        int[] numeros2 = new int[5];
        int[] multiplicanumeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o numero " + (i + 1) + " do Vetor1  :");

            numeros1[i] = entrada.nextInt();

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o numero " + (i + 1) + " do Vetor2  :");
            numeros2[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            multiplicanumeros[i] = numeros1[i] * numeros2[i];
            System.out.println("Multiplicacao dos vetores na posição : " + (i + 1) + "  = " + multiplicanumeros[i]);

        }

    }
}
