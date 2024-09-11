package Laco_While;

import java.util.Scanner;

/**
 * O material radioativo perde metade da massa a cada 50 segundos programa para
 * informar a massa inicial de um material radioativo, a massa final e o tempo
 * que levou em horas minutos e segundo
 *
 * @author Marcelo F Athayde
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor da massa do material:");
        double massa = entrada.nextDouble();
        double massaInicial = massa;
        int tempo = 0;
        while (massa > 0.5) {
            massa = massa / 2;
            tempo += 50;

        }
        System.out.println("Massa inicial = " + massaInicial);
        System.out.println("Massa Final:" + massa);
        System.out.println("Horas : " + tempo / 3600);
        System.out.println("Minutos : " + tempo % 3600 / 60);
        System.out.println("Segundos :" + tempo % 60);

    }

}
