package Laco_While;

import java.util.Scanner;

/**
 * Senso de uma academia entre seus clientes, o programa deve descobrir o
 * cliente mais alto, o o cliente mais baixo, cliente mais gordo, e cliente mais
 * magro, o programa deve perguntar o codigo do cliente, sua altura e seu peso,
 * deve ser encerrado quando digitar 0(zero) no campo codigo, printar os codigos
 * e valores do cliente mais alto, do mais baixo, do mais gordo, do mais magro,
 * alem da media das alturas e dos pesos dos clientes
 *
 * @author Marcelo F Athayde
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cod = -1;

        //variaveis pesso mais alta
        int codpessoaMaisalta = 0;
        double alturaPessoaMaisalta = 0;
        double pesoPessoaMaisalta = 0;
        //variaveis pessoa mai baixa
        int codpessoaMaisbaixa = 0;
        double alturaPessoaMaisbaixa = 15;
        double pesoPessoaMaisbaixa = 0;
        //variaveis pessoa mais gorda
        int codpessoaMaisgorda = 0;
        double alturaPessoaMaisgorda = 0;
        double pesoPessoaMaisgorda = 0;
        //variaveis pessoa mais magra
        int codpessoaMaismagra = 0;
        double alturaPessoaMaismagra = 0;
        double pesoPessoaMaismagra = 1000;

        double pesoTotal = 0;
        double alturaTotal = 0;
        int cont = 0;

        while (cod != 0) {
            System.out.println("Informe o codigo do cliente");
            int codigo = entrada.nextInt();
            System.out.println("informe a altura");
            double altura = entrada.nextDouble();
            System.out.println("informe o peso: ");
            double peso = entrada.nextDouble();
            //verificar a mais alta
            if (altura > alturaPessoaMaisalta) {
                codpessoaMaisalta = codigo;
                alturaPessoaMaisalta = altura;
                pesoPessoaMaisalta = peso;

            }
            //verificar a mais baixa
            if (altura < alturaPessoaMaisbaixa) {
                codpessoaMaisbaixa = codigo;
                alturaPessoaMaisbaixa = altura;
                pesoPessoaMaisbaixa = peso;

            }
            //verificar a mais gorda
            if (peso > pesoPessoaMaisgorda) {
                codpessoaMaisgorda = codigo;
                alturaPessoaMaisgorda = altura;
                pesoPessoaMaisgorda = peso;

            }
            //verificar a mais magra
            if (peso < pesoPessoaMaismagra) {
                codpessoaMaismagra = codigo;
                alturaPessoaMaismagra = altura;
                pesoPessoaMaismagra = peso;

            }
            pesoTotal += peso;
            alturaTotal += altura;
            cont++;

            System.out.println("Opções :"
                    + "\n0 para sair:"
                    + "\n1 para novo cliente:");
            cod = entrada.nextInt();

        }
        //print pessoa mais alta
        System.out.println("Pessoa mais alta:"
                + "\nCodigo :" + codpessoaMaisalta + ""
                + "\nPeso :" + pesoPessoaMaisalta + ""
                + "\nAltura :" + alturaPessoaMaisalta);
        //print pessoa mais baixa
        System.out.println("Pessoa mais Baixa:"
                + "\nCodigo :" + codpessoaMaisbaixa + ""
                + "\nPeso :" + pesoPessoaMaisbaixa + ""
                + "\nAltura :" + alturaPessoaMaisbaixa);
        //print pessoa mais gorda
        System.out.println("Pessoa mais Gorda:"
                + "\nCodigo :" + codpessoaMaisgorda + ""
                + "\nPeso :" + pesoPessoaMaisgorda + ""
                + "\nAltura: " + alturaPessoaMaisgorda);
        //print pessoa mais magra
        System.out.println("Pessoa mais Magra:"
                + "\nCodigo :" + codpessoaMaismagra + ""
                + "\nPeso :" + pesoPessoaMaismagra + ""
                + "\nAltura :" + alturaPessoaMaismagra);
        System.out.println("Media de pesos : "+(pesoTotal/cont)+"  Kgs");
        System.out.println("Media de altura :"+ (alturaTotal/cont));
        
        

    }
}
