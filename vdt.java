import java.util.*;
public class vdt
 {
    public static void main(String args[])
    {
        byte b=4;
        char c='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;

        double res;
        res =(f*b)+(i%c)-(d*s);

        
        int x=2,y=5;
        int exp1= (x*y/x);
        int exp2 =x*(y/x);

        System.out.println(exp1+" "+exp2);
    }
}
