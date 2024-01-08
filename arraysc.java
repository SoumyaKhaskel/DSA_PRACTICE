import java.util.*;
class arraysc
{
    boolean prime(int a)
    { 
        int c=0;
        for(int j=1;j<=a;j++)
        {
            if(a%j==0){
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int arr[]=new int[10];
        arraysc ob=new arraysc();

        for (int l=0;l<=9;l++)
        {
         arr[l]=in.nextInt();
        }
        //checking for prime numbers from array
        for (int l=0;l<=9;l++)
        {
            if(ob.prime(arr[l])){
                System.out.println("Prime");
            }
            else{
                System.out.println("not prime");
            }
        }
    }
}