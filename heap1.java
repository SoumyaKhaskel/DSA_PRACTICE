import java.util.*;

public class heap1{
    static class Heap{
        ArrayList<Integer>arr= new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);
        }

        int x=arr.size()-1;// x is child index
        int par=(x-1)/2; //parent index

        while(arr.get(x)<arr.get(par)){
            //swap
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
        }
        //starting index is the minimum value for the heap
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;

            if(left<arr.size() && arr.get(minidx)>arr.get(left)){
                minidx=left;
            }
            if(left<arr.size() && arr.get(minidx)>arr.get(right)){
                minidx=right;
            }
            //reverse both the arr.get signs to change the order of the heap to largest to smallest
            if(minidx!=i)
            {
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(i));
                arr.set(minidx,temp);

                heapify(minidx);
            }
           
        }
    
        public int remove(){
            int data=arr.get(0);

            //step1 -swap first and last
            int temp=arr.get(0);
            arr.set(0,arr.size()-1);
            arr.set(arr.size()-1,temp);

            //step2 delete last
            arr.remove(arr.size()-1);

            //step3 heapify
            heapify(i);
            return data;
        } 

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        //same implementation as of priority queue
        Heap h= new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        //heap sort-o(n logn)
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}