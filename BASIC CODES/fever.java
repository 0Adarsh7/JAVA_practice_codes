import java.util.*;

public class fever {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your body Temprature");
        double Temprature = sc.nextDouble();
        if (Temprature > 100) {
            System.out.println("You have fever");
        } else {
            System.out.println("you dont have fever");
        }
    }
}
