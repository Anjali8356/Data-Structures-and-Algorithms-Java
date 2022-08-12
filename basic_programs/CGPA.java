// Calculate CGPA Java Program
import java.util.*;
class CGPA{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total subjects: ");
        int subjects= input.nextInt();
        int i=1; 
        double  sum=0,gp,cgpa;
        System.out.println("Enter the grade points  ");
        while(i<=subjects){
        System.out.print("Marks in subject "+ i+ " :");
         gp=input.nextDouble();
         sum= sum+gp;
         i++;
        }
        double sub=subjects;
        cgpa= (sum/sub);
        System.out.print("Cgpa is " + cgpa);
      

    }
}