import java.util.*;
public class ridhhi {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
     //int a,b;
    // System.out.println("Enter your numbers ");
     //a=sc.nextInt();
     //b=sc.nextInt();

     //switch case
     /*System.out.println("Enter your choice ");
     System.out.println("1 for addition");
     System.out.println("2 for subtraction");
     System.out.println("3 for multiplication");
     System.out.println("4 for division");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
            {
                System.out.println(a+b);
                break;
            }
            case 2:
            {
                System.out.println(a-b);
                break;
            }
            case 3:
            {
                System.out.println(a*b);
                break;
            }
            case 4:
            {
                System.out.println(a/b);
                break;
            }
            default:
            {
                System.out.println("wrong choice");
                break;
            }           
        }
*/  
        int s=5;
        int arr[] =new int[s];

         System.out.println("Enter the numbers in the array");

        for(int i=0; i<s; i++){
            System.out.println("enter the element in the box  :"+i);
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<s; i++){
            System.out.println("your array is : ");
            System.out.print(arr[i]);
            
        }
    }
}

