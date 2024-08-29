
package DesviosCondicionais;

import java.util.Scanner;

/**Equação do segundo grau
 *a x 2 + bx + c = 0
 * delta = b2 - 4ac
 * @author Marcelo F Athayde
 */
public class ExercicioExtra02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe valor de a:");
        double a =entrada.nextDouble();
        System.out.println("Informe valor de b:");
         double b =entrada.nextDouble();
         System.out.println("Informe valor de c:");
          double c =entrada.nextDouble();
         if (a == 0  && b == 0){
             System.out.println("Equação degenerada..");
         }else if (a == 0 &&  b != 0){
             System.out.println("x = "+(c /b));
             
             
         }
                     
             
         }
          
         
    }
  
