// Q1 Print the pattern

//  *****
//  *****
//  *****
//  *****

//public class Nestedloops {
    //public static void main(String[] args) {
      //int n = 4;
    //  int m = 5;
      
      //outer loop: forms the rows of a pattern
  //    for(int i= 1; i<= n; i++) {
//        System.out.println();
        //inner loop: forms the column of the loop
       // for(int j = 1; j<= m; j++) {
        //    System.out.print("*");
      //  }
    //  } 
  //  }
//  }
     
//Q2 Print the pattern
//  *****
//  *   *
//  *   *
//  *****

//public class Nestedloops {
//  public static void main(String[] args) {
  //  int n = 4;
//    int m = 5;

    //for(int i = 1; i<=n; i++) {
  //    for(int j=1; j<=m; j++) {
//        if(i==1 || j==1 || i==n || j==m) {
        //  System.out.print("*");
      //  }else {
    //      System.out.print(" ");
  //      }
//      }
      //System.out.println();
    //}
  //}
//}

//Q3 Print the pattern HALF PYRAMID
//   *
//   **
//   ***
//   ****

//public class Nestedloops {
  //public static void main(String[] args) {
//    int n = 4;

//    for(int i=1; i<=n; i++) {
    //  for(int j=1; j<=i; j++) {
  //      System.out.print("*");
//      }
      //System.out.println( );
    //}
  //}
//}

// Q4 Print the pattern INVERTED HALF PYRAMID
// ****
// *** 
// **
// *

//public class Nestedloops {
  //public static void main(String[] args) {
    //int n = 4;

    //for(int i=n; i>=1; i--) {
      //for(int j=1; j<=i; j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}
  //}
//}

//Q5 Print the pattern INVERTED HALF PYRAMID(180^0)
//      *
//     **
//    ***
//   ****

// import java.util.*;

// public class Nestedloops {
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
        
//    for(int i = 1; i<=n; i++) {
     
//       //inner loop for the space print
//       for(int j = 1; j<=n-i; j++) {
//         System.out.print(" ");
//       }
//       //inner loop for star print
//     for(int j = 1; j<=i; j++) {
//       System.out.print("*");
//     } 
//       System.out.println("");
//     }
//     sc.close();
//   }
// }

//Q6 Print the pattern
//1
//12
//123
//1234
//12345

//public class Nestedloops {
  //public static void main(String[] args) {
//    int n = 5;

//    for(int i = 1; i<=n; i++) {
    //  for(int j = 1; j<=i; j++) {
  //      System.out.print(j+" ");
//      }
      //System.out.println(" ");
    //}
  //}
//}

//Q7 Print the pattern
//12345
//1234
//123
//12
//1

//Answer type 1

//public class Nestedloops {
  //public static void main(String[] args) {
    //int n = 5;

    //for(int i=n; i>=1; i--) {
      //for(int j=1; j<=i; j++) {
        //System.out.print(j+" ");
      //}
      //System.out.println();
    //}
  //}
//}

//Answer 2

//public class Nestedloops {
  //public static void main(String[] args) {
    //int n = 5;

    //for(int i=1; i<=n; i++) {
      //for(int j=1; j<=n-i+1; j++) {
        //System.out.print(j+" ");
      //}
      //System.out.println();
    //}
  //}
//}

// Print the pattern
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

//public class Nestedloops {
  //public static void main(String[] args) {
      //int n = 5;
      //int number = 1;

      //for(int i = 1; i<=n; i++) {
        //for(int j = 1; j<=i; j++){
        //System.out.print(number+" ");
        //number++; //number=number+1;
      //}
      //System.out.println();
    //}
  //}
//}

// Q Print the pattern
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

//public class Nestedloops {
  //public static void main(String[] args) {
     // int n =5;
      
      //for(int i=1; i<=n; i++) {
        //for(int j= 1; j<=i; j++) {
         // int sum=i+j;
         // if(sum%2==0) {
            //System.out.print("1 ");
          //}else {
            //System.out.print("0 ");
          //}
        //}
      //  System.out.println();
    //  }
  //}
//}

//Q10 Print the pattern Buuterfly pattern
// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

//public class Nestedloops {
  //public static void main(String[] args) {
    //  int n=5;
      //first half
      //for(int i=1; i<=n; i++) {
      // for(int j=1; j<=i; j++) {
        //  System.out.print("*");
        //}

        //int spaces = 2*(n-i);
        //for(int j=1; j<=spaces; j++) {
          //System.out.print(" ");
       // }

       //2nd half
       //for(int j=1; j<=i; j++) {
        //System.out.print("*");
       //}
        //System.out.println();
      //}
      //for(int i=n; i>=1; i--) {
        //for(int j=1; j<=i; j++) {
          //System.out.print("*");
        //}
        //int spaces = 2*(n-i);
        //for(int j=1; j<=spaces; j++) {
          //System.out.print(" ");
        //}

       //2nd half
       //for(int j=1; j<=i; j++) {
        //System.out.print("*");
       //}
        //System.out.println();
      //}
  //}
//}

//Q11 Print the pattern  Solid rhombus
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

//public class Nestedloops {
  //public static void main(String[] args) {
    //int n=5;

    //spaces
    //for(int i=1; i<=n; i++) {
      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(" ");
      //}
      
      //stars
     // for(int j=1;j<=n; j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}
  //}
//}

//Q12 Print the pattern
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

//public class Nestedloops {
  //public static void main(String[] args) {
    //int n = 5;

    //for(int i=1; i<=n; i++) {
      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(" ");
      //}
      //for(int j=1; j<=i; j++) {
        //System.out.print(i+" ");
      //}
      //System.out.println();
    //}
  //}
//}

//Q13 Print the pattern Pallindromic pattern
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

//public class Nestedloops {
  //public static void main(String[] args) {
    //int n = 5;

    //for(int i=1; i<=n; i++) {
      //spaces
      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(" ");
      //}
      //numbers
      //for(int j=i; j>=1; j--) {
        //System.out.print(j);
      //}
      //for(int j=2; j<=i; j++) {
        //System.out.print(j);
      //}
      //System.out.println();
    //}
  //}
//}

//Q14 Print the pattern 
//       *
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

//public class Nestedloops {
  //public static void main(String[] args) {
    //int n=4;

    //for(int i=1; i<=n; i++) {
      //spaces
      //for(int j=1; j<=(n-i);   j++) {
        //System.out.print(" ");
      //}
      //for(int j=1; j<=(2*i-1); j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}

    //for(int i=n; i>=1; i--) {
      //spaces
      //for(int j=1; j<=(n-i);   j++) {
        //System.out.print(" ");
      //}
      //for(int j=1; j<=(2*i-1); j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}
  //}
//}

// Q Print the hollw butterfly

// *           *
// **         **
// *  *     *  *
// *    * *    *
// *    * *    *
// *  *     *  *
// **         **
// *           *

//public class Nestedloops {
  //public static void main(String[] args) {
    //int n=5;
    
    //for(int i=1; i<=n; i++) {
      //for(int j=1; j<=i; j++) {
        //if(j==1||j==i) {
          //System.out.print("*");
        //} else {
          //System.out.print(" ");
        //}
      //}
      //for(int j=1; j<=2*(n-i); j++) {
        //System.out.print(" ");
      //}
      //for(int j=1; j<=i; j++) {
        //if(j==1||j==i) {
         // System.out.print("*");
        //} else {
          //System.out.print(" ");
        //}
      //}
      //System.out.println();
    //}
    //for(int i=n; i>=1; i--) {
     // for(int j=1; j<=i; j++) {
       // if(j==1||j==i) {
         // System.out.print("*");
        //} else {
          //System.out.print(" ");
        //}
      //}
      //for(int j=1; j<=2*(n-i); j++) {
        //System.out.print(" ");
      //}
      //for(int j=1; j<=i; j++) {
        //if(j==1||j==i) {
         // System.out.print("*");
        //} else {
         // System.out.print(" ");
        //}
      //}
      //System.out.println();
    //}
  //}
//}

//Q Print a hollow rhombus
//         * * * * * 
//       *       *
//     *       *
//   *       *
// * * * * *

//public class practice {
  //public static void main(String[] args) {
    //int n=5;

// for the spaces 
    //for(int i=1; i<=n; i++) {
      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(" ");
      //}

      // for the dots
      //for(int j=1; j<=n; j++) {
        //if(i==1||i==n||j==1||j==n) {
          //System.out.print("* ");
        //} else {
         // System.out.print("  ");
        //}
      //}
      //System.out.println();
    //}
  //}
//}

// public class Nestedloops {
//   public static void main(String[] args) {
//       for (int i = 0; i < 6; i++) {
//           for (int j = 0; j < 7; j++) {
//               if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0) || (i - j == 2) || (i + j == 8)) {
//                   System.out.print("*");
//               } else {
//                   System.out.print(" ");
//               }
//           }
//           System.out.println();
//       }
//   }
// }
