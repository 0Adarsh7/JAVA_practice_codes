import java.util.*;
public class ifelseeg{
    public static void main(String agrs[]){
        //This is a code to demonstrate basic code of ifelse
        System.out.println("Please input your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Access Allowed");
        }
        else{
            System.out.println("Access Denied");
        }
        
        
    }
}