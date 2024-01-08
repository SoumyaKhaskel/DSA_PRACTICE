public class tilingproblem {

    public static int tilingproblem(int n)// for a 2xn floor
    {
        //basecase
        if(n==0 || n==1)
        {
            return 1;
        }

        int fnm1=tilingproblem(n-1);//vertical choice
        int fnm2=tilingproblem(n-2);// horizontal choice

        int totways=fnm1+fnm2;

        return totways;
    }
    public static void main(String[] args)
    {
        System.out.println(tilingproblem(4));
    }
}
