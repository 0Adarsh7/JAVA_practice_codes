import java.util.Scanner;

public class prime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= n - 1; i++) {
            
                
            
            if (n % i == 0) {
                isPrime = false;
                System.out.println("the number is not Prime");
                break;
            }
        
            if (isPrime == true) {
                System.out.println("The number is prime");
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        String more;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input the number you want to check");
            int n = sc.nextInt();
            boolean result = isPrime(n);
            System.out.println(result);
            System.out.println("Type yes if you want to find about more numbers.");
            more = sc.next();
        } while (more.equals("Yes") || more.equals("yes"));
    }
}
