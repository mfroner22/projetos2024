
package DesviosCondicionais;

import java.util.Scanner;

/**Caixa Eletronico
 * Simular S para saque e D para Deposito
 * Login com usuario e senha
 * Saldo inicial da conta com um valor qualquer
 * identicar a conta com um numero
 *
 * @author Marcelo F Athayde
 */
public class ExercicioExtra01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declarar 
        String login = "marcelo";
        String senha = "12345ab";
        double saldo = 10000.0;
        String contanr = "10.200-3";
        
        //extrato
        String extrato = "     Extrato           "
                +"\n*******************************"
                +"\nNOME: "+ login +    ""
                +"\nNo Conta"+ contanr +"\n"
                +"\nSaldo Anterior ->"+ saldo;
                
                
           //verificar acesso     
        
        System.out.println("Acessando a conta..");
        System.out.println("Informe o login:");
        String usuario = entrada.next();
        System.out.println("Informe a Senha:");
        String senha1 = entrada.next();
        
        if (usuario.equals(login) && senha1.equals(senha)){
            System.out.println("Acesso concedido..");
            System.out.println("O que deseja fazer?"
            +"\nS - Saque"
            +"\nD - Deposito");
            String operacao = entrada.next();
            switch (operacao){
                case "S":
                    System.out.println("Informe o Valor a Sacar:");
                    double valorSaque = entrada.nextDouble();
                    saldo = saldo - valorSaque;
                    extrato = extrato +"\nSaque -> "+ valorSaque;
                    break;
                case "D":
                    System.out.println("Informe o Valor a Depositar:");
                    double valorDeposito = entrada.nextDouble();
                    extrato = extrato +"\nDeposito ->"+ valorDeposito;
                    break;
                    
            }
            extrato = extrato +"\nSaldo atual ->  " + saldo + "\n"
                    +"*************************************";
            System.out.println(extrato);
        } else{
                    System.out.println("Usuario ou senha invalidos");
                    }
            
        
        
    }
        
        
        
        
       
        
        
         
    }

