// Sum Of N Numbers
import java.util.*;
class Sum_of_n_numbers{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=input.nextInt();
        int num,sum=0;
        for(int i=0;i<n;i++){
            num=input.nextInt();
            sum=sum+num;
        }
        System.out.print("Sum of all numbers is "+ sum);
    }
}