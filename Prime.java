import java.util.*;
public class Prime {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("Enter a number : ");
        n=sc.nextInt();

        if(n==2)
        {
            System.out.println(n + "is a prime number ");
        }
        else{
            boolean isPrime= true;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)//n being checked to be a multiple of i
                {
                    isPrime= false;

                }

            }

            if(isPrime==true)
            {
                System.out.println(n + "is a prime number ");
            }

            else{
                System.out.println(n + "is not a prime number ");
            }
        }
        }
}
