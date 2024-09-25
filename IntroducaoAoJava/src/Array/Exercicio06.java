package Array;

import java.util.Scanner;

/**
 * 6. Crie um programa que receba um vetor de 6 nomes. O usuário deve fornecer
 * um nome, * e o programa deve informar se o nome está presente no vetor. Se o
 * nome for encontrado, exiba a posição dele no vetor.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[6];
        String nomepesquisa = "";

        for (int i = 0; i < 6; i++) {
            System.out.println("Informe o nome para o vetor  " + (i + 1) + ":");
            nomes[i] = entrada.next();
        }
        System.out.println("I N F O R M E   U M  N O M E/ PARA PESQUIISAR");
        nomepesquisa = entrada.next();

        boolean encontrado = false;
        for (int i = 0; i < 6; i++) {
            if (nomepesquisa.equals(nomes[i])) {
                System.out.println("Nome encontrado na posição : " + (i + 1) + " do vetor");
                encontrado = true;
            }

        }
        if (!encontrado) {
            System.out.println("nome não encontrado");
        }
    }

}
