import java.util.*;
public class pattern {
    public static void main(String[] args) {
        
    for(int i=1;i<=4;i++)
    {
        for(int s=4-i;s>=0;s--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        if(i>1)
        {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        }
        System.out.println();
    }
    for(int i=3;i>=1;i--)
    {
        for(int s=4-i;s>=0;s--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        if(i>1)
        {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        }
        System.out.println();
    }
}
}
