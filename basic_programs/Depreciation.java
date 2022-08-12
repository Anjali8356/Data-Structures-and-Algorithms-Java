// Calculate Depreciation of Value
import java.util.*;
class Depreciation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
            System.out.print("Enter the cost of asset in INR: ");
            
             double cost = input.nextDouble();
             System.out.print("Enter the salvage value: ");

             double salvage= input.nextDouble();
             System.out.print("Enter the useful life of asset: ");
             
             int life= input.nextInt();
             double depreciation = (cost-salvage)/life;
             System.out.print("Despreciation is "+ depreciation);


    }
}