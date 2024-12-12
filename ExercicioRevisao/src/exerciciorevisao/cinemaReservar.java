package exerciciorevisao;

import java.util.Scanner;

/**crie um sistema que utiliza um vetor booleano para controlar o acesso a uma 
 * sala com 10 lugares. O programa deve permitir que o usuário reserve ou libere
 * um lugar, além de mostrar quais lugares estão ocupados.
 *
 * @author Marcelo F Athayde
 */
public class cinemaReservar {

    public static void main(String[] args) {
        boolean[] lugares = new boolean[10];
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Reservar lugar");
            System.out.println("2. Liberar lugar");
            System.out.println("3. Mostrar lugares ocupados");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Escolha um lugar (1-10): ");
                    int reservar = scanner.nextInt() - 1;
                    if (reservar >= 0 && reservar < 10) {
                        if (!lugares[reservar]) {
                            lugares[reservar] = true;
                            System.out.println("Lugar " + (reservar + 1) + " reservado com sucesso.");
                        } else {
                            System.out.println("Lugar já está ocupado.");
                        }
                    } else {
                        System.out.println("Número de lugar inválido.");
                    }
                    break;

                case 2:
                    System.out.print("Escolha um lugar (1-10): ");
                    int liberar = scanner.nextInt() - 1;
                    if (liberar >= 0 && liberar < 10) {
                        if (lugares[liberar]) {
                            lugares[liberar] = false;
                            System.out.println("Lugar " + (liberar + 1) + " liberado com sucesso.");
                        } else {
                            System.out.println("Lugar já está livre.");
                        }
                    } else {
                        System.out.println("Número de lugar inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Lugares ocupados:");
                    for (int i = 0; i < lugares.length; i++) {
                        if (lugares[i]) {
                            System.out.print((i + 1) + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
    

