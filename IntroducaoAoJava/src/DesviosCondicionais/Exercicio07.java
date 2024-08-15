package DesviosCondicionais;

import java.util.Scanner;

/**
 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
 * algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas: a)
 * para homens: (72.7 * h) – 58; b) para mulheres: (62.1 * h) – 44.7.
 *
 *
 * @author Marcelo F Athayde
 */
public class Exercicio07 {

    public static void main(String[] args) {
        System.out.println("Informe a sua altura:");
        Scanner entrada = new Scanner(System.in);
        double altura = entrada.nextDouble();
        System.out.println("Informe \nF para feminino \nM para masculino");
        String sexo = entrada.next();
        double pesoideal;
        if(sexo.equalsIgnoreCase("M")){
            pesoideal = 72.7 * altura -58;
            System.out.println("Peso ideal -"+pesoideal);
        }else if (sexo.equalsIgnoreCase("F")){
            pesoideal = 62.1 * altura - 44.7;
            System.out.println("Peso ideal -"+pesoideal);
        }

    }
}
