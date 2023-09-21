import java.util.Scanner;

public class average {

    public static int avg(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;

    }

    public static void main(String args[]) {
        String more;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            System.out.println("Please enter the third number");
            int c = sc.nextInt();
            int answer = avg(a, b, c);
            System.out.println("The average of numbers " + a + "," + b + "," + c + "," + " is " + answer);
            System.out.println("Please enter yes if you want to find average of more numbers ");
            more = sc.next();
        } while (more.equals("Yes") || more.equals("yes"));

    }
}
