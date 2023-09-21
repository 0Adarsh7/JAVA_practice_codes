import java.util.*;

public class reversenumber2 {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse");
        Scanner sc = new Scanner(System.in); // user se number input liya
        int Number = sc.nextInt();
        int rev = 0;
        int result = 0; // result mai last number store krenge
        while (Number > 0) { // jab tk number 0 se bad

            result = Number % 10; //number's lasst digit will be represented 
            rev = rev * 10 + result; 
            // last number print ho rha hai
            Number = Number / 10;
            System.out.print(result); // number ko chota karne ke liye usse 10 se divide karlo

        }
    }
}
