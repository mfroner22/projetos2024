package switchCase;

import java.util.Scanner;

/**
 * Escreva um algoritmo que recebe como entrada o ano e o mês. O seu programa
 * deve apresentar a quantidade de dias deste mês. Obs.: Considere que fevereiro
 * pode ter 29 dias em anos bissextos.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Calendario");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Ano: ");
        int ano = entrada.nextInt();
        System.out.println("Informe o Mês: ");
        int mes = entrada.nextInt();
        switch (mes) {
            case 1:
                System.out.println("31 Dias");
                break;
            case 3:
                System.out.println("31 Dias");
                break;
            case 4:
                System.out.println("30 Dias");
                break;
            case 5:
                System.out.println("31 Dias");
                break;
            case 6:
                System.out.println("30 Dias");
                break;
            case 7:
                System.out.println("31 Dias");
                break;
            case 8:
                System.out.println("31 Dias");
                break;
            case 9:
                System.out.println("30Dias ");
                break;
            case 10:
                System.out.println("31 Dias");
                break;
            case 11:
                System.out.println("30 Dias");
                break;
            case 12:
                System.out.println("31 Dias");
                break;
            case 2:
                if (ano % 4 == 0) {
                    System.out.println("29 Dias");
                } else {
                    System.out.println("28 Dias");
                }
                break;
            default:
                System.out.println("ano ou mes invalido");
        }
    }
}
