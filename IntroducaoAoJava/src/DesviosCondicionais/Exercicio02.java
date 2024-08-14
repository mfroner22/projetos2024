package DesviosCondicionais;

import java.util.Scanner;

/**
 * Faça um algoritmo para receber um número qualquer e informar na tela se é par
 * ou ímpar.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe um numero:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero é par:");
        } else {

            System.out.println("O numero é impar");
        }
    }
}