import java.util.*;
public class watercontainer {

    /*public static int storewater(ArrayList<Integer>heights)
    {
        int maxwater=0;//when there is no boundary or 1 boundary there is no place for the water to be trapped
        //brute force approach
        for(int i=0;i<heights.size();i++)
        {
            for(int j=i+1;j<heights.size();j++)
            {
                int ht=Math.min(heights.get(i),heights.get(j));
                int wdt=j-i;
                int currentwater=ht*wdt;

                maxwater=Math.max(maxwater, currentwater);
                return maxwater;
            }
        }
    }*/

    //2 pointer approach
    public static int storewater(ArrayList<Integer>heights) {
        int maxwater=0;
        int lp=0;
        int rp=heights.size()-1;

        while(lp<rp)
        {
            //calculate water area
            int ht=Math.min(heights.get(lp), heights.get(rp));
            int width=rp-lp;
            int currentwater=ht*width;
            maxwater=Math.max(maxwater, currentwater);
            //update pointers
            if(heights.get(lp)<heights.get(rp))
            {
                lp++;
            }
            else{
                rp--;
            }

    }

    return maxwater;
   }
    public static void main(String[] args) {
        ArrayList<Integer>heights=new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println(storewater(heights));
    }
}
