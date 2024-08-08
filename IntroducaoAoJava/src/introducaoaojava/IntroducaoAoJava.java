
package introducaoaojava;

import java.util.Scanner;



public class IntroducaoAoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ola mundo");
        Scanner entrada = new Scanner (System.in);
        System.out.println("vamos somar dois numeros");
        System.out.println("informe um valor para o numero 1:");
        int numero1 = entrada.nextInt();
        System.out.println("informe um valor para o numero 2:");
        int numero2 = entrada.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("A soma deu "+resultado);
        
        
        
        
     
    }
    
}
