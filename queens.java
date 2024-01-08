import java.util.*;
public class queens {

    public static boolean isSafe(char board[][],int row,int col)
    {
        //vertical up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }

        //diagonalupleft
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        //diagonalupright
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][],int row) {
        //base
        if(row==board.length)
        {
            printboard(board);
            return;
        }

        //column loop
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                nQueens(board, row+1);//function call
                board[row][j]='X'; //backtracking step
            }
        }
    }

    public static void printboard(char board[][])
    {
        System.out.println("_____________ChessBoard________________");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N for checking n X n ");
        int n=sc.nextInt();
        char board[][]= new char[n][n];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]='X';
            }
        }
        nQueens(board,0);
    }
        
}

