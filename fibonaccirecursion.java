import java.lang.module.FindException;

public class fibonaccirecursion {
    public static int fibonacci(int n)
    {
        if(n==0 ||n==1)
        {
            return n;
        }

        int fbnm1=fibonacci(n-1);
        int fbnm2=fibonacci(n-2);

        int fbn=fbnm1+fbnm2;
        return fbn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacci(23));
    }
}
