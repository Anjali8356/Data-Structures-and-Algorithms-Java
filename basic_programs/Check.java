//Even odd
import java.util.*;
public class Check {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number: ");
     int a= input.nextInt();
      String result=even_odd(a);
      System.out.print(result);
        
    }

    static String even_odd(int a){
        if(a%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    
}
