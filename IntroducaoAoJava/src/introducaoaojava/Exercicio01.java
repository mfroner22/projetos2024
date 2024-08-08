/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaoaojava;

import java.util.Scanner;

/**
 *
 * @author Escola João XXIII
 */
public class Exercicio01 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
        System.out.println("Informe um numero inteiro:");
        int valor = entrada.nextInt();
       
        System.out.println("o antecessor de " + valor +" é :"+(valor -1));
        
        
        
    }
}
