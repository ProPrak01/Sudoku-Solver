class Solver{
    public boolean helper(char[][] board, int row, int column){
        int new_row= 0;
        int new_column =0;
        if(column != board.length-1){
            new_row = row;
            new_column = column + 1;

        }else{
            new_row = row +1;
            new_column = 0;

        }
        


      return false;
    }
    public void SolveSudoku(char[][] board){
        helper(board,0,0);


    }
}