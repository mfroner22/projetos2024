package Array;

import java.util.Scanner;

/**
 * crie um programa que receba 5 numeros em um vetor , e em seguida exiba a soma
 * dos elementos do vetor
 *
 * @author Marcelo F Athayde
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numero = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um numero" + (i + 1) + ":");
            numero[i] = entrada.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            soma += numero[i];
        }
        System.out.println("total dos numero :" + soma);

    }

}
