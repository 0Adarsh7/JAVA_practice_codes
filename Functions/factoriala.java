import java.util.Scanner;

public class factoriala {
    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i; // f one hai and i ki value bhi 1, jese jese i ki value bhadh rhi hai f ki value
                       // bhi update hoti jaa rhi hai.
        }
        return f;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find factorial of");
        int a = sc.nextInt();
        int answer = factorial(a);
        System.out.println(answer);
    }

}
