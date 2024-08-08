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
public class Exercicio04 {
    
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
        System.out.println("Numero de Eleitores do municipio:");
        int eleitores = entrada.nextInt();
         System.out.println("Numero de votos brancos do municipio:");
        int votosbrancos = entrada.nextInt();
         System.out.println("Numero de votos validos do municipio:");
        int votosvalidos = entrada.nextInt();
         System.out.println("Numero de votos Nulos do municipio:");
        int votosnulos = entrada.nextInt();
        System.out.println("Percentual de votos brancos:"+ (votosbrancos *100 / eleitores)+"%");
        System.out.println("Percentual de votos Validos:"+ (votosvalidos *100 / eleitores)+"%");
        System.out.println("Percentual de votos Nulos:"+ (votosnulos *100 / eleitores)+"%");
        
        
        
        
        
        
       
        
                
        
    }
    
         
}
