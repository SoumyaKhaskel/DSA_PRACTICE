import java.util.*;
public class arraylistdemo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>(); //main arraylist

        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        //adding elements as required
        for(int i=1;i<=5;i++)
        {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        //adding the sublists to mainlists now
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        for(int i=0;i<mainlist.size();i++)//printing arraylist
        {
            ArrayList<Integer>currentList=mainlist.get(i);//storing the index position elements of mainlist into a current list
            for(int j=0;j<currentList.size();j++)
            {
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainlist);
    }
}
