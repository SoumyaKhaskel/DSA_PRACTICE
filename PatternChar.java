import java.util.*;
public class PatternChar{//rectangle pattern
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of lines : ");
        int n=sc.nextInt();
        
        char ch='A';

        for(int lines=1;lines<=n;lines++)
        {
            for(int charecters=1;charecters<=lines;charecters++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();

        }
    }
    
}
