import java.util.*;
public class typepromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        int dif = a - b;
        System.out.println(dif);
        /* Two Rules of type promotion
         * byte, char, short automatically promoted to int 
         * if one operand is double, long or float whole expression will be converted in respected form 
         */
        byte e = 5;
        int f = e * 10;
        System.out.println(f); 


    }
}
