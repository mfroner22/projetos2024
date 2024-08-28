package switchCase;

import java.util.Scanner;

/**
 * CALCULADORA
 *
 * @author Marcelo F Athayde
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora:");
        System.out.println("Informe o valor 1:");
        double valor1 = entrada.nextDouble();

        System.out.println("Informe a operação:");
        String op = entrada.next();

        System.out.println("Informe o Valor 2:");
        double valor2 = entrada.nextDouble();

        switch (op) {
            case "+":
                System.out.println("Resultado = " + (valor1 + valor2));
                 break;
            case "-":
                System.out.println("Resultado = " + (valor1 - valor2));
                 break;
            case "*":
                System.out.println("Resultado = " + (valor1 * valor2));
                 break;
            case "/":
                System.out.println("Resultado = " + (valor1 / valor2));
                 break;
            default:
                System.out.println("Operação não suportada!");
                break;

        }
    }
}
