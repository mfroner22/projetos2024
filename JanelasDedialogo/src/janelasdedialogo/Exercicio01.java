package janelasdedialogo;

import javax.swing.JOptionPane;

/**
 * Faça uma programa Java que receba um número inteiro positivo como entrada do
 * usuário através da classe JOptionPane e imprima seus divisores Ex : Divisores
 * de 12 são os números 1, 2, 3, 4, 6 e 12).
 *
 * @author Marcelo F Athayde
 */
public class Exercicio01 {

    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro:"));
            String divisores = "";
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores += i + "; ";
                }
            }
            JOptionPane.showMessageDialog(null, "são divisores de  " + numero + ":" + "\n" + divisores);
        } catch(NumberFormatException ex){
            
            
        }
    }

}
