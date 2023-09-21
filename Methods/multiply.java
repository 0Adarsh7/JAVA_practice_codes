import java.util.*;

public class multiply {
    public static int mul(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
        return mul;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            // This is the main function in this we will use the artificial function.

            System.out.println("Please enter the value of A");
            int a = sc.nextInt();
            System.out.println("Please enter the value of B");
            int b = sc.nextInt();
            System.out.println("The multiplication answer of the following numbers is : ");
            int product = mul(a, b);
            System.out.println(product);

            System.out.println("Do you want to continue? Yes or No?");
            answer = sc.next();

        } while (answer.equals("Yes") || answer.equals("yes"));
    }
}
