public class arrayrain {
    public static int trappedrainwater(int height[])
    {
        int n=height.length;
        //to calculate left max boundary in array - auxillary array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);

        }


        //to calculate right max boundary in array - auxillary array
        int rightmax[]=new int[n];
        int rightmax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);

        }
        //loop
        int trappedwater=0;
        int waterlevel;
        for(int i=0;i<n;i++)
        {   //waterlevel=min(leftmaxbound,rightmaxbound);
            waterlevel=Math.min(leftmax[i], rightmax[i]);

            //trapped water=waterlevel-height[i]*width;
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
}
