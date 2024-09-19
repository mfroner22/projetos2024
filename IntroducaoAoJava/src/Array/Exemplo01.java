package Array;

import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estados = new String[5];
        String[] capitais = new String[5];
        int[] populacoes = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o Estado" + (i + 1) + ":");
            estados[i] = entrada.next();

            System.out.println("Informe a capital " + (i + 1) + ":");
            capitais[i] = entrada.next();

            System.out.println("Informe a população " + (i + 1) + ":");
            populacoes[i] = entrada.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(estados[i] + " - " + capitais[i] + " - " + populacoes[i]);
        }
    }
}
