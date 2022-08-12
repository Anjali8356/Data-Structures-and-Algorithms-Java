//return the sum of first n natural numbers
import java.util.*;
public class SumNnumbers {
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int n=input.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
      //System.out.print(i+" ");
      sum=sum+i;
    }
    System.out.print(sum);
}
    
}
