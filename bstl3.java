import java.util.*;//all import
public class bstl3{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class Info{
        boolean isBst;
        int max;
        int min;
        int size;
        
        public Info(boolean isBst,int size,int max,int min){
            this.isBst=isBst;
            this.max=max;
            this.min=min;
            this.size=size;
        }
    }
    public static int maxBst=6;
    public static Info LargestBST(Node root) {
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo=LargestBST(root.left);
        Info rightInfo=LargestBST(root.right);
        int size=leftInfo.size+rightInfo.size+1;

        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false, size, max, min);
        }
        if(leftInfo.isBst && rightInfo.isBst){
            maxBst=Math.max(maxBst,size);
            return new Info(true, size, max, min);
        }

        return new Info(false, size, max, min);
    }
    public static void main(String[] args) {
        Node root= new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);

        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);
        
        Info info=LargestBST(root);
        System.out.println("largest bst :"+maxBst);
    }
}