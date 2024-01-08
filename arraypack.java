import java.util.*;
import java.util.Arrays;
public class arraypack {

    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[])
    {   
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
        printarray(arr);
    }
}
