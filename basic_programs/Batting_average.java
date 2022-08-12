// Calculate Batting Average
import java.util.*;
class Batting_average{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of runs");
        int runs= input.nextInt();
        System.out.print("Enter the total matches");
        int match=input.nextInt();
         int average = runs/match;
         System.out.print("Batting average is: " + average);
        
    }
}