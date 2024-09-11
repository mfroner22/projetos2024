package Laco_While;

/**
 * A série de Fibonacci é formada p/ sequencia 0,1,1,2,3,5,8,13,21,34,55... Faça
 * um programa que gere a série até o valor ficar maior que 500
 *
 * @author Marcelo F Athayde
 */
public class Exercicio03 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print("  " + a + "  " + b);
        while (c <= 500) {
            c = a + b;
            a = b;
            b = c;

            System.out.print("  " + c);
        }
    }
}
