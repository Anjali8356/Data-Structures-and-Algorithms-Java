import java.util.Scanner ;
class Area_of_circle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter the radius: ");
        Double radius= input.nextDouble();
        Double area;
        area= 3.14*radius*radius;
        System.out.println("Area of circle is: " + area);
    }
}