package Laco_While;

import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Usuário:");
        String usuario = entrada.next();
        System.out.println("Informe a Senha:");
        String senha = entrada.next();

        //contador de vezes
        int tentativas = 1;
        while (usuario.equals(senha) && tentativas < 3) {
            System.out.println("Usuario não pode ser igual a senha!");
            System.out.println("Informe o Usuário:");
            usuario = entrada.next();
            System.out.println("Informe a Senha:");
            senha = entrada.next();
            tentativas++;

        }
        if (tentativas == 3 && usuario.equals(senha)) {
            System.out.println("Acesso negado, tentaivas esgotadas!");
        } else {
            System.out.println("acesso permitido");
        }
    }
}
