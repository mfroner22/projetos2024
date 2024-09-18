package LacoDoWhile;

import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String candidato1 = "Allan";
        String candidato2 = "Bruno";
        String candidato3 = "Vitor";
        int votoscandidato1 = 0;
        int votoscandidato2 = 0;
        int votoscandidato3 = 0;
        String opcao = "";
        int nulos = 0;

        do {
            System.out.println("CANDIDATOS: ");
            System.out.println("1 = Allan :");
            System.out.println("2 = Bruno :");
            System.out.println("3 = Vitor :");
            System.out.println("Escolha seu candidato:");
            int voto = entrada.nextInt();
            switch (voto) {
                case 1:
                    votoscandidato1++;
                    break;
                case 2:
                    votoscandidato2++;
                    break;
                case 3:
                    votoscandidato3++;
                    break;
                default:
                    nulos++;
                    break;

            }
            System.out.println("Tem mais eleitor? :"
                    + "\nS = sim "
                    + "\nN = não");
            opcao = entrada.next();
            

        } while (opcao.equalsIgnoreCase("S"));
        if (votoscandidato1 > votoscandidato2 && votoscandidato1 > votoscandidato3){
            System.out.println(candidato1+ " Foi o vencedor.");
        }else if (votoscandidato2 > votoscandidato1 && votoscandidato2 > votoscandidato3){
            System.out.println(candidato2 +" Foi o vencedor.");
        }else if(votoscandidato3 > votoscandidato1 && votoscandidato3 > votoscandidato2) {
            System.out.println(candidato3+" Foi o Vencedor.");
            
        }
        else{
            System.out.println("Houve empate.");
        }
        System.out.println(candidato1 +": "+votoscandidato1);
        System.out.println(candidato2 +": "+votoscandidato2);
        System.out.println(candidato3 +": "+votoscandidato3);
        
    }
}
