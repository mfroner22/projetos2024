package Laco_While;

import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo01 {

    public static void main(String[] args) {
        System.out.println("Informe um valor entre 0 e 10 para Nota:");
        Scanner entrada = new Scanner(System.in);
        double nota = entrada.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota informada não é válida..");
            System.out.println("Informe um valor entre 0 e 10 para Nota:");
            nota = entrada.nextDouble();

        }
        System.out.println("Nota Informada ==>" + nota);

    }
}
