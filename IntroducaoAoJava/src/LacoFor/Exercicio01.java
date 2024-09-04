
package LacoFor;

import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exercicio01 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Informe Um numero qualquer: ");
        int numero = entrada.nextInt();
        
        for (int i = 1; i <= 100000; i++) {
            System.out.println(i+" x "+numero +" = "+ i * numero);
            
        }
    }
}
