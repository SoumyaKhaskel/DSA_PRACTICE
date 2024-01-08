import java.util.Scanner;

public class lexicographicalysort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String fruits[]={"apple","mango","banana"};

        String largerst=fruits[0];

        for(int i=1;i<fruits.length;i++)
        {
            if((largerst.compareToIgnoreCase(fruits[i]))<0)
            {
                largerst=fruits[i];
            }
        }

        System.out.println(largerst);
    }
}
