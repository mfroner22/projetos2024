package Array;

import java.util.Random;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo02 {

    public static void main(String[] args) {
        int[] idades = new int[10000];
        Random aleatorio = new Random();

        for (int i = 0; i < 10000; i++) {
            idades[i] = aleatorio.nextInt(101);
        }
        //mostre quantas pessoas tem mais de 60 anos
        int pessoasComMaisDe60anos = 0;
        for (int i = 0; i < 10000; i++) {
            if (idades[i] > 60) {
                pessoasComMaisDe60anos++;
            }
        }
        System.out.println("Pessoas com mais de 60 anos :" + pessoasComMaisDe60anos);

        //mostre a idade da pessoa mais velha
        int pessoaMaisVelha = 0;
        for (int i = 0; i < 10000; i++) {
            if (idades[i] > pessoaMaisVelha) {
                pessoaMaisVelha = idades[i];
            }
        }
        System.out.println("Pessoa mais velha :" + pessoaMaisVelha);

        //mostre as pessoas que sao menores de idade
        int qtdeDeMenores = 0;
        for (int i = 0; i < 10000; i++) {
            if (idades[i] < 18) {
                qtdeDeMenores++;

            }
        }
        System.out.println("Quantidade de pessoas menores :" + qtdeDeMenores);

        //exiba a media de todas as idades
        double totalIdades = 0;
        for (int i = 0; i < 10000; i++) {
            totalIdades = totalIdades + idades[i];
        }
        System.out.println("Media das idades de todas as pessoas: " + (totalIdades / 10000));

    }

}
