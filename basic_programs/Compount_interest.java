// Compound Interest Java Program
//Compounded interest only (without principal): P (1 + r/n)^nt - P
import java.util.*;
class Compound_interest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        float principal=input.nextInt();

        System.out.print("Enter the rate in percentage: ");
        float rate = input.nextInt();

        System.out.print("Enter the number of years: ");
        int year=input.nextInt();
        
        System.out.print("Enter the number of times that interest is compounded per unit : ");
        int n=input.nextInt();
            int f=n*year;
            float pow=1;
        //calculate (1+rate/100*n)^nt
        float hold=(1+(rate/(100*n)));
        //System.out.println(hold);
        while(f!=0){
            pow=pow*hold;
            f--;
        }
        //System.out.print(pow);
        float final_amount=principal*pow;
        System.out.println("final amount is "+final_amount);
        float compount_interest= final_amount-principal;
        System.out.println("Compound interest is "+compount_interest);
    }
}