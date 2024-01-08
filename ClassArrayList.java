import java.util.*;//universal
import java.util.ArrayList;//optional
public class ClassArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();//stores only classes
        ArrayList<String>list2=new ArrayList<>();

        //to add a number in the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //get operation
        int ele=list.get(2);
        System.out.println(ele);

        //delete operation
        list.remove(3);
        System.out.println(list);

        //set operation
        list.set(2, 0);
        System.out.println(list);

        //contains element
        boolean find=list.contains(4);
        System.out.println(find);
    }
}
