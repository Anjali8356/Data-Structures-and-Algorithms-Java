// // Future Investment Value
// FV= presentValue *(1+rate)^n
// // Future Investment Value
// FV= presentValue *(1+rate)^n
import java.util.*;
class Investment{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the present value: ");
        double value= input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate=input.nextDouble();
        System.out.print("Enter the years: ");
        int n= input.nextInt();
        double pow=1;

        //calculate (1+rate)^n
        while(n!=0){
         pow= pow*(1+(rate/100));
         n--;
        }
        //System.out.print(pow);
        double Future_investment= value*pow;
        System.out.print("Fucture investment is "+ Future_investment);
    }
}