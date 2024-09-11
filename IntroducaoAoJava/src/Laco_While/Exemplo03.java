package Laco_While;

import java.util.Scanner;

/**
 * 3 Faça um programa que leia e valide as seguintes informações: a. Nome: maior
 * que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior que zero; d.
 * Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
 *
 * @author Marcelo F Athayde
 */
public class Exemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //validando nome
        System.out.println("Informe o Nome:");
        String nome = entrada.next();

        while (nome.length() <= 3) {
            System.out.println("Infome um nome com mais de 3 caracteres");
            System.out.println("Informe o Nome:");
            nome = entrada.next();
        }
        //Validando a idade 0 e 150

        System.out.println("Infome a idade:");
        int idade = entrada.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Informe uma idade entre 0 e 150!");
            idade = entrada.nextInt();
        }
        //Validando o salario
        System.out.println("Infome o salario:");
        int salario = entrada.nextInt();
        while (salario <= 0) {
            System.out.println("Informe um salario maior que 0(zero)!");
            salario = entrada.nextInt();
        }
        //Validando tipo de sexo
        System.out.println("Informe o sexo:");
        String sexo = entrada.next();

        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Tipo de sexo invalido!");
            System.out.println("Informe o sexo:");
            sexo = entrada.next();
        }
        //Validando o estado civil
        System.out.println("Informe o estado civil:");
        String civil = entrada.next();

        //  while (!civil.equals("s") && !civil.equals("c") && !civil.equals("v") && !civil.equals("d")) {
        while (!"scdv".contains(civil) || civil.length() > 1) {
            System.out.println("Tipo de estado civil invalido!");
            System.out.println("Informe o estado civil:");
            civil = entrada.next();

        }

    }
}
