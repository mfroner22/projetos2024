
package janelasdedialogo;

import javax.swing.JOptionPane;

/**Exemplo para converter String para inteiro ou Double
 *
 * @author Marcelo F Athayde
 */
public class ExemploConversao {
    public static void main(String[] args) {
       String idadeString =  JOptionPane.showInputDialog("Informe a sua idade:");
        int idade = Integer.parseInt(idadeString);
        String pesoString =  JOptionPane.showInputDialog("Informe seu peso:");
        double peso = Double.parseDouble(pesoString);
        JOptionPane.showMessageDialog(null,"Idade "+idade +" peso "+peso);
      
    }
    
}
