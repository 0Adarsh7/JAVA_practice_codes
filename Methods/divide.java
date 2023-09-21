import java.util.Scanner;

public class divide {
    public static int div(int a, int b) {
        int divide = a / b;
        return divide;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter the number A");
            int a = sc.nextInt();
            System.out.println("Enter the number of B");
            int b = sc.nextInt();

            int divide = div(a, b);
            System.out.println("The answer is : " + divide);
            System.out.println("Type yes if you want to divide another number");
            answer = sc.next();
        } while (answer.equals("Yes") || answer.equals("yes"));
    }
}
