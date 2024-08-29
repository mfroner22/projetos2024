package switchCase;

import java.util.Scanner;

/**
 * Escreva um programa que simule o preenchimento de um cheque, ou seja, o
 * usuário do programa informa um valor numérico e o programa deve escrevê lo
 * por extenso, conforme mostra a imagem abaixo. Considere números de 0 a 9.999.
 *
 * @author Marcelo F Athayde
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe valor do cheque:");
        int valor = entrada.nextInt();
        int um = valor / 1000;
        int cem = valor % 1000 / 100;
        int dez = valor % 100 / 10;
        int un = valor % 10;
        String ext = "Valor R$ : ";
        //unidade de milhar
        switch (um) {
            case 1:
                ext = ext + "Um mil ";
                break;
            case 2:
                ext = ext + "Dois mil ";
                break;
            case 3:
                ext = ext + "Tres mil ";
                break;
            case 4:
                ext = ext + "Quatro mil ";
                break;
            case 5:
                ext = ext + "Cinco mil ";
                break;
            case 6:
                ext = ext + "Seis mil ";
                break;
            case 7:
                ext = ext + "Sete mil ";
                break;
            case 8:
                ext = ext + "Oito mil ";
                break;
            case 9:
                ext = ext + "Nove mil ";
                break;
        }
        //centena
        switch (cem) {
            case 1:
                if ((dez == 0) && (un == 0)) {
                    ext = ext + " Cem ";
                } else {
                    ext = ext + " Cento ";
                }
                break;
            case 2:
                ext = ext + " Duzentos ";
                break;
            case 3:
                ext = ext + " Trezentos ";
                break;
            case 4:
                ext = ext + " Quatrocentos ";
                break;
            case 5:
                ext = ext + " Quinhentos ";
                break;
            case 6:
                ext = ext + " Seicentos ";
                break;
            case 7:
                ext = ext + " Setecentos ";
                break;
            case 8:
                ext = ext + " Oitoscentos ";
                break;
            case 9:
                ext = ext + " Novecentos ";
                break;
        }
        //dezena
        switch (dez) {
            case 1:

                switch (un) {
                    case 0:
                        un = 0;
                        ext = ext + " Dez ";
                        break;
                    case 1:
                        un = 0;
                        ext = ext + "Onze";
                        break;
                    case 2:
                        un = 0;
                        ext = ext + "Doze";
                        break;
                    case 3:
                        un = 0;
                        ext = ext + "Treze";
                        break;
                    case 4:
                        un = 0;
                        ext = ext + "Quatorze";
                        break;
                    case 5:
                        un = 0;
                        ext = ext + "Quinze";
                        break;
                    case 6:
                        un = 0;
                        ext = ext + "Dezeseis";
                    case 7:
                        un = 0;
                        ext = ext + "Dezesete";
                        break;
                    case 8:
                        un = 0;
                        ext = ext + "Dezoito";
                        break;
                    case 9:
                        un = 0;
                        ext = ext + "Dezenove";
                        break;
                }
                break;
            case 2:
                ext = ext + " Vinte ";
                break;
            case 3:
                ext = ext + " Trinta ";
                break;
            case 4:
                ext = ext + " Quarenta ";
                break;
            case 5:
                ext = ext + " Ciquenta ";
                break;
            case 6:
                ext = ext + " Sessenta ";
                break;
            case 7:
                ext = ext + " Setenta ";
                break;
            case 8:
                ext = ext + " Oitenta ";
                break;
            case 9:
                ext = ext + " Noventa ";
                break;
        }
        //unidade
        switch (un) {
            case 1:
                ext = ext + " Um";
                break;
            case 2:
                ext = ext + " Dois";
                break;
            case 3:
                ext = ext + " Tres";
                break;
            case 4:
                ext = ext + " Quatro";
                break;
            case 5:
                ext = ext + " Cinco";
                break;
            case 6:
                ext = ext + " Seis";
                break;
            case 7:
                ext = ext + " Sete";
                break;
            case 8:
                ext = ext + " Oito";
                break;
            case 9:
                ext = ext + " Nove";
                break;

        }
        ext = ext.replace("  ", " e ");
        System.out.println(ext);
    }

}
