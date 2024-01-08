import java.util.Comparator;
import java.util.PriorityQueue;
public class priorQ1{
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);//O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        //print in priority order
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}