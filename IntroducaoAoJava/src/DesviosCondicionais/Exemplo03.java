
package DesviosCondicionais;

import java.util.Scanner;

/**Criar Algoritimo para verificar se "F" para femino ou "M" para masculino
 *
 * @author Marcelo F Athayde
 */
public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe \nF para feminino \nM para masculino");
        String sexo = entrada.nextLine();
        if (sexo.equalsIgnoreCase("F")){
            System.out.println("Feminino!");
        }else if (sexo.equalsIgnoreCase("M")){
            System.out.println("Masculino!");
        }else{
            System.out.println("Sexo inválido!");
            
        }
    }
    
}
