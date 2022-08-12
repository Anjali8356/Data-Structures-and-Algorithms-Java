// // Find Ncr & Npr
// NCR = factorial(n)/(factorial(r)*factorial(n-r))
// NPR = factorial(n)/factorial(n-r)
import java.util.*;
class NCR_NPR{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=input.nextInt();
        System.out.print("Enter the value of r: ");
        int r= input.nextInt();
        int factorial_n=1, factorial_r =1, factorial_nr=1;

        //factorial of n
        for(int i = 1; i<n ; i++){
            factorial_n= factorial_n*(n-i);
        }
        factorial_n= n* factorial_n;
        
        //factorial of r
        for(int i = 1; i<r ; i++){
            factorial_r= factorial_r*(r-i);
        }
        factorial_r= r* factorial_r;

        //factorial of n-r
        for(int i = 1; i<(n-r) ; i++){
            factorial_nr= factorial_nr*(n-r-i);
        }
        factorial_nr=(n-r)* factorial_nr;

        
      int ncr = factorial_n/ (factorial_r* factorial_nr);
      int npr= factorial_n/ factorial_nr;
      System.out.println("NCR is "+ncr);
      System.out.println("NPR is "+npr);



















         
    }
}