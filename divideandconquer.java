public class divideandconquer {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void mergesortarray(int arr[],int si,int ei) {
        //base case
        if(si>=ei)
        {
            return;
        }

        //recursive call
        int mid=si+(ei-si)/2;  //((si+ei)/2)
        mergesortarray(arr, si, mid);//left
        mergesortarray(arr, mid, ei);//right

        //last newfunction call
        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[],int si,int mid, int ei)
    {
        int temp[]=new int[(ei-si)+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//interator for temp arr

        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //leftout part
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        //leftoutpart from right side
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
    
        //copying temporary array to original array
        for(int t=0;t<=arr.length;t++,k++)
        {
            arr[t]=temp[k];
        }
    }

    public static void quicksort(int arr[],int si,int ei) {
        if(si>=ei)
        {
            return;
        }

        //last element
        int pidx=partition(arr,si,ei);//[pivot index]
        quicksort(arr, si, pidx-1);//left sort
        quicksort(arr, pidx+1, ei);//right sort

    }

    public static int partition(int arr[],int si,int ei) {
        int pivot=arr[ei];
        int i=si-1; //to make place for elements smaller than pivot point

        for(int j=0;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
            }
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp; 
        }

        i++;
        int temp=pivot;
        arr[ei]=arr[i];//pivot=arr[i];
        arr[i]=temp;
        return i;
    }

    public static int search(int arr[],int tar,int si,int ei)
    {
        int mid=si+(ei-si)/2;

        //base case
        if(si>=ei)
        {
            return -1;
        }

        //best case found
        if(arr[mid]==tar)//tar as such target
        {
            return mid;
        }

        //search if mid on line 1
        if(arr[si]<=arr[mid])
        {
            //1st case a on left check
            if(arr[si]<=tar && tar<=arr[mid])
            {
                return search(arr, tar, si, mid-1);
            }
            //else case b right side present
            else
            {
                return search(arr, tar, mid+1, ei);
            }
        }
        else//mid on line 2
        {   //right line
            if(arr[mid]<=tar && tar<= arr[ei])
            {
                return search(arr, tar,mid+1, ei);
            }
            else //left
            {
                return search(arr, tar, si, mid-17)
            }
        }
    }

    public static void main() {
        int arr[]={3,8,6,2,7,4,9};
        mergesortarray(arr, 0, 0); 
        printarray(arr);
    }
}
