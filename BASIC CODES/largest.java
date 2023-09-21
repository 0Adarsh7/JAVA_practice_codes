import java.util.*;

public class largest {
    public static void main(String agrs[]) {
        // This is a code to find the largest among 3 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();
        System.out.println("Enter the value of C");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is the largest number" + a);
        }
        if (b > a && b > c) {
            System.out.println("B is the largest" + b);
        } else {
            System.out.println("C is the largest number" + c);

        }

    }
}