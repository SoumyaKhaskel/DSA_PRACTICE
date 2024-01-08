import java.util.*;
public class maxareaHistogram {
    public static void maxAreaH(int arr[])
    {
        int maxArea=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        //next smaller right
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            } 
            if(!s.isEmpty())
            {
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s=new Stack<>();//stack empty
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            } 
            if(!s.isEmpty())
            {
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //current area or for width= j-i-1 +i.e nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++)
        {
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;

            int currarea=height*width;
            maxArea=Math.max(currarea,maxArea);
        }
        System.out.println("Max area in histogram is : "+maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};//heights in histogram
        maxAreaH(arr);
    }
}
