import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter the amount in INR: ");
        Double amount = input.nextDouble();

        Double dollar;
        dollar=amount /79.49;
        System.out.println(dollar + "USD");
 
    }
    
}
