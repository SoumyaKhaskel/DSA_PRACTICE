import java.util.*;
public class Matrices {
    public static boolean searchindex(int matrix[][],int knum)
    {
        int n=matrix.length;//row
        int m=matrix[0].length;//column
        for(int i=0;i<n;i++)// i as such for rows 
        {
            for(int j=0;j<m;j++)// j as such for columns
            {
                if(matrix[i][j]==knum)
                {
                    System.out.println("Element found at index : " + "(" + i +","+ j +")");
                    return true;
                }
            }
        }
        System.out.println("Not found ");
        return false;
    }

    public static void printspiral(int matrix[][])
    {
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;


            while(startrow<=endrow && startcol<=endcol)
            {
                //top column fixed i.e(j)
                for(int j=startcol;j<=endcol;j++)
                {
                    System.out.print(matrix[startrow][j]+" ");
                }
                //right row fixed i.e (i)
                for(int i=startrow+1;i<=endrow;i++)
                {
                    System.out.print(matrix[i][endcol]+" ");
                }
                // bottom column fixed i.e(j)
                for(int j=endcol-1;j>=startcol;j--)
                {
                    if(startrow==endrow)
                    {
                        break;
                    }
                    System.out.print(matrix[endrow][j]+" ");
                }
                //left row fixed i.e (i)
                for(int i=endrow-1;i>=startrow+1;i--)
                {
                    if(startcol==endcol)
                    {
                        break;
                    }
                    System.out.print(matrix[i][startcol]+" ");
                }
                
                startcol++;
                startrow++;
                endcol--;
                endrow--;
            }
            System.out.println();
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        //int n=3,m=3; we can normally decalre or take user input or..

        int matrix[][]=new int[3][3];
        int n=matrix.length;//row
        int m=matrix[0].length;//column
        //user input each nuber in  the maxtrix
        for(int i=0;i<n;i++)// i as such for rows 
        {
            for(int j=0;j<m;j++)// j as such for columns
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        //printing my matrix 
        /*for(int i=0;i<n;i++)// i as such for rows 
        {
            for(int j=0;j<m;j++)// j as such for columns
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        int knum=4;*/
        //searchindex(matrix,knum);

        printspiral(matrix);
    }
}
