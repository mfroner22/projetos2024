package DesviosCondicionais;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia dois valores inteiros A e B se os valores forem
 * iguais deverá se somar os dois caso contrário multiplique A por B.Ao final de
 * qualquer um dos cálculos deve-se atribuir o resultado para uma variável C e
 * mostrar seu conteúdo na tela.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Informe o valor para A:");
        Scanner entrada = new Scanner(System.in);
        int valorA = entrada.nextInt();
        System.out.println("Informe o valor para B:");
        int valorB = entrada.nextInt();
        int c;
        if (valorA == valorB) {
            c = valorA + valorB;
            System.out.println("Resultado : o valor de c é uma soma  = " + c);
        } else {
            c = valorA * valorB;
            System.out.println("Resultado : o valor de c é multiplicação =" + c);
        }

    }

}
