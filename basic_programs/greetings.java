import java.util.Scanner;
class greetings{
    public static void main(String[] args) {
        System.out.print("Enter the name :");
        Scanner input= new Scanner(System.in);
        String name = input.next();
        System.out.println("Good morning " + name + "!");
    }
}
