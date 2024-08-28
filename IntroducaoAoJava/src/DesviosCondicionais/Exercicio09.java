package DesviosCondicionais;

import java.util.Scanner;

/**
 * Elabore um algoritmo que calcule o que deve ser pago por um produto,
 * considerando o preço normal de etiqueta e a escolha da condição de pagamento.
 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
 * escolhida e efetuar o cálculo adequado. Código Condição de pagamento a) À
 * vista em dinheiro ou cheque, recebe 10% de desconto b) À vista no cartão de
 * crédito, recebe 15% de desc c) Em duas vezes, preço normal de etiqueta sem
 * juros d) Em 10 vezes, preço normal de etiqueta mais juros de 10%
 *
 * @author Marcelo F Athayde
 */
public class Exercicio09 {

    public static void main(String[] args) {
        System.out.println("Informe Valor pago");
        Scanner entrada = new Scanner(System.in);
        double valorm = entrada.nextDouble();
        System.out.println("Informe Forma pagamento:"
                + "\n Digite 1 - Cheque"
                + "\n Digite 2 - Cartão"
                + "\n Digite 3 - Parcelar em duas vezes"
                + "\n Digite 4 - Parcelar em 10 vezes");
        System.out.println("Informe forma pgto: ");
        double fpgto = entrada.nextDouble();
        if (fpgto == 1) {
            System.out.println("Valor pago:" + valorm * 0.9);
        } else if (fpgto == 2) {
            System.out.println("Valor pago:" + valorm * 0.85);
        } else if (fpgto == 3) {
            System.out.println("Valor a pagar em duas vezes de:" + valorm / 2);
        } else if (fpgto == 4) {
            System.out.println("Valor a pagar em dez vezes de:" + (valorm * 1.10) / 10);
        } else {
            System.out.println("Forma pagamento envalida");
        }

    }

}
