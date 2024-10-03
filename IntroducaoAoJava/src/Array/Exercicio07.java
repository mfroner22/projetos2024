package Array;

import java.util.Scanner;

/**
 * Descrição: Você deve criar um programa em Java que permita ao usuário
 * gerenciar notas de alunos usando vetores.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio07 {

    Scanner entrada = new Scanner(System.in);
    String[] alunos = new String[10];
    double[] notasProgramacao = new double[10];
    double[] notasRedes = new double[10];
    double[] notasManutencao = new double[10];
    double[] notasDados = new double[10];
    double[] mediasNotas = new double[10];
    int quantidadeAlunosCadastrados = 0;
    int quantidadeNotasCadastradas = 0;

    public static void main(String[] args) {
        //aqui será solicitado os metodos criados para rodar o programa
        Exercicio07 minhaClasse = new Exercicio07();
        int opcao = 0;
        do {
            opcao = minhaClasse.monstrarMenu();
            switch (opcao) {
                case 0:
                    minhaClasse.mostrarRelatorioDeAlunos();
                    break;
                case 1:
                    minhaClasse.cadastrarAluno();
                    break;
                case 2:
                    minhaClasse.cadastrarNotas();
                    break;
                case 3:
                    minhaClasse.calcularMedia();
                    break;
                case 4:
                    minhaClasse.mostrarRelatorioDeAlunos();
                    break;
                case 5:
                    minhaClasse.ExibirAlunoComMaiorMedia();
                    break;
                case 6:
                    minhaClasse.exibirAlunoComMaiorNotaPorDisciplina();
                    break;
                case 7:
                    minhaClasse.mostrarResultadoFinal();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
                    break;

            }
            if (opcao != 8){
            // colocar um sout para nao aparcer sempre o menu
            System.out.println("Presssione qualquer tecla");
            minhaClasse.entrada.next();
            }
        } while (opcao != 8);

    }

    public int monstrarMenu() {
        System.out.println(" === Menu de Opções ===\n"
                + "0. Mostrar Relatório\n"
                + "1. Cadastrar Alunos\n"
                + "2. Cadastrar Notas\n"
                + "3. Calcular Médias\n"
                + "4. Exibir Médias\n"
                + "5. Exibir Aluno com Maior Média\n"
                + "6. Exibir Aluno com Maior Nota em determinada Disciplina\n"
                + "7. Exibir lista de alunos com o resultado final (aprovado ou reprovado)\n"
                + "8. Sair do Programa\n"
                + "Escolha uma opção (1-8):");
        int opcaoEscolhida = entrada.nextInt();
        return opcaoEscolhida;

    }
    

    public void cadastrarAluno() {
        System.out.println("Informe o nome do aluno: ");
        alunos[quantidadeAlunosCadastrados] = entrada.next();
        quantidadeAlunosCadastrados++;

    }
    

    public void cadastrarNotas() {
        System.out.println("Informe a nota da disciplina de Programação: ");
        notasProgramacao[quantidadeNotasCadastradas] = entrada.nextDouble();
        System.out.println("Informe a nota da disciplina de Redes: ");
        notasRedes[quantidadeNotasCadastradas] = entrada.nextDouble();
        System.out.println("Informe a nota da disciplina de Manutenção: ");
        notasManutencao[quantidadeNotasCadastradas] = entrada.nextDouble();
        System.out.println("Informe a nota da disciplina de Dados : ");
        notasDados[quantidadeNotasCadastradas] = entrada.nextDouble();
        quantidadeNotasCadastradas++;

    }

    public void mostrarRelatorioDeAlunos() {
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {

            System.out.println(alunos[i] + ": "
                    + notasProgramacao[i] + ", "
                    + notasManutencao[i] + ", "
                    + notasRedes[i] + ", "
                    + notasDados[i] + " Media ="
                    + mediasNotas[i]);

        }
    }

    public void calcularMedia() {
        for (int i = 0; i < quantidadeNotasCadastradas; i++) {
            mediasNotas[i] = (notasDados[i] + notasManutencao[i] + notasProgramacao[i] + notasRedes[i]) / 4;
        }
    }

    public void ExibirAlunoComMaiorMedia() {
        double maiorMedia = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
            if (maiorMedia < mediasNotas[i]) {
                maiorMedia = mediasNotas[i];
                indice = i;
            }
            
            
        }
        System.out.println(alunos[indice]+
                " ficou com a maior média geral. Média :"+mediasNotas[indice]);

    }
    
    public void exibirAlunoComMaiorNotaPorDisciplina() {
        double maiorNota = 0;
        int indice = 0;
        System.out.println("Informe a disciplina que deseja consultar: ");
        String disciplina = entrada.next();
        switch (disciplina) {
            case "programacao":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasProgramacao[i]) {
                        maiorNota = notasProgramacao[i];
                        indice = i;
                    }
                }
                break;
            case "redes":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasRedes[i]) {
                        maiorNota = notasRedes[i];
                        indice = i;
                    }
                }
                break;
            case "manutencao":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasManutencao[i]) {
                        maiorNota = notasManutencao[i];
                        indice = i;
                    }
                }
                break;
            case "dados":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasDados[i]) {
                        maiorNota = notasDados[i];
                        indice = i;
                    }
                }
                break;
                default:
                    System.out.println("Esta disciplina não existe no curso");
                    break;
        }
        
        
        
        System.out.println(alunos[indice]
                + " ficou com a maior nota na disciplina de "+disciplina+". Nota: "+ maiorNota);
    }
    public void mostrarResultadoFinal() {
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
            if(mediasNotas[i]>=60){
                System.out.println(alunos[i]+": Aprovado!");
            }else{
                System.out.println(alunos[i]+": Reprovado!");
            }
        }
    }
    
}
