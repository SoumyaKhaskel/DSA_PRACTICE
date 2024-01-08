import java.util.*;
public class Pattern2 {

    /*public static void butterfly(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--)//inverted half pyramid
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
*/
    /*public static void solidrhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //innerloop spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //innerloopp stars
            for(int k=1;k<=n;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    /*public static void hollowrhombus(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            //innerloop spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }*/
    public static void diamond(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            //innerloop spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--)
        {
            //innerloop spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]) 
    {
        /*for(int lines=5;lines>=1;lines--)
        {
            for(int line2=1;line2<=lines;line2++)
            {
                System.out.print(line2+" ");
            }
            System.out.println("");
        }*/
        //butterfly(4);

        //solidrhombus(5);

        //hollowrhombus(5);
        diamond(4);
    }
    
    
}
