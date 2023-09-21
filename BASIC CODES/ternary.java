import java.util.*;
public class ternary {
    public static void main(String args[]){
        System.out.println("Enter the number you want to check");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //Ek hi line mai condition and result likh kar ternary ka use karliya.
        String type = number%2==1? "odd":"even";
        System.out.println(type);

    }
}
