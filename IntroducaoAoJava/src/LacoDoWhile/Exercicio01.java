package LacoDoWhile;

import java.util.Scanner;

/**
 * 1. Pizza - R$ 25,00 - 800 calorias 2. Hamburguer - R$ 20,00 - 600 calorias 3.
 * Salada - R$ 15,00 - 200 calorias 4. Lasanha - R$ 30,00 - 900 calorias 5. Suco
 * - R$ 8,00 - 100 calorias A quantidade total de pratos pedidos. • O valor
 * total a ser pago. • A quantidade total de calorias dos pratos selecionad
 *
 * @author Marcelo F Athayde
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        double valortotal = 0;
        double totalcalor = 0;
        double totalPratos = 0;
        do {
            exibirMenu();
            int prato = entrada.nextInt();
            totalPratos++;
            switch (prato) {
                //aqui incrementa as variaveis
                case 1:
                    valortotal += 25;
                    totalcalor += 800;
                    break;
                case 2:
                    valortotal += 20;
                    totalcalor += 600;
                    break;
                case 3:
                    valortotal += 15;
                    totalcalor += 200;
                    break;
                case 4:
                    valortotal += 30;
                    totalcalor += 900;
                    break;
                case 5:
                    valortotal += 8;
                    totalcalor += 100;
                    break;

            }
            System.out.println(" Tem mais prato a escolher? :"
                    + "\nS = sim "
                    + "\nN = não");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        System.out.println("Você pediu : " + totalPratos + " pratos");
        System.out.println("Valor Total R$ " + valortotal);
        System.out.println("Total de Calorias : " + totalcalor);
    }

    public static void exibirMenu() {
        System.out.println("Menu :"
                + "\n1. Pizza - R$ 25,00 - 800 calorias "
                + "\n2. Hamburguer - R$ 20,00 - 600 calorias "
                + "\n3. Salada - R$ 15,00 - 200 calorias"
                + "\n4. Lasanha - R$ 30,00 - 900 calorias"
                + "\n5. Suco - R$ 8,00 - 100 calorias");
        System.out.println("Escolha Uma opção do menu:");

    }

}
