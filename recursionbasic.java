public class recursionbasic {

    public static boolean issorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }

        if(arr[i]>arr[i+1])
        {
            return false;
        }

        return(issorted(arr,i+1));
    }

    public static int firstoccurence(int arr[],int i, int key) //to check first occurence of an element
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstoccurence(arr,i+1,key);
    }

    public static int lastoccurence(int arr[],int i, int key) //to check last occurence of an element
    {
        if(i==arr.length)
        {
            return -1;
        }
        int isfound=lastoccurence(arr, i+1, key);

        if(isfound==-1 && arr[i]==key)
        {
            return i;
        }
        return isfound;

    public static void main(String[] args){
        int arr[]={1,2,9,4,5};
        System.out.println(firstoccurence(arr,0,9));
        
    }
}
