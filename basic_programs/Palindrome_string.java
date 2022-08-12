import java.util.*;
public class Palindrome_string {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: ");
       String string = input.nextLine();
       String rev_string="";
       for(int i=string.length()-1; i>=0;i--){
         rev_string= rev_string + string.charAt(i);
        
        }
        //System.out.println(rev_string);
       if((rev_string ). equals (string)){
         System.out.println("String is palindrome");

       }
       else{
        System.out.println("String is not palindrome");
       }

    }
}
