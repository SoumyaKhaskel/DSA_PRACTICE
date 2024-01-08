import java.util.*;
public class gridways {

    public static int gridway(int i,int j,int n,int m) {
        
        //base case
        if(i==n-1 && i==m-1)//condition for last call
        {
            return 1;
        }else if(i==n || j==n)//boundary cross condition
        {
            return 0;
        }

        int w1=gridway(i+1, j, n, m);
        int w2=gridway(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=3,m=3;//row n column m
        System.out.println(gridway(0, 0, n, m));   
    }
}