package LacoDoWhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int valorSorteado = aleatorio.nextInt(10) + 1;
        int valorChutado = -1;
        int cont = 0;

        System.out.println("Jogo da SENNA!!");
        System.out.println("Chute um numero de 1 a 10");

        do {
            cont++;
            valorChutado = entrada.nextInt();
            if (valorSorteado < valorChutado) {
                System.out.println("Você errou, O Numero sorteado é maior");

            } else if (valorSorteado > valorChutado) {
                System.out.println("Você errou, O Numero sorteado é menor");
            }
        } while (valorSorteado != valorChutado);
        if (cont < 3) {
            System.out.println("P A R A B É N S *** voce acertou  Numero do  sorteio em  " + cont + "chutes");
        } else if (cont > 5) {
            System.out.println("Você foi muito mal");
        } else {
            System.out.println("Voce pode melhorar");
        }

    }
}
