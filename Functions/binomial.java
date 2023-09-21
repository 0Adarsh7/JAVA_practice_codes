import java.util.Scanner;

public class binomial {
    public static int factorial(int n) {
        {

            int f = 1;
            for (int i = 1; i <= n; i++) {
                f = f * i;

            }
            return f;

        }
    }

    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_f = factorial(n - r);

        int binoCoeff = fact_n / (fact_r * fact_f);
        return binoCoeff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();

        System.out.println("Enter the value of R");
        int r = sc.nextInt();
        int answer = binoCoeff(n, r);

        System.out.println("The binomial coefficient of the given number is : " + answer);

    }
}
