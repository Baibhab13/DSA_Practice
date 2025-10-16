// // public class backtracking {
// //     public static void printpermutation(String str, String perm, int idx) {
// //         if(str.length()==0) {
// //             System.out.println(perm);
// //            return;
// //         }
// //         for(int i=0; i<str.length(); i++) {
// //             char currchar = str.charAt(i);
// //            String newStr = str.substring(0,i)+ str.substring(i+1);
// //            printpermutation(newStr, perm+ currchar, idx+1);
// //        }
// //     }
// //     public static void main(String[] args) {
// //        String str = "ABC";
// //        printpermutation(str, "", 0);
// //    }
// // }

// //Q N-QUEENS PROBLEM

// // import java.util.*;

// // class Solution {
// //   public static boolean isSafe(int row, int col, char[][] board) {
// //       //horizontal
// //       for(int j=0; j<board.length; j++) {
// //           if(board[row][j] == 'Q') {
// //               return false;
// //           }
// //       }

// //       //vertical
// //       for(int i=0; i<board.length; i++) {
// //           if(board[i][col] == 'Q') {
// //               return false;
// //           }
// //       }

// //       //upper left
// //       int r = row;
// //       for(int c=col; c>=0 && r>=0; c--, r--) {
// //           if(board[r][c] == 'Q') {
// //               return false;
// //           }
// //       }

// //       //upper right
// //       r = row;
// //       for(int c=col; c<board.length && r>=0; r--, c++) {
// //           if(board[r][c] == 'Q') {
// //               return false;
// //           }
// //       }

// //       //lower left
// //       r = row;
// //       for(int c=col; c>=0 && r<board.length; r++, c--) {
// //           if(board[r][c] == 'Q') {
// //               return false;
// //           }
// //       }

// //       //lower right
// //       for(int c=col; c<board.length && r<board.length; c++, r++) {
// //           if(board[r][c] == 'Q') {
// //               return false;
// //           }
// //       }

// //       return true;
// //   }

// //   public static void saveBoard(char[][] board, List<List<String>> allBoards) {
// //       String row = "";
// //       List<String> newBoard = new ArrayList<>();

// //       for(int i=0; i<board.length; i++) {
// //           row = "";
// //           for(int j=0; j<board[0].length; j++) {
// //               if(board[i][j] == 'Q')
// //                   row += 'Q';
// //               else
// //                   row += '.';
// //           }
// //           newBoard.add(row);
// //       }

// //       allBoards.add(newBoard);
// //   }

// //   public static void helper(char[][] board, List<List<String>> allBoards, int col) {
// //       if(col == board.length) {
// //           saveBoard(board, allBoards);
// //           return;
// //       }

// //       for(int row=0; row<board.length; row++) {
// //           if(isSafe(row, col, board)) {
// //               board[row][col] = 'Q';
// //               helper(board, allBoards, col+1);
// //               board[row][col] = '.';
// //           }
// //       }
// //   }

// //   public static List<List<String>> solveNQueens(int n) {
// //       List<List<String>> allBoards = new ArrayList<>();
// //       char[][] board = new char[n][n];

// //       helper(board, allBoards, 0);
// //       return allBoards;
// //   }

// //   public static void main(String[] args) {
// //     int n=4;
// //     List<List<String>> result = solveNQueens(n);
// //     System.out.println(result);
// //   }
// // }

// // SUDOKO SOLVER

// public class backtracking {
//     public boolean issafe(char board[][],int row,int col,int number) {
//         //three place to check row col and grid
//         for(int i=0;i<board.length;i++) {
//             //column wise check
//             if(board[i][col]==(char)(number+'0')) {
//                 return false;
//             }
//             //row wise check
//             if(board[row][i] ==(char)(number+'0')) {
//                 return false;
//             }
//         }

//         //grid check
//         int sr = (row/3)*3;
//         int sc = (col/3)*3;

//         for(int i=0;i<sr+3;i++) {
//             for(int j=sc;j<sc+3;j++) {
//                 if(board[i][j] == (char)(number+'0')) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public boolean helper(char[][] board, int row, int col) {
//         //base case
//         if(row==board.length) {
//             return true;
//         }

//         int nrow = 0;
//         int ncol = 0;
//         if (col != board.length - 1) {
//             nrow = row;
//             ncol = col + 1;
//         } else {
//             nrow = row + 1;
//             ncol = 0;
//         }
//         if (board[row][col] != '.') {
//             if (helper(board, nrow, ncol)) {
//                 return true;
//             }
//         } else {
//             for (int i = 1; i < 9; i++) {
//                 if (issafe(board, row, col, i)) {
//                     board[row][col] = (char) (i + '0');
//                     if (helper(board, nrow, ncol)) {
//                         return true;
//                     } else {
//                         board[row][col] = '.';
//                     }
//                 }
//             }
//         }
//         return false;
//     }

//     public void sloveSudoku(char[][] board) {
//         helper(board, 0, 0);
//     }
// }