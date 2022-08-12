// Check Leap Year Or Not
import java.util.* ;
class Leap_year{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.print(year+" is a leap year.");
            }
            else{
                System.out.print(year+" is not a leap year.");
            }
        }
        else if(year % 4==0){
            System.out.print(year+" is a leap year.");
        }
        else{
            System.out.print("not a leap year.");
        }
    }
}
