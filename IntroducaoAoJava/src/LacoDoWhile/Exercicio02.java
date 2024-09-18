package LacoDoWhile;

import static LacoDoWhile.Exercicio01.exibirMenu;
import java.util.Scanner;

/**
 * Desenvolva um sistema para a venda de ingressos e lanches em um cinema. O
 * cliente poderá comprar ingressos para filmes e adicionar lanches ao pedido. O
 * sistema deve exibir um menu com os filmes disponíveis e o preço do ingresso,
 * além de um menu de lanches com seus respectivos preços. No final, o sistema
 * deve calcular e exibir a quantidade de ingressos comprados, o total de
 * lanches adquiridos, o valor total gasto com ingressos, o valor total gasto
 * com lanches, e o valor final da compra. Exemplo de Menu de Filmes: 1.
 * Aventura Espacial - R$ 20,00 2. Comédia Romântica - R$ 18,00 3. Terror na
 * Floresta - R$ 22,00 4. Documentário Animal - R$ 15,00 5. Filme de Ação - R$
 * 25,00 Exemplo de Menu de Lanches: 1. Pipoca Média - R$ 10,00 2. Refrigerante
 * - R$ 8,00 3. Nachos - R$ 12,00 4. Balde de Pipoca Grande - R$ 15,00 5.
 * Chocolate - R$ 5,00
 *
 * @author Marcelo F Athayde
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        double totalIngr = 0;
        double totalLanches = 0;
        double qtdeFilmes = 0;
        double qtdeLanches = 0;

        //Do while para escolha dos filmes
        do {
            exibirMenuFilmes();
            int filme = entrada.nextInt();
            qtdeFilmes++;

            switch (filme) {
                //aqui incrementa a variavel do filme
                case 1:
                    totalIngr += 20;
                    break;
                case 2:
                    totalIngr += 18;
                    break;
                case 3:
                    totalIngr += 22;
                    break;
                case 4:
                    totalIngr += 15;
                    break;
                case 5:
                    totalIngr += 25;
                    break;

            }
            System.out.println(" Tem mais Filmes a escolher? :"
                    + "\nS = sim "
                    + "\nN = não");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));

        //Do while para escolha dos lanches
        do {
            exibirMenuLanches();
            int lanche = entrada.nextInt();
            qtdeLanches++;

            switch (lanche) {
                //aqui incrementa a variavel do filme
                case 1:
                    totalLanches += 10;
                    break;
                case 2:
                    totalLanches += 8;
                    break;
                case 3:
                    totalLanches += 12;
                    break;
                case 4:
                    totalLanches += 15;
                    break;
                case 5:
                    totalLanches += 5;
                    break;

            }
            System.out.println(" Tem mais Lanches a escolher? :"
                    + "\nS = sim "
                    + "\nN = não");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        System.out.println("Você comprou " + qtdeFilmes + " Ingressos " + "E " + qtdeLanches + " Lanches");
        System.out.println("Valor Total de Ingressos: R$ " + totalIngr);
        System.out.println("Valor Total de Lanches: R$ " + totalLanches);
        System.out.println("Valor Final da compra :R$ " + (totalIngr + totalLanches));

    }
    //Aqui o Menu de filmes

    public static void exibirMenuFilmes() {
        System.out.println("Menu Filmes :"
                + "\n1. Aventura Espacial - R$ 20,00"
                + "\n2. Comédia Romântica - R$ 18,00 "
                + "\n3. Terror na Floresta - R$ 22,00"
                + "\n4. Documentário Animal - R$ 15,00"
                + "\n5.Filme de Ação - R$ 25,00");
        System.out.println("Escolha Um Filme:");

    }
    //Aqui menu de lanches

    public static void exibirMenuLanches() {
        System.out.println("Menu Lanches :"
                + "\n1. Pipoca Média - R$ 10,00"
                + "\n2. Refrigerante - R$ 8,00 "
                + "\n3. Nachos - R$ 12,00"
                + "\n4. Balde de Pipoca Grande - R$ 15,00"
                + "\n5. Chocolate - R$ 5,00");
        System.out.println("Escolha Um Lanche no Menu:");

    }
}
