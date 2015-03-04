
package factorial;
import java.util.*;

public class Factorial {

  
    public static void main(String[] args) {
    Scanner lec= new Scanner(System.in);
    
    int n,c,s;
    
     System.out.println("introduzca un numero");
        n=lec.nextInt();
        c=n;
        s=n;
        
        while(c>1){
         System.out.print(c+"*");
         c--;
         s=s*c;
        } System.out.println("1="+s);
        
    }
    
}
