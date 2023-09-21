import java.util.*;

public class calculator {
    public static void main(String[] args) {
        System.out.println("This is a calculator");

        System.out.println("Please select 1 for additon, 2 for subtraction, 3 for multiplication and 4 for division");
        System.out.println("Please make your choice");
        Scanner sc = new Scanner(System.in);
        int operator = sc.nextInt();
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("NOT SUPPORTED");

        }
    }
}
