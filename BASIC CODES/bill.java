//My code
/*import java.util.*;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        //float eraser = sc.nextFloat();
       // float pen = sc.nextFloat();
        float gst = (pencil) * 18/100;
        float bill = (pencil) - gst;
        System.out.println(gst);
        System.out.println(bill);
        //With comments this program return the bill amount removing gst 


    }
}
*/

//Ma'am's code
import java.util.*;
public class bill{
    public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    float pencil=sc.nextFloat();
    float pen=sc.nextFloat();
    float eraser=sc.nextFloat();
    float total=pencil+pen+eraser;
    System.out.println("Bill is : "+total);
    //Add on - with 18% 
    float newTotal=total+ (0.18f*total);
    System.out.println("Bill with 18% tax : "+newTotal);
    }
}