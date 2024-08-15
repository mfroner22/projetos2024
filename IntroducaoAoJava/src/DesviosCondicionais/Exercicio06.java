package DesviosCondicionais;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os
 * em ordem decrescente.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("Informe valor 1:");
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        System.out.println("Informe Valor 2:");
        int b = entrada.nextInt();
        System.out.println("Informe Valor 3:");
        int c = entrada.nextInt();
        if ((a > b) && (b > c)) {
            System.out.println("Resultado:" + a + "," + b + "," + c);
        } else if ((a > c) && (c > b)) {
            System.out.println("Resultado:" + a + "," + c + "," + b);
        } else if ((b > a) && (a > c)) {
            System.out.println("Resultado:" + b + "," + a + "," + c);
        } else if ((b > c) && (c > a)) {
            System.out.println("Resultado:" + b + "," + c + "," + a);
        } else if ((c > a) && (a > b)) {
            System.out.println("Resultado:" + c + "," + a + "," + b);
        } else if ((c > b) && (b > a)) {
            System.out.println("Resultado:" + c + "," + b + "," + a);

        }

    }
}
