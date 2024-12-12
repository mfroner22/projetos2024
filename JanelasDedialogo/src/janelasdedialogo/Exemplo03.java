package janelasdedialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo03 {

    public static void main(String[] args) {
        String[] options = {"Inverno", "Verão", "Outono", "Primavera"};
        int qfc = JOptionPane.showOptionDialog(null, "Qual estação do ano você mais gosta?", "Escolha uma Estação", 0, 3, null, options, options[0]);
    }
    

}
