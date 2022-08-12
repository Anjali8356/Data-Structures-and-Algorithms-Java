// Sum Of A Digits Of a number In Java
import java.util.*;
class Sum_of_digits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        int sum=0 , remainder;
        while(num!=0){
        remainder= num%10;
        sum = remainder+sum;
        num=num/10;
        }
        System.out.print("Sum of its digits is "+ sum);
     }
}
