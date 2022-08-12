//find 2^n;

import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= input.nextInt() ;
        int pow=1;
        while(n>0){
         pow=pow*2;
         n--;
        }
        System.out.print(pow);
    }
}
