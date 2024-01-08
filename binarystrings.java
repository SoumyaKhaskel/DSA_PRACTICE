public class binarystrings {
     public static void printbinarystrings(int n,int lastplace,String str)
     {
        //basecase
        if(n==0)
        {
            System.out.println(str);
            return;
        }

        //our job
        printbinarystrings(n-1, 0, str+"0");

        if(lastplace==0)
        {
            printbinarystrings(n-1,1, str+"1");
        }
     }
    
     public static void main(String args[])
     {
       printbinarystrings(3, 0, "");
     }
}
