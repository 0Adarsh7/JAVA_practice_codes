import java.util.*;

public class firstnadd {
    public static void main(String agrs[]) {
        System.out.println("Enter the number upto which you want sum");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= Number) {
            sum = sum + i;
            i++;
        }

        System.out.println("the sum of required number is: ");
        System.out.println(sum);

    }
}