import java.util.Scanner;
class Operations{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1=input.nextInt();

        System.out.print("Enter the second number: ");
        int num2=input.nextInt();

        System.out.print("Enter the operator: ");
        char operator = input.next().charAt(0);;

        if(operator== '+'){
            System.out.print(num1+num2);

        }
        else if(operator== '-'){
            System.out.print(num1-num2);

        }
        else if(operator== '*'){
            System.out.print(num1*num2);

        }
        else{
            System.out.print(num1+num2);

        }
    
    
    
    }
}