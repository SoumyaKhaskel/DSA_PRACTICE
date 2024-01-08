import java.util.*;//all import
public class bst2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void preorder(Node root){
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void getInorder(Node root,ArrayList<Integer>inorder)
    {
        if(root==null)
        {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node createBst(ArrayList<Integer>inorder,int st,int end)
    {
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBst(inorder, st, mid-1);
        root.right=createBst(inorder,mid+1, end);
        return root;
    }
    public static Node balancedBST(Node root){
        //inoder seq which gives the tree in sorted order
        ArrayList<Integer>inorder=new ArrayList<>();
        getInorder(root,inorder);

        //sorted inorder to balanced bst
        int st=0;
        root=createBst(inorder,st,inorder.size()-1);
        return root;
    }

    public static void main(String[] args) {
        Node root= new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        root=balancedBST(root);
        preorder(root);

    }
}
