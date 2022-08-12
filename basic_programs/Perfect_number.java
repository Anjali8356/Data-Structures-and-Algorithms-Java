// Perfect Number In Java
import java.util.*;
class Perfect_number{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
         if(num%i==0){
          //System.out.println(i);
          sum=sum+i;
         }
        }
        
           if(sum==num){
            System.out.print(num+" is a perfect number");
           } 
        else{
            System.out.print(num+" is not a perfect number");
        }
    }
}