import java.util.Scanner;
class PTR{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        Double P=input.nextDouble();

        System.out.print("Enter the time in years: ");
        int T=input.nextInt();

        System.out.print("Enter the rate: ");
        int R=input.nextInt();
         Double SI;
         SI=P*T*R;
         System.out.println("Simple interest is: "+ SI);
    
    
    }
}