// import java.util.*;

// public class twoDarray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows =sc.nextInt();
//         int cols=sc.nextInt();
//         int mat[][] = new int[rows][cols];

//         // input
//         for(int i=0;i<rows;i++) {
//             for(int j=0;j<cols;j++) {
//                 mat[i][j] = sc.nextInt();
//             }
//         }

//         //output
//         for(int i=0;i<rows;i++) {
//             for(int j=0;j<cols;j++) {
//                 System.out.print(mat[i][j] + " ");
//             }
//             System.out.println(); //printing the next line
//         }
//         sc.close();
//     }
// }

//take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

// import java.util.*;

// public class twoDarray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows =sc.nextInt();
//         int cols=sc.nextInt();

//         int mat[][] = new int[rows][cols];

//         // input
//         for(int i=0;i<rows;i++) {
//             for(int j=0;j<cols;j++) {
//                 mat[i][j] = sc.nextInt();
//             }
//         }

//         int x = sc.nextInt();

//         //output
//         for(int i=0;i<rows;i++) {
//             for(int j=0;j<cols;j++) {
//                if(mat[i][j]==x) {
//                 System.out.println("x found at location"+i+","+j);
//                }
//             }
//             System.out.println(); //printing the next line
//         }
//         sc.close();
//     }
// }

//print the spiral order matrix as output for a given matri of number.
// input
// 1, 5, 7, 9, 10, 11
// 6, 10, 12, 13, 20
// 9, 25, 29, 30, 32, 41
// 15, 55, 59, 63, 68, 70
// 40, 70, 79, 81, 95, 105
// output
//1,5,7,9,10,11,21,41,70,105,95,,81,79,70,40,15,9,6,10,12,13,20,32,68,63,59,55,25,29,30

// Algorithm: (We are given a 2D matrix of n X m ).
// 1. We will need 4 variables:
// a. row_start - initialized with 0.
// b. row_end - initialized with n-1.
// c. column_start - initialized with 0.
// d. column_end - initialized with m-1.
// 2. First of all, we will traverse in the row row_start from column_start
// to column_end and we will increase the row_start with 1 as we have
// traversed the starting row.
// 3. Then we will traverse in the column column_end from row_start to
// row_end and decrease the column_end by 1.
// 4. Then we will traverse in the row row_end from column_end to
// column_start and decrease the row_end by 1.
// 5. Then we will traverse in the column column_start from row_end to
// row_start and increase the column_start by 1.
// 6. We will do the above steps from 2 to 5 until row_start <= row_end
// and column_start <= column_end.

public class twoDarray {
    public static void main(String[] args) {

        int mat[][] = {
                { 1, 5, 7, 9, 10, 11 },
                { 6, 10, 12, 13, 20 },
                { 9, 25, 29, 30, 32, 41 },
                { 15, 55, 59, 63, 68, 70 },
                { 40, 70, 79, 81, 95, 105 }
        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int row_start = 0;
        int row_end = mat.length - 1;
        int column_start = 0;
        int column_end = mat.length - 1;

        while (row_start <= row_end && column_start <= column_end) {
            // 1
            for (int col = column_start; col <= column_end; col++) {
                System.out.print(mat[row_start][col] + " ");
            }
            row_start++;
            // 2
            for (int row = row_start; row <= row_end; row++) {
                System.out.print(mat[row][column_end]+" ");
            }
            column_end--;
            // 3
            for (int col = column_end; col >= column_start; col--) {
                System.out.print(mat[row_end][col] + " ");
            }
            row_end--;
            // 4
            for (int row = row_end; row >= row_start; row--) {
                System.out.print(mat[row][column_start]+" ");
            }
            column_start++;
            System.out.println();
        }
    }
}

// TRANSPOSE OF A MATRIX
// for a given matrix n*m, print is transpose

// import java.util.*;

// public class twoDarray {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int rows =sc.nextInt();
// int cols=sc.nextInt();

// int mat[][] = new int[rows][cols];

// // input
// for(int i=0;i<rows;i++) {
// for(int j=0;j<cols;j++) {
// mat[i][j] = sc.nextInt();
// }
// }

// //transpose of a matrix
// for(int i=0;i<rows;i++) {
// for(int j=0;j<cols;j++) {
// System.out.print(mat[j][i]+ " ");
// }
// System.out.println();
// }

// sc.close();
// }
// }