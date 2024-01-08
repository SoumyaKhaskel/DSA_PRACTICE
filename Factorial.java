import java.util.*;
public class StrongMurty {
    public static int calfac(int n) {
        int i,fact=1; 
        for(i=1;i<=n;i++)
        {    
            fact*=i;    
        }    
        return fact;
    }
    public static void main(String args[])
    {   
        int n=145;
        int check=n;
        int sum=0;
        int ld;
        while(n>0)
        {
            ld=n%10;
            sum+=calfac(ld);
            n=n/10;
        }
        if(check==sum)
        {
            System.out.println("Strongomurthy number ");
        }
        else{
            System.out.println("Not a Strongomurthy number");
        }
        
    }  
}  
    
    

