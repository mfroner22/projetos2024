package LacoFor;

/**
 *
 * @author Marcelo F Athayde
 */
public class Exemplo01 {

    public static void main(String[] args) {
        System.out.println("************ exemplo a *****************");
       
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ";");

        }
        System.out.println("");
        System.out.println("************ exemplo b *****************");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + ";");
        }  
       System.out.println("");
        System.out.println("************ exemplo c*****************");     

        
        for (int i = 7; i <= 77; i+= 7) {
            System.out.print(i + ";");

        }
         System.out.println("");
        System.out.println("************ exemplo d*****************"); 
         
        for (int i = 20; i >= 2 ; i-=2) {
            System.out.print(i + ";");
        }   
             System.out.println("");
        System.out.println("************ exemplo e*****************");
        for (int i = 2; i >= 20 ; i+=3) {
            System.out.print(i + ";");
               
            
        }
        for (int i = 99; i >= 0 ; i-=11) {
            System.out.print(i + ";");
        }
    }
}


    
