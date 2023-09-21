import java.util.*;

public class reversenumber {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse");
        Scanner sc = new Scanner(System.in); // user se number input liya
        int Number = sc.nextInt();

        int result = 0; // result mai last number store krenge
        while (Number > 0) { // jab tk number 0 se badf

            result = Number % 10; // last digit extract krne ke lliye number ko 10 se divide karate hai
            System.out.print(result); // last number print ho rha hai
            Number = Number / 10; // number ko chota karne ke liye usse 10 se divide karlo

        }
    }
}
