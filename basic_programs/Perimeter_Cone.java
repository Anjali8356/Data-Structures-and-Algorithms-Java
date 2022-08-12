import java.util.*;

public class Perimeter_Cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        Double r = input.nextDouble();
        Double area = 2 * 3.14 * r;
        System.out.println("Perimeter of cone is " + area);
    }
}
