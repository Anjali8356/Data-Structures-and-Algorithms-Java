import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age= input.nextInt();
        System.out.print(vote(age));
    }
    static String vote(int age){
        if(age>=18){
            return "Eligible to vote";
        }
        else{
            return "Not eligible to vote";
        }
    }
    
}
