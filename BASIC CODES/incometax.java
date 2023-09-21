import java.util.*;
public class incometax {
    public static void main(String agra[]){
        //This is a income tax calculator.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income");
        float income = sc.nextFloat();
        
        if( income <= 500000){
            System.out.println("No tax required");
        }
        else if( income < 800000){  
            float tax = income * .20f; // Calculating tax 
            float tincome = income - tax; // Calculating Income after tax 
            System.out.println("Total income after 20% Tax: " + tax );
            System.out.println("Income after tax: " + tincome);
        }
        else {
            float tax = income * .30f; // Calculating Tax
            float tincome = income - tax; // Calculating income after Tax
            System.out.println("Total Tax: " + tax);
            System.out.println("Income after 30% tax: " + tincome);
        }

    }
}
