import java.util.*;//all import
public class mergebest {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
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
    public static Node createBst(ArrayList<Integer>arr,int st,int end)
    {
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBst(arr, st, mid-1);
        root.right=createBst(arr,mid+1, end);
        return root;
    }
    public static Node mergeBst(Node root1,Node root2)
    {
        //step1
        ArrayList<Integer>arr1=new ArrayList<>();
        getInorder(root1, arr1);

        //step2
        ArrayList<Integer>arr2=new ArrayList<>();
        getInorder(root2, arr2);

        //merge
        int i=0,j=0;
        ArrayList<Integer>finalarr=new ArrayList<>();
        while(i<arr1.size()&&j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }else{
                finalarr.add(arr2.get(j));
                j++;
            }           
        }

        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
        }

        //sorted Array list to final balanced bst
        int st=0;
        return createBst(finalarr, st, finalarr.size()-1);
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

    public static void main(String[] args) {
        //bst1
        Node root1= new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);
        //bst 2
        Node root2= new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        Node root=mergeBst(root1, root2);
        preorder(root);
    }
}
