import java.util.Scanner;
class Largest_number{
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);
        System.out.print("Enter the first number: ");
        Double a=input.nextDouble();

        System.out.print("Enter the second number: ");
        Double b=input.nextDouble();
        if(a>b){
            System.out.print("First number is greater");
        }
        else{
            System.out.print("Second number is greater");
        }
        


    }

}