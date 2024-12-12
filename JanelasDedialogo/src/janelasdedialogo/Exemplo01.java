package janelasdedialogo;

import javax.swing.JOptionPane;

/**
 * 1. Escreva um programa que receba como entrada o nome, nome do meio e
 * sobrenome, cada um separadamente, através de uma janela de dialogo. Depois
 * apresente o nome completo em uma janela.
 *
 * @author Marcelo F Athayde
 */
public class Exemplo01 {

    public static void main(String[] args) {
        String primeiroNome = JOptionPane.showInputDialog("Informe seu primeiro nome");
        String nomeMeio = JOptionPane.showInputDialog("Informe seu nome do meio");
        String sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome");
        String nomeCompleto = primeiroNome + " " + nomeMeio + " " + sobrenome;
        JOptionPane.showMessageDialog(null, nomeCompleto);

    }

}
