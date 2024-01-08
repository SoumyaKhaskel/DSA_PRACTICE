public class arraysort {

    public static int Bubblesort(int arr[],int swap)
    { 
        
        for(int turn=0;turn<arr.length-1;turn++)
        {   
            
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])//swap if next element is greater
                {
                    int temp=arr[j];//adjacent elemts sorting
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;//swap complete
                    swap++;
                }
            }
            if(swap>0)
            {
                break;
            }
            
        }
        return swap;
        
    }

    public static void selectionsort(int arr[])
    {   int n=arr.length;
        for(int i=0;i<n-1;i++)
        {   
            int minpos=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minpos]<arr[j])//arr[minpos]<j when we need to sort the array in descending order.
                {
                    minpos=j;
                }
            }
            //swaping
            int temp= arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }
    }

    public static void insertionsort(int arr[])
     {
        int n=arr.length;
        for(int i=1;i<n;i++)
        { 
            int current=arr[i];
            int prev=i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]>current)
            {
                arr[prev+1]=arr[prev];
                prev--;

            }
            //insertion begins

            arr[prev+1]=current;
        }    
    } 

    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {   int swap=0;
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        
        printarray(arr);
    }
}
