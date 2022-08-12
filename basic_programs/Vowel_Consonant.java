// Java Program Vowel Or Consonant
import java.util.*;
class Vowel_Consonant{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        if((letter >='a' && letter<='z') || (letter >='A' && letter <= 'Z')){
            if(letter=='a'|| letter=='e' || letter =='i' || letter =='o' || letter =='u'|| letter=='A'|| letter=='E' || letter =='I' || letter =='O' || letter =='U'){
                System.out.print(letter +" is vowel");
            }
            else{
                System.out.print(letter +" is consonant");

            }
        }
    }
}