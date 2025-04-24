package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static boolean isSafe(int row, int col, char[][] board) {
        // horizontally
        for (int j=0; j<board.length; j++){
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertically
        for (int i=0; i<board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper Left
        int r = row;
        for (int c=col; c>=0 && r>=0; c--, r--){
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper Right
        r = row;
        for (int c=col; c<board.length && r>=0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        r = row;
        for (int c=col; c>=0 && r<board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        r = row;
        for (int c=col; c<board.length && r<board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();

        for (int i=0; i<board.length; i++) {
            String row = "";
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += ".";
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        // base condition -> if col == n (means all 'Q' are in place) then store configuration of board in allBoards
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        // traverse in first column
        for (int row=0; row<board.length; row++) {
            if (isSafe(row, col, board)) {    // this isSafe function check whether 'Q' is safe or not
                board[row][col] = 'Q';   // <-- place 'Q' in first(row,col)
                helper(board, allBoards, col+1);   // <-- call helper function to place 'Q' in next column
                board[row][col] = '.';   // if 'Q' is not safe in the above (row,col), remove it from here and place it somewhere else in the column
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        int n = 4;  // You can change this to any N
        List<List<String>> solutions = solveNQueens(n);

        System.out.println(solutions);  // Prints the output in your required format
    }

}
