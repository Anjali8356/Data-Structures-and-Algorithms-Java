// Input a number and print all the factors of that number (use loops).
import java.util.*;

class Factors{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the integer: ");
        int num=input.nextInt();
        System.out.print("Factors of "+num+" are ");
        for( int i=1; i<=num; i++){
            if(num %i==0){
                System.out.print(i +" ");
            }  
         
        }
       
    }
}