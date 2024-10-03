package Array;

import java.util.Scanner;

/**
 * Você deve criar um programa em Java que permita ao usuário gerenciar vendas
 * de produtos usando vetores.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio08 {

    Scanner entrada = new Scanner(System.in);
    String[] produtos = new String[10];
    double[] precos = new double[10];
    int[] estoque = new int[10];
    int[] faturamento = new int[10];
    int quantidadeProdutos = 0;

    //aqui será solicitado o menu
    public static void main(String[] args) {

        Exercicio08 minhaClasse = new Exercicio08();
        minhaClasse.preencherListas();

        int opcao = 0;
        do {
            opcao = minhaClasse.monstrarMenu();
            switch (opcao) {
                case 0:
                    minhaClasse.motrarRelatorioDeProdutos();
                    break;
                case 1:
                    minhaClasse.cadastrarProduto();
                    break;
                case 2:
                    minhaClasse.realizarVenda();
                    break;
                case 3:
                    minhaClasse.mostrarFaturamento();
                    break;
                case 4:
                    minhaClasse.exibirProdutoMaisVendido();
                    break;
                case 5:
                    minhaClasse.exibirProdutoComMaiorFaturamento();
                    break;
                case 6:

                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
                    break;

            }
            if (opcao != 7) {
                // colocar um sout para nao aparcer sempre o menu
                System.out.println("Presssione qualquer tecla");
                minhaClasse.entrada.next();
            }
        } while (opcao != 8);

    }

    public int monstrarMenu() {
        System.out.println(" === Menu de Opções ===\n"
                + "0. Mostrar Relatório\n"
                + "1. Cadastrar Produto\n"
                + "2. Realizar Venda\n"
                + "3. Exibir Faturamento Total\n"
                + "4. Exibir Produto mais Vendido\n"
                + "5. Exibir Produto com Maior Faturamento\n"
                + "6. Relatório de Estoque Baixo\n"
                + "7. Sair do Programa\n"
                + "Escolha uma opção (1-7):");
        int opcaoEscolhida = entrada.nextInt();
        return opcaoEscolhida;
    }

    public void realizarVenda() {
        System.out.println("==== VENDAS ====");
        System.out.println("Informe o produto:");
        String produto = entrada.next();
        System.out.println("Informe a Quantidade:");
        int quantidade = entrada.nextInt();

        for (int i = 0; i < quantidadeProdutos; i++) {
            if (produto.equalsIgnoreCase(produtos[i])) {
                if (quantidade <= estoque[i]) {
                    //atualizar estoque
                    estoque[i] = estoque[i] - quantidade;
                    //atualizar o faturamento
                    faturamento[i] += precos[i] * quantidade;
                    System.out.println("Produto vendido com sucesso!");
                    return;
                } else {
                    System.out.println("Quantidade insuficiente para fazer a venda");
                    return;

                }

            }
            System.out.println("Produto nao foi encontrado!");
        }

    }

    public void cadastrarProduto() {
        System.out.println("Informe o nome do produto: ");
        produtos[quantidadeProdutos] = entrada.next();
        System.out.println("Informe o preço do produto:");
        precos[quantidadeProdutos] = entrada.nextDouble();
        System.out.println("Informe o estoque do produto:");
        estoque[quantidadeProdutos] = entrada.nextInt();
        quantidadeProdutos++;
    }

    public void mostrarFaturamento() {
        System.out.println("=== FATURAMENTO ===");

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println(produtos[i] + ": " + faturamento[i]);

        }
    }

    public void motrarRelatorioDeProdutos() {
        System.out.println(
                formatarSaida("Nome", 20)
                + formatarSaida("Preço", 10)
                + formatarSaida("Estoque", 10));
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println(formatarSaida(produtos[i], 20)
                    + formatarSaida("R$ " + precos[i], 10)
                    + formatarSaida("" + estoque[i], 10));
        }
    }

    public void exibirProdutoMaisVendido() {
        double quantProdutoMaisVendido = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (quantProdutoMaisVendido < (faturamento[i] / precos[i])) {
                quantProdutoMaisVendido = faturamento[i] / precos[i];
                indice = i;

            }

        }
        System.out.println(produtos[indice] + " foi o produto mais vendido com " + "" + quantProdutoMaisVendido + " unidades");

    }

    public void exibirProdutoComMaiorFaturamento() {
        double maiorFaturamento = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (maiorFaturamento < faturamento[i]) {
                maiorFaturamento = faturamento[i];

            }
        }
        System.out.println(produtos[indice] + " foi o produto com maior faturamento.");

    }

    public void preencherListas() {
        produtos[0] = "Arroz";
        produtos[1] = "Feijão";
        produtos[2] = "Erva";
        precos[0] = 12.05;
        precos[1] = 16.55;
        precos[2] = 11.12;
        estoque[0] = 10;
        estoque[1] = 20;
        estoque[2] = 30;
        quantidadeProdutos = 3;
    }

    public String formatarSaida(String texto, int tamanho) {
        while (texto.length() < tamanho) {
            texto = " " + texto;
        }
        return texto;
    }

}
