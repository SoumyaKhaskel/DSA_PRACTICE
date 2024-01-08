import java.util.*;
public class palindrome {
    public static boolean ispalindrome(String st)
    {
        int n=st.length();

        for(int i=0;i<n/2;i++)
        {
            if(st.charAt(i)!=st.charAt(n-i-1))
            {
                return false;
            }
       }
       return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string : ");
        String st=sc.nextLine();
        st=st.toLowerCase();
        System.out.println(ispalindrome(st));
    }
        
}
