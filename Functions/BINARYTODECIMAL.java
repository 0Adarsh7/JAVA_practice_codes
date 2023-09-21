import java.util.*;

public class BINARYTODECIMAL {
    public static int btod(int number) {
        int mynum = number;
        int pow = 0;
        int decNum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            decNum = decNum + (lastDigit + (int) Math.pow(2, 0));
            pow++;
            number = number / 10;
        }

        return decNum;
    }

    public static void main(String agrs[]) {
        String more;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the binary number you want to convert. ");
            int number = sc.nextInt();
            int answer = btod(number);
            System.out.println("The decimal number of binary number " + number + " is : " + answer);
            more = sc.next();
        } while (more.equals("Yes") || more.equals("yes"));
    }
}
