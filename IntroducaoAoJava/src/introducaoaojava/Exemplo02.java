
package introducaoaojava;

import java.util.Scanner;


public class Exemplo02 {
    public static void main(String[] args) {
        System.out.println("Vamos calcular o peso ideal");
        System.out.println("Informe a sua altura  :");
        Scanner entrada = new Scanner (System.in);
        double altura = entrada.nextDouble();
        double pesoideal = (72.7 * altura - 58);
        System.out.println("seu peso ideal é :"+pesoideal);
        
        
        
    }
    
}
