package DesviosCondicionais;

import java.util.Scanner;

/**
 * O IMC – Indice de Massa Corporal é um critério da Organização Mundial de
 * Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A
 * fórmula é IMC = peso / (altura)². Elabore um algoritmo que leia o peso e a
 * altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
 * Abaixo de 18,5 Abaixo do peso
 * Entre 18,5 e 25 Peso normal
 * Entre 25 e 30 Acima do peso
 *Acima de 30 Obeso
 * @author Marcelo F Athayde
 */
public class Exercicio08 {

    public static void main(String[] args) {
        System.out.println("Informe sua altura: ");
        Scanner entrada = new Scanner(System.in);
        double altura = entrada.nextDouble();
        System.out.println("Informe seu peso:");
        double peso = entrada.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc < 25) {
            System.out.println("peso normal");
        } else if (imc > 25 && imc < 30) {
            System.out.println("Acima do peso ");
            
        }else if (imc >  30) {
            System.out.println("Obeso ");
            
    }
}
}

