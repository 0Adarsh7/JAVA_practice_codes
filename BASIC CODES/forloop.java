import java.util.*;

import javax.security.auth.Subject;

public class forloop {
    public static void main(String args[]) {
        System.out.println("This is a for loop example");
        System.out.println("Enter the name of any 5 Subjects ");
        Scanner sc = new Scanner(System.in);

        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("Enter the name of subject");
            String Subject = sc.next();
        }

    }

}
