
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("Informe o valor 1:");
        Scanner entrada = new Scanner (System.in);
        int n1 = entrada.nextInt();
        System.out.println("Informe o valor 2:");
        int n2 = entrada.nextInt();
        if(n1>n2){
         System.out.println("O valor maior é n1: "+n1 );
        }else{
            System.out.println(" valor maior é n2:"+n2);
    }

     }
    
}
