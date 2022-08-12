import java.util.*;
class Area_of_rhombus{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the value of p and q: ");
        Double p = input.nextDouble();
        Double q=input.nextDouble();
        Double area = (p*q)/2;
        System.out.print("Area of rhombus is "+ area);
    }
}