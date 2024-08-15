package DesviosCondicionais;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia uma variável e some 5,caso seja par ou some 8,
 * caso seja ímpar, imprimir o resultado desta operação.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Numero par +5 \nNumero impar +8");
        System.out.println("Informe um numero:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Numero =" + (numero + 5));
        } else {
            System.out.println("Numero =" + (numero + 8));
        }
    }

}
