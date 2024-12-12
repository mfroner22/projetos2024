package exerciciorevisao;

import java.util.Scanner;

/**
 * 1- Você foi encarregado de criar um programa em java que registra ataques de
 * drones para a força aérea ucraniana. O programa deve armazenar os ataques por
 * meio de semanas durante 3 meses, ou seja, 12 semanas. Ele deverá solicitar,
 * armazenar e exibir um relatório dos ataques de drone em solo ucraniano para
 * cada semana.
 *
 * Exemplo de relatório:
 *
 * -- RELATÓRIO --
 *
 * semana 1 - Não houve ataques. semana 2 - Houve ataque. semana 3 - Houve
 * ataque. semana 4 - Não houve ataque. ... semana 12 - houve ataque.
 *
 * @author Marcelo F Athayde
 */
public class ExercicioRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 12 semanas
        boolean[] ataques = new boolean[12];
        Scanner scanner = new Scanner(System.in);
        // Solicitar informações sobre os ataques
        for (int semana = 0; semana < ataques.length; semana++) {
            System.out.print("Houve ataque na semana " + (semana + 1) + "? (sim /não): ");
            String houveAtaque = scanner.next();
            if (houveAtaque.equalsIgnoreCase("sim")) {
                ataques[semana] = true;
            } else {
                ataques[semana] = false;
            }
            // ataques[semana] = scanner.nextBoolean();

        }
        // Exibir o relatório
        System.out.println("\n-- RELATÓRIO --");
        for (int semana = 0; semana < ataques.length; semana++) {
            if (ataques[semana]) {
                System.out.println("Semana " + (semana + 1) + " - Houve ataque.");
            } else {
                System.out.println("Semana " + (semana + 1) + " - Não houve ataques.");
            }
        }

        scanner.close();
    }
}
