package DesviosCondicionais;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas
 * por um aluno nas 3 verificações e a média dos exercícios que fazem parte da
 * avaliação, e calcule a média de aproveitamento, usando a fórmula: MA :=
 * (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7 A atribuição dos conceitos obedece a
 * tabela abaixo. O algoritmo deve escrever o número do aluno, suas notas, a
 * média dos exercícios, a média de aproveitamento, o conceito correspondente e
 * a mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o
 * conceito for D ou E. Média de aproveitamento Conceito A. >= 90 B. >= 75 e < 90
 * C. >= 60 e < 75
 * D. >= 40 e < 60 E. < 40 @
 *
 *
 * author Marcelo F Athayde
 */
public class Exercicio10 {

    public static void main(String[] args) {
        System.out.println("Informe Numero do aluno:");
        Scanner entrada = new Scanner(System.in);
        int aluno = entrada.nextInt();
        System.out.println("Nota 1:");
        int nota1 = entrada.nextInt();
        System.out.println("Nota 2:");
        int nota2 = entrada.nextInt();
        System.out.println("Nota 3:");
        int nota3 = entrada.nextInt();
        System.out.println("Media de exercicios:");
        int me = entrada.nextInt();
        double ma = (nota1 + nota2 * 2 + nota3 * 3 + me) / 7;
        if (ma >= 90) {
            System.out.println("Aluno :" + aluno + " Foi APROVADO com conceito A");
        } else if (ma >= 75) {
            System.out.println("Aluno :" + aluno + " Foi APROVADO com conceito B");
        } else if (ma >= 60) {
            System.out.println("Aluno :" + aluno + " Foi APROVADO com conceito C");
        } else if (ma >= 40) {
            System.out.println("Aluno :" + aluno + " Foi REPROVADO com conceito D(r e c u p e r a ç ã o)");
        } else {
            System.out.println("Aluno :" + aluno + " Foi REPROVADO com conceito E");
        }

    }

}
