package janelasdedialogo;

import javax.swing.JOptionPane;

/**
 * 2. Escreva um programa que apresente a seguinte pergunta em uma janela de
 * diálogo:  Você gosta de Programação?  Utilize a janela de confirmação com
 * as opções Sim e Não.  Apresente a opção escolhida;
 *
 * @author Marcelo F Athayde
 */
public class Exemplo02 {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null,
                "Você gosta de programação?", "...::: Pergunta :::...", JOptionPane.YES_NO_OPTION);
        if (opcao == 0) {
            JOptionPane.showMessageDialog(null, "Gosta de programação!!! Uhuuu");
        } else {
            JOptionPane.showMessageDialog(null, "Que pena!");
        }
    }

}
