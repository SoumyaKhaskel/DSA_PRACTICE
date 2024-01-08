import java.util.*;
public class compressstring {
    public static String compres(String st) {
        String newst="";

        for(int i=0;i<st.length();i++)
        {
            Integer count = 1;

            while(i<st.length()-1 && st.charAt(i) == st.charAt(i+1))
            {
                count ++;
                i++;
            }

            newst += st.charAt(i);
            if(count >1)
            {
                newst+=count.toString();
            }
        }

        return newst;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your string : ");
        //String st=sc.nextLine();
        //st=st.toLowerCase();
        String st="aaabbbccccdd";
        
        System.out.println(compres(st));
    
    }
}
