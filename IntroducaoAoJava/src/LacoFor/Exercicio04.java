package LacoFor;

import java.util.Scanner;

/**
 * Ler 5 (cinco) numeros, informar a soma e a média dos numeros
 *
 * @author Marcelo F Athayde
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 5; i += 1) {
            System.out.println("Informe o valor " + i);
            soma = soma + entrada.nextDouble();
        }
        System.out.println("Tota dos numeros = " + soma);
        double media = 0;
        media = soma / 5;
        System.out.println("media = " + media);

    }

}
