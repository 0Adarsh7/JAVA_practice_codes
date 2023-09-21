import java.util.*;
public class typecasting {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int a = (int) sc.nextFloat();
        // we have to add (datatype) for type casting 
        // used where lossy coversion has to be done
        

        // Normal representation 
        float n = 12.44f;
        int b = (int) n;

        System.out.println(a);
        System.out.println(b); 

        //storage of character in number 
        char ch = 'h';
        char ch2 = 'a';
        char ch3 = 'b';
        int num = ch;
        int num1 = ch2;
        int num2 = ch3;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);


    }
}
