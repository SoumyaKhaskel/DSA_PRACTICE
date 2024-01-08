import java.lang.Thread.State;
import java.util.Scanner;

public class array1 {
    
    public static void getinput(int arr1[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nuber of inputs you want to store : ");
        int num=sc.nextInt();
      
        for(int i=0;i<num;i++)
        {
            arr1[i]=sc.nextInt();
        }
    }

    /*public static void Linearsearch(int arr1[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search : ");
        int num=sc.nextInt();
        int f=0,pos=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==num)
            {
                f+=1;
                pos=i;
                break;
            }
        }
        if(f>=1)
        {
            System.out.println("Search found at pos :"+pos);
        }
        else{System.out.println("Not found ");}
    }*/

    public static void getsubarray(int arr1[])
    {
        int i,j,k;
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(i=0;i<arr1.length;i++)
        {   int start= i;//first index
            for(j=i;j<arr1.length;j++)
            { 
                cursum=0;
                int end=j;//second index for pair
                for(k=start;k<=end;k++)
                {
                   cursum+=arr1[k];
                }
                if(cursum>maxsum)
                {
                    maxsum=cursum;
                }
            }System.out.println();
        }
        System.out.println(maxsum + "is the maximum of the subarray sum ");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[4];
        getinput(arr1);
        //Linearsearch(arr1);
        getsubarray(arr1);
    }
}
