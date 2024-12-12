package janelasdedialogo;

import javax.swing.JOptionPane;

/**
 * Faça uma classe Java que receba um número inteiro positivo do usuário via
 * JOptionPane e mostre a tabuada desse número. Para mostrar a tabuada utilize
 * uma Janela JoptionPane  OBS.: Construa a saída utilizando concatenação de
 * STRINGS...
 *
 * @author Marcelo F Athayde
 */
public class Exercicio02 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro positivo:"));
        String saida = "TABUADA de " + numero + "\n";
        for (int i = 1; i <= 10; i++) {
            saida = saida + (i + " X " + numero + " = " + i * numero + "\n");

        }
        JOptionPane.showMessageDialog(null, saida);
    }

}
