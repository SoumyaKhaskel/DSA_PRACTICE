public class repeatcharrecursion {
    public static void removeduplicates(String str,int indx,StringBuilder newsb,boolean map[])
    {   
        //base case
        if(indx==str.length())
        {
            System.out.println(newsb);
            return ;
        }

        //our job
        char currchar=str.charAt(indx);

        if(map[currchar-'a']==true)
        {
            //itsaduplicate
            removeduplicates(str, indx+1, newsb, map);
        }

        else
        {
            map[currchar-'a']=true;
            removeduplicates(str, indx+1, newsb.append(currchar), map);
        }
    }
    public static void main(String[] args)
    {
        String str="sossoouummayasauu";
        int indx=0;
     

       removeduplicates(str, indx, new StringBuilder(""),new boolean[26]);
        

    }
}
