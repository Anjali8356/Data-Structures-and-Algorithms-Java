// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
class Sum_All{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int sum=0,num=1;
        while(num!=0){
            num =input.nextInt();
            sum=sum+num;
        }
        System.out.print("Sum of all number is "+ sum);
    }
}