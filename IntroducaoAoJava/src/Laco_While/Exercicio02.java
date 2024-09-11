
package Laco_While;

import java.util.Scanner;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double  pais1 = 80000;
        double pais2 = 200000;
        int anos = 0;
        while(pais1 < pais2){
            pais1 = pais1*1.03;
            pais2 = pais2*1.015;
            anos++;
        }
        System.out.printf("Pais 1: %.0f",pais1);
        System.out.println("");
        System.out.printf("Pais 2: %.0f",pais2);
        System.out.println("");
        System.out.println("Quantidade de anos:"+anos);
    }
}
