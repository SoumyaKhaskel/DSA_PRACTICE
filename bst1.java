import java.util.*;
public class bst1{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root==null){
            root= new Node(val);
            return root;
        }
        if(root.data>val){
            //leftsubtree
            root.left=insert(root.left, val)
        }else{
            //rightsubtree
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right, val);
        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }//voila -else when equals to data
        else{//caase1 leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 single child node
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
    
            //case 3 both children present
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            delete(root.right, val);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root)
    {
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void printinRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printinRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printinRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            printinRange(root.left, k1, k2);
        }
        else{
            printinRange(root.right, k1, k2);
        }
    }
    //sorted order print inorder
    public static void inorder(Node root){
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
    }
}
