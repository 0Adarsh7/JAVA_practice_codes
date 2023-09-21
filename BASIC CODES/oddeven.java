import java.util.*;
public class oddeven{
    public static void main(String agrs[]){
        //This program is to check weather a number is odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to check");
        int number = sc.nextInt();
        if(number%2==1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
        }
    }
