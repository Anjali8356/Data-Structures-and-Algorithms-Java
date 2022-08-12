// Find if a number is palindrome or not
import java.util.*;
class Palindrom_number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        int hold=num;
        int rev_num=0,remainder;

        while(num!=0){
            remainder = num%10;
            rev_num=rev_num *10+remainder;
            num=num/10;
            
        }
        if(rev_num==hold){
            System.out.print(hold +" is palindrome");
        }
        else{
            System.out.print(hold + " is not palindrome");
        }
    }
}