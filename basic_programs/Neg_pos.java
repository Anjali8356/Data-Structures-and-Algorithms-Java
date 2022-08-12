// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.*;
class Neg_pos{
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int neg_sum=0,pos_even_sum=0 , pos_odd_sum=0;
    System.out.print("Enter the numbers: ");
    int num=1;
    while(num!=0){
        num =input.nextInt();
        if(num<0){
            neg_sum=neg_sum+num;
        }
        if(num>0 && num%2==0){
           pos_even_sum+=num;
        }
        if(num>0 && num%2!=0){
             pos_odd_sum+=num;
       
    }
    }
    System.out.println("sum of negative numbers is "+neg_sum);
    System.out.println("sum of positive even numbers is "+pos_even_sum);
    System.out.print("sum of positive odd numbers is "+ pos_odd_sum);
}
}