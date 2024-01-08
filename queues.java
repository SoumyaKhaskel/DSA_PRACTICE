import java.util.*;
public class queues {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Queue
    {
        static Node head=null;
        static Node tail=null;
        /*static int arr[];
        static int size;
        static int rear;
        static int front; */
       /* Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }*/
    
    public static boolean isEmpty() {
        //return rear == -1 && front ==-1;
        return head==null & tail== null;
    }
    //public static boolean isFull() {
        //return (rear+1)%size==front;
    //}
    //add
    public static void add(int data) {
        /*if(isFull()){
            System.out.println("queue is full ");
            return;
        }
        //while adding first element
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;*/
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;            
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static int remove() {
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        /* 
        //last element delete
        if(rear==front)
        {
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
       int res=arr[front];
        
        return front;*/
        int front=head.data;
        //single ele present
        if(tail==head)
        {
            tail=head=null;
        }else{
            head=head.next;
        }
        return front;
    }
    public static int peek() {
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        //return arr[front];
        return head.data;
    }
}

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
