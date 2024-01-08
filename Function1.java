import java.util.Scanner;

public class Function1 {
    /*public static void printHelloWorld() {

        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    //public static int factorial(int n)
    {
        int sum=1;
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        return sum;
    }

    //public static int binomialcoefficient(int n,int r)
    {
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nmrfact=factorial(n-r);
        int BC=nfact/(rfact*nmrfact);
        return BC;
    }*/

    //primenumbercheck
    /*public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;

            }
        }
        return false;
    }*/

    /*public static void bindec(int binN) {
        int pow=0;
        int deciN=0;
        int myBno=binN;
        int ld;

        while(binN>0)
        {
            ld=binN%10;
           deciN=deciN+(ld*(int)Math.pow(2,pow));

           pow++;
           binN=binN/10;

        }
        System.out.println("Deciaml of my binary number  " + myBno +" is :"+deciN);
    }*/

    public static void decbin(int n) {
        int pow=0;
        int Bn=0;
        int mydno=n;


        int rem;

        while(n>0)
        {
            rem=n%2;
           Bn=Bn+(rem*(int)Math.pow(10,pow)); //calculating remainder and adding to binary numbers variable.

           pow++;
           n=n/2;

        }
        System.out.println("Binary of my decimal number  " + mydno +" is :"+Bn);
    }



     public static void main(String args[]) 
    {
        //printHelloWorld();//function call
        Scanner sc=new Scanner(System.in);
        ///System.out.println("Enter a number to check its factorial : ");
        //int n;
        //n=sc.nextInt();
        //int fact;
        //fact=factorial(n);

        //System.out.println(fact);

        //int n,r;
        //int Bc;//binomial coefficient
        //n=5;r=2;

        //Bc=binomialcoefficient(n, r);
        //System.out.println(isPrime(n));
        //int bindec;
        //bindec=
        //bindec(101);
        decbin(6);

    }
}
