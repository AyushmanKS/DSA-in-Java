public class Nqueens5 {

// checking safe positions funstion
    public static boolean isSafe(char board[][], int row, int col) {
        // up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        // left up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

// nQueens recursion/backtraking method
    public static void nQueens(char board[][], int row) {
        // base
        if(row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for(int j=0; j<board.length; j++) {
            // finding safe positions and placing queens
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1); // function call: recursion
                board[row][j] = '.'; // backtracking 
            }

        }
    }

// printing chess board
    public static void printBoard(char board[][]) {
        System.out.println("-----------Chess Board---------------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

// main function
    public static void main(String args[]) {
        int n =4;
        char board[][] = new char[n][n];

        // initialize: create board
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}
