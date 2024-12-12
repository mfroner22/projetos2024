package janelasdedialogo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Você foi contratado para desenvolver uma aplicação para gerenciar uma
 * competição de natação. O programa deve permitir cadastrar os atletas (nomes)
 * que estão inscritos na competição. Para isso, você deve utilizar um vetor do
 * tipo String. Além disso, o programa deve armazenar se o atleta completou a
 * prova ou não (usando um vetor de boolean), o tempo que cada atleta levou para
 * concluir a prova (em minutos, usando um vetor de double), e a quantidade de
 * voltas completadas na piscina (usando um vetor de int).
 *
 * @author Marcelo F Athayde
 */
public class Atividadecomplementar {

    Scanner entrada = new Scanner(System.in);
    String[] atletas = new String[10];
    int quantidadeAtletas = 0;
    boolean[] provaCompletada = new boolean[10];
    double[] tempoProva = new double[10];
    int[] voltasCompletadas = new int[10];
    int resultadosResgistrados = 0;

    public static void main(String[] args) {
        Atividadecomplementar minhaClasse = new Atividadecomplementar();

        int opcao = 0;
        do {
            opcao = minhaClasse.monstrarMenu();
            switch (opcao) {
                case 1:
                    minhaClasse.cadastrarAtleta();
                    break;
                case 2:
                    minhaClasse.completouAprova();
                    break;
                case 3:
                    minhaClasse.exibirRelatorio();
                    break;
                case 4:
                    minhaClasse.exibirRelatorioDeAtletasQueCompletaramAprova();
                    break;
                case 5:
                    minhaClasse.exibirRelatorioDeAtletasQueNaoCompletaramAprova();
                    break;
                case 6:
                    minhaClasse.atletaComMelhorDesempenho();
                    break;
                case 7:
                    minhaClasse.numeroTotalDeVoltas();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
                    break;

            }

        } while (opcao != 8);
    }

    public void cadastrarAtleta() {
        // System.out.println
        String nome = JOptionPane.showInputDialog("Informe o nome do atleta: ");

        atletas[quantidadeAtletas] = nome;
        provaCompletada[quantidadeAtletas] = false;
        voltasCompletadas[quantidadeAtletas] = 0;
        quantidadeAtletas++;

    }

    public void completouAprova() {
        String atleta = JOptionPane.showInputDialog("Informe o nome do atleta:");
        for (int i = 0; i < quantidadeAtletas; i++) {
            if (atletas[i].equalsIgnoreCase(atleta)) {
                provaCompletada[i] = true;
                tempoProva[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de prova:"));
                voltasCompletadas[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a Qtde. de voltas completadas:"));
                resultadosResgistrados++;
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Este atleta não est´pa cadastrado!");
    }

    public void exibirRelatorio() {
        String saida = "RELATÓRIO COMPLETO DE ATLETAS\n";
        for (int i = 0; i < quantidadeAtletas; i++) {
            saida += atletas[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void exibirRelatorioDeAtletasQueCompletaramAprova() {
        String saida = "RELATORIO DE ATLETAS - PROVA COMPLETA\n";
        for (int i = 0; i < quantidadeAtletas; i++) {
            if (provaCompletada[i]) {
                saida += atletas[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void exibirRelatorioDeAtletasQueNaoCompletaramAprova() {
        String saida = "RELATORIO DE ATLETAS - QUE NAO COMPLETARAM A PROVA\n";
        for (int i = 0; i < quantidadeAtletas; i++) {
            if (!provaCompletada[i]) {
                saida += atletas[i] + "\n";
            }
            //  JOptionPane.showMessageDialog(null, saida);
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void numeroTotalDeVoltas() {
        int total = 0;
        for (int i = 0; i < quantidadeAtletas; i++) {
            total += voltasCompletadas[i];
        }
        JOptionPane.showMessageDialog(null, "Total de voltas completas por todos os atletas:" + total);
    }

    public void atletaComMelhorDesempenho() {
        if (resultadosResgistrados > 0) {
            Double melhorDesempenho = tempoProva[0];
            for (int i = 0; i < quantidadeAtletas; i++) {
                if (provaCompletada[i]) {
                    if (melhorDesempenho > tempoProva[i]) {
                        melhorDesempenho = tempoProva[i];
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "MELHOR DESEMPENHO: " + melhorDesempenho);
        }
    }

    public int monstrarMenu() {
        //   System.out.println(
        return Integer.parseInt(JOptionPane.showInputDialog(" === Menu de Opções ===\n"
                + "1. Cadastrar Atletas\n"
                + "2. Registrar resultado de um atleta (completar prova, tempo de conclusão e voltas completadas)\n"
                + "3. Exibir relatório completo dos atletas\n"
                + "4. Exibir relatório de atletas que completaram a prova\n"
                + "5. Exibir relatório de atletas que NÃO completaram a prova\n"
                + "6. Exibir o atleta que concluiu a prova no menor tempo\n"
                + "7. Exibir o número total de voltas completadas por todos os atletas\n"
                + "8. Sair da Aplicação\n"
                + "Escolha uma opção (1-7):"));
        //int opcaoEscolhida = entrada.nextInt();
        //return opcaoEscolhida;
    }

}
