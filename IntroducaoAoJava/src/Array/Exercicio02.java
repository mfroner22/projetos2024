package Array;

import java.util.Scanner;

/**
 * Desenvolva um programa que armazene 10 numeros em um vetor e, em seguida ,
 * conte quantos desses numeros são negativos
 *
 * @author Marcelo F Athayde
 */
public class Exercicio02 {

    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero positivo ou negativo" + (i + 1) + ":");
            num[i] = entrada.nextInt();
        }
        int qtdeNegativos = 0;
        for (int i = 0; i < 10; i++) {
            if (num[i] < 0) {
                qtdeNegativos++;
            }
        }
        System.out.println("Foram digitados :" + qtdeNegativos + " numeros negativos");

    }

}
