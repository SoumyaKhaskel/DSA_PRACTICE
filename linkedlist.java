import java.security.Key;
import java.util.*;
public class linkedlist{
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        //step1 create a new node
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //step 2_newnode next=head;
            newNode.next=head;
        //step 3- head =newnode;
            head=newNode;
        
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    public void print() {
        if(head==null)
        {
            System.out.println("Linked list is empty:");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.println("Null");
    }

    public void addatindex(int index,int data) {
        if(index==0)
        {
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;

        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removefirst()
    {
        if(size==0)
        {
            System.out.println("LL is empty : ");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast()
    {
        
        if(size==0)
        {
            System.out.println("LL is empty : ");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        //prev to get traverse till=i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;//storing tail's data
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    
    public int itrSerach(int key)
    {
        Node temp=head;
        int i=0;

        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
           //key not found
           return -1;
    }

    public int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int idx=helper(head.next, key);

        if(idx==-1)
        {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key)
    {
        return helper(head,key);
    }

    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deletefromnth(int n)
    {
        //to calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }
        if(n==sz)
        {
            head=head.next;//removefirst
            return;
        }
        //sz-n
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    //to find the mid node for both even and odd cases
    public Node findmidNode(Node head)//node as a return type to return the mid node
    {
        Node slow = head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//which is my middle
    }
    public boolean checkPalindrome()
    {
        if(head==null||head.next==null)
        {
            return true;
        }
        //to find mid through function call
        Node mid=findmidNode(head);
        Node curr=mid;
        Node prev=null;

        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null)
        {
            if(left.data==right.data)
            {
                return  false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean isCylce()
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)//flyods cycle finding triangle
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow == fast)
            {
                return true;//cycle present
            }
        }
        return false;
    }

    private Node getmid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }return slow;
    }
    private Node merge(Node head1,Node head2)
    {
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null)
        {
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null)
        {
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }
        return mergedll.next;

    }
    public Node mergeSort(Node head)
    {   //base
        if(head==null || head.next==null)
        {
            return head;
        }
        //find mid
        Node mid=getmid(head);
        //left and right ms
        Node righthead=mid.next;
        mid.next=null;
        
        Node newleft=mergeSort(head);
        Node newright=mergeSort(righthead);
        //merge
        return merge(newleft,newright);
        
    }
    public void zigzag()
    {
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }Node mid=slow;
        //reverse 2ndhalf
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        //alt merge zigzag

        while(left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextR;

            left=nextL;
            right=nextR;
        }
    }
    
    //methods to use the linkedlist
    public static void main(String[] args) {
        //linkedlist ll=new linkedlist();
        /* 
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(1);//1->2->3->1
        System.out.println(isCylce());

        /*ll.addFirst(2);
        ll.addFirst(1);
       
        ll.addLast(4);
        ll.addLast(5);

        ll.addatindex(2,3);
        ll.print();
        //System.out.println(size);
        /*ll.removefirst();
        ll.print();
        ll.removelast();
        System.out.println(size);*/

        //System.out.println(ll.recSearch(3));
       // System.out.println(ll.recSearch(4));
        //ll.reverse();
        //ll.print();
        //ll.deletefromnth(3);
        //ll.print();
        linkedlist ll=new linkedlist();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.zigzag();
        ll.print();
        
    }
}