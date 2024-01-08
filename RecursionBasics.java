public class RecursionBasics {
    public static void printback(int n) { //to print the numbers in decreasing order upto 1
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printback(n-1);
    }
    
    public static void main(String args[])
    {
        int n=10;
        printback(n);
    }
}
