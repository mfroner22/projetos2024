
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("Informe  valor qualquer:");
        Scanner entrada = new Scanner (System.in);
        int valor = entrada.nextInt();
        if(valor<0){
            System.out.println(" valor Negativo!");
        }else{
            System.out.println("valor Positivo!");
        }
    }
    
}
