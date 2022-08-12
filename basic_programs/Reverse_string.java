// Reverse A String In Java
import java.util.*;
class Reverse_string{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=input.nextLine();
        String rev_str="";
        for(int i=str.length()-1 ; i>=0; i--){
             rev_str=rev_str+str.charAt(i);

        }
        System.out.print("Reversed string is " + rev_str);
        
    }
}