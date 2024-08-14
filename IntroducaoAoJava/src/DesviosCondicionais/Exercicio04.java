package DesviosCondicionais;

import java.util.Scanner;

/**
 * Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso
 * seja negativo, imprimindo o resultado.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Informe um numero: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero > 0) {
            System.out.println("Resultado é :" + numero * 2);
        }else{
            System.out.println("Resultado é :"+ numero * 3);
        }
    }

}
