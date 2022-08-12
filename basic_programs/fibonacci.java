import java.util.Scanner;
class fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1=0;
        
        int n2=1;
        int next_term;
        System.out.print("Enter the number of total terms: ");
        int n=input.nextInt();
         System.out.print("fibonacci series is: " + n1 +", " + n2);
         for(int i=2;i<=n;i++){
            next_term=n1+n2;
            System.out.print(", " + next_term);
            n1=n2;
            n2=next_term;


         }

        
        
    }
}