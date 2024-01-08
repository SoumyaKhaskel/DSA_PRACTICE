import java.util.*;
public class directions {
    public static float getshortestpath(String st)
    {
        int x=0,y=0; 
        int l=st.length();
        //checking possible directory
        for(int i=0;i<l;i++)
        {   
            //checking for possible north direction
            if(st.charAt(i)=='n')
            {
                y+=1;
            }
            //checking for possible south direction
            else if(st.charAt(i)=='s')
            {
                y-=1;
            }
            //checking for possible east direction
            else if(st.charAt(i)=='e')
            {
                x+=1;
            }
            //checking for possible west direction
            else if(st.charAt(i)=='w')
            {
                x-=1;
            }
        }
        int xsq=x*x;
        int ysq=y*y;
        return (float)Math.sqrt(xsq+ysq);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your string : ");
        //String st=sc.nextLine();
        //st=st.toLowerCase();
        String st="ns";
        
        System.out.println(getshortestpath(st));
    }
        
}

