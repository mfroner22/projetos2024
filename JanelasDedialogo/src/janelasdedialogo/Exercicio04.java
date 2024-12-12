package janelasdedialogo;

import javax.swing.JOptionPane;

/**
 * Elabore um programa de pesquisa de opinião pública com as seguintes
 * perguntas: 1) Qual é a sua cor preferida? (Amarelo, Verde, Vermelho ou Azul)
 * 2) Qual é a sua comida preferida? (Churrasco, Pizza, Macarronada ou Lasanha)
 * 3) Qual é seu esporte favorito? (Voleibol, Futebol, Corrida ou Poker 4) Qual
 * curso de graduação você jamais faria? (Computação, Veterinária, Medicina ou
 * Matemática)
 *
 * @author Marcelo F Athayde
 */
public class Exercicio04 {

    String[] cores = {"Amarelo", "Verde", "Vermelho", "Azul"};
    String[] comidas = {"Churrasco", "Pizza", "Macarronada", "Lasanha"};
    String[] esportes = {"Voleibol", "Futebol", "Corrida", "Poker"};
    String[] cursos = {"Computação", "Vetrinaria", "Medicina", "Matematica"};

    int[] votosCores = new int[4];
    int[] votosComidas = new int[4];
    int[] votosEsportes = new int[4];
    int[] votosCursos = new int[4];
    int quantidadedeVotos = 0;

    public static void main(String[] args) {
        Exercicio04 ex = new Exercicio04();
        do {
            ex.quantidadedeVotos++;
            int corEscolhida = JOptionPane.showOptionDialog(null, "Qual sua cor preferida?", "Escolha uma Cor", 0, 3, null, ex.cores, null);
            ex.votosCores[corEscolhida]++;
            int comidaEscolhida = JOptionPane.showOptionDialog(null, "Qual sua comida preferida?", "Escolha uma Comida", 0, 3, null, ex.comidas, null);
            ex.votosComidas[corEscolhida]++;
            int esporteEscollhido = JOptionPane.showOptionDialog(null, "Qual seu esporte preferido?", "Escolha um Esporte", 0, 3, null, ex.esportes, null);
            ex.votosEsportes[corEscolhida]++;
            int cursoEscolhido = JOptionPane.showOptionDialog(null, "Qual seu curso preferido?", "Escolha um Curso", 0, 3, null, ex.cursos, null);
            ex.votosCursos[corEscolhida]++;
        } while (JOptionPane.showConfirmDialog(null, "Tem mais alguém para responder?") == 0);
        ex.mostrarSaida(ex.cores, ex.votosCores, "RESULTADO DAS CORES\n");
    }

    public void mostrarSaida(String[] opcoes, int[] votos, String tipos) {
        String saida = tipos;
        for (int i = 0; i < 4; i++) {
            saida += opcoes[i] + ": " + (votos[i] * 100 / quantidadedeVotos) + "%\n";

        }
        JOptionPane.showMessageDialog(null, saida);
    }

}
