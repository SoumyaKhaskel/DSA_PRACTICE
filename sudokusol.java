public class sudokusol {

    public static boolean isSafe(int sudoku[][],int row,int col,int digit) {
        //column check
        for(int i=0;i<=8;i++)
        {
            if(sudoku[i][col] == digit)
            {
                return false;
            }
        }
        //row check
        for(int j=0;j<=8;j++)
        {
            if(sudoku[row][j] == digit)
            {
                return false;
            }
        }

        //grid check
        int sr=(row/3)*3;
        int sc=(col/3)*3;//checked first starting row and column for the values
        
        for(int i=sr;i<sr+3;i++)//traversing 2d arrays of3x3 grids
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudoku[i][j]==digit)
                {
                    return false;
                }
            }
        }

        return true; //when its safe after all 3 checks
    }

    public static boolean sudukosolver(int sudoku[][],int row,int col) {
        //base case
        if(row ==9 && col ==0)
        {
            return true;
        }
        
        //recursion
        int nextrow=row;int nextcol=col+1;
        if(col+1==9)
        {
            nextrow=row+1;
            nextcol=0;
        }

        //checking if elements are already placed in the suduko grid
        if(sudoku[row][col]!=0)
        {
            return sudukosolver(sudoku, nextrow, nextcol);
        }
        //checking for empty elements now
        for(int digit=1;digit<=9;digit++)
        {
            if(isSafe(sudoku,row,col,digit))
            {
                sudoku[row][col]=digit;
                if(sudukosolver(sudoku, nextrow, nextcol))//soluton exists or not
                {
                    return true;
                }sudoku[row][col]=0;
            }   
        }
        return false;
    }

    public static void printsuduko(int sudoku[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(  sudoku[i][j]+" ");
              
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0,},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};

        if(sudukosolver(sudoku,0,0))
        {
            System.out.println("Solution exists : ");
            printsuduko(sudoku);
        }
        else
        {
            System.out.println("Solution does not exits");
        }
    }
}
