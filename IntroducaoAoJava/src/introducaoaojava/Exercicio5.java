
package introducaoaojava;

import java.util.Scanner;


 
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Salario Funcionário:");
        double salario = entrada.nextDouble();
        
        System.out.println("percentual % reajuste:");
        double reajuste = entrada.nextDouble();
        System.out.println("Novo Sálario:"+( salario * reajuste / 100 + salario));
        
        
        
        
        
    }
    
}
