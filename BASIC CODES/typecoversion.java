import java.util.*;
public class typecoversion {
    public static void main(String[] args) {
        /*this code is for representing type conversion in Java
         * Two conditions 
         * 1. Type compatible eg number to numbers
         * 2. destination type > source type
         * if we do store content of long in int then lossy conversion will occur 
         * Widening conversion happens when we covert a int to long.
        */
        Scanner sc = new Scanner(System.in); 
        
        
       // above due to we are coverting float in int then loss can occur so it iwll generate error 
       //but if we do the vice versa our code will run perfectly
        float b = sc.nextInt();
        System.out.println(b); 

    }
}
