/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaoaojava;

import java.util.Scanner;

/**
 *Coverter Fahrenheit para Centigrados
 * @author Escola João XXIII
 */
public class ExercicioDesafio {
    public static void main(String[] args) {
        System.out.println("Coversor de Graus Fahrenheit para Centigrados");
        System.out.println("Informe o Grau Fahrenheit :");
        Scanner entrada = new Scanner (System.in);
        double f = entrada.nextDouble();
        System.out.println("Graus Centigrados : "+ (f-32) * (5/9.0));
       
        
        
        
    }
    
}
