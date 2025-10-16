package Practice;
/*Q1 Java Program to Print Even Numbers from 1 to N using For loop

//Attempt 1

//import java.util.Scanner;

//public class practice {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int i = sc.nextInt();
        
        //do {
          //  System.out.println(i);
            //i = i % 2==0;
        //} while(i<=n)  
    //}
    
//}

//Attempt 2

//import java.util.Scanner;

//public class practice {
    //public static void main(String[] args) {
       // try (Scanner sc = new Scanner(System.in)) {
          //  int i = sc.nextInt();
            
           // for (i = 0; i<=100; i++) {
             //   if (i%2 == 0) {
               // }else {
                 //   System.out.println(i);
                //}
            //}
        //}      
    //}
//}

//Attempt 3 Succeful answer 

//import java.util.*;

//public class practice {
    //public static void main(String[] args) {                
      // try (Scanner sc = new Scanner(System.in)) {
        //int n = sc.nextInt();                                
           
          // for(int i = 0; i <=n; i++) {
            //if (i %3==0) {
              //  System.out.println(i);
                //}
     //      }
    //}
    //}
//}

//Q2

//Attempt1

//import java.util.Scanner;

//public class practice {
 //   public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in); 
   //     int input;
        //do {
            //int marks = sc.nextInt();
            //if (marks >= 90 && marks<=100) {
            //    System.out.println("This is good!!");
          //  }else if(marks >=89 && marks <=60) {
          //      System.out.println("This is also good!");
        //    }else if(marks >= 59 && marks <= 0) {
              //  System.out.println("This is good as well");
            //}else {
          //      System.out.println("Invalid");
        //    }
      //     
    //        System.out.println("Want to continue? Yes(1) No(0)");
  //          int input = sc.nextInt();
//
    //    } while (input == 1);
  //  }
//}

//Attempt 2  Sucessfull attempt

//import java.util.*;

//public class practice {
    //public static void main(String[] args) {
  //      Scanner sc = new Scanner(System.in);
//        int input;

//        do{
        //    int marks = sc.nextInt();
      //      if(marks<=100 && marks>=90) {
    //            System.out.println("this is good!!");
  //          }else if(marks<=89 && marks>=60) {
//                System.out.println("this is also good!");
          //  }else if (marks<=59 && marks>=0) {
        //        System.out.println("this is good as well");
      //      }else {
    //            System.out.println("Invalid");
  //          }
//
//            System.out.println("want to know? Yes(1)  No(0)");
            //input = sc.nextInt();
            
       // }while (input == 1);
   // }
//}

//Q3 Try to declare meaningful variables of each type
//   eg. A variable named age should be a numeric type(int or float) not byte?

//public class practice {
  //public static void main(String[] args) {
 //   int age = 36;
    
//    System.out.println(age);
    
  //}
//}

//Q4 Make a program that takes the radiuss of a circle as input,
//   and calculates its perimeter and areaand print it as output to the user?

//import java.util.*;

//public class practice {
  //public static void main(String[] args) {
    //try (Scanner sc = new Scanner(System.in)) {
      //System.out.println("Radius of the circle is-");
      //int r = sc.nextInt();
      //final float PI = 3.14F;

      //final float perimeter = (float) (2*PI*r);
      //System.out.println("The perimeter of the circle is");
      //System.out.println( perimeter);

      //final float area = (float) (PI*r*r);
      //System.out.println("The area of the circle");
      //System.out.println(area);
    //}
  //}
//}

//Q5 Make a program that prints the table of a number that is input by the user?

//import java.util.*;

//public class practice {
  //public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
    //System.out.println("Want a table ? Pls type the number");
  //  int number = sc.nextInt();
//
  //  System.out.println("here is the table");
//
  //  System.out.println(number*1);
//    System.out.println(number*2);
   // System.out.println(number*3);
 //   System.out.println(number*4);
   // System.out.println(number*5);
 //   System.out.println(number*6);
   // System.out.println(number*7);
//    System.out.println(number*8);
//    System.out.println(number*9);
//    System.out.println(number*10);
//  }
//}

//Q make a calculator?

//import java.util.*;

//public class practice {
  //public static void main(String[] args) {
//    try (Scanner sc = new Scanner(System.in)) {
    //  System.out.println("hello, im ur calculator!!");
  //    System.out.println("");
//      System.out.println("Press 1 for addition");
      //System.out.println("Press 2 for substarction");
    //  System.out.println("Press 3 for multiplication");
  //    System.out.println("Press 4 for division");
//      System.out.println("Press 5 for modulus or remainder");
      
      //int a = sc.nextInt();
    //  int b = sc.nextInt();
  //    int operator = sc.nextInt();
  

//      switch(operator) {
       // case 1 : System.out.println(a+b);
    //    break;
  //      case 2 : System.out.println(a-b);
//        break;
        //case 3 : System.out.println(a*b);
      //  break;
    //    case 4 : if (b==0) {
  //        System.out.println("invalid division");
//        }else {
        //  System.out.println(a/b);
      //  }
    //    break;
  //      case 5 : if(b==0) {
//          System.out.println("invalid division");
      //  }else {
    //      System.out.println(a%b);
  //      }break;
//        default :  System.out.println("Invalid operator");
    //  }
  //  }
//  }
//}


//Print the pattern
//       * * * * *
//     *       *
//   *       *
// * * * * *

// Attempt 1

//public class practice {
  //public static void main(String[] args) {
    //int n=5;

    //spaces
    //for(int i=1; i<=n; i++) {
      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(" ");
      //}
      
      //stars
      //for(int j=1;j<=n; j++) {
        //if()
      //}
      //System.out.println();
    //}
  //}
//}

// Attempt 2   Computers answer

//import java.util.*;

//public class practice {
  //public static void main(String[] args) {
    //Scanner sc=new Scanner(System.in);
	  //System.out.println("Enter N : ");
	  //int n=sc.nextInt();
	 
    //System.out.print("Enter Symbol : ");
	  //char c = sc.next().charAt(0);
 
	//for(int i=1;i<=n;i++) {
    //for(int j=1;j<=n-i;j++) {
         //System.out.print(" ");
      //}
	    //if(i==1 || i==n)
        //for(int j=1;j<=n;j++) {
          //System.out.print(c);
        //} else {
        //for(int j=1;j<=n;j++) {  
            //if(j==1 || j==n)
              //System.out.print(c);
              //else
              //System.out.print(" ");
        //}
          //}
      //System.out.println();
    //}             
  //}
//}

// Attempt 3

//public class practice {
  //public static void main(String[] args) {
    //int n=5;

    //for(int i=1; i<=n; i++) {
      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(" ");
     // } if(i==1 || i==n) {
       // for(int j=1; j<=n; j++) {
         // if(i==1 || i==n) {
           // System.out.print("*");
          //} else {
            //for(j=1; j<=n; j++) {
              //if(j==1 || j==n) {
                //System.out.print("*");
              //} else {
                //System.out.print("*");
             // }
            //}

          //}
        //}
      //}
      //System.out.println();
    //}
  //}
//}

// Attempt 4  Answer dekh liya tha!!!!

//public class practice {
  //public static void main(String[] args) {
    //int n=5;

    //for(int i=1; i<=n; i++) {
      
      // Spaces before the stars

      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(" ");
      //}

      // stars after the spaces

      //for(int j=1; j<=n; j++) {
        //if(i>=2 && i<=4) {
          //if(j>=2 && j<=4) {
            //System.out.print(" ");
          //} else {
            //System.out.print("*");
          //}
        //} else {
         // System.out.print("*");
       // }
     // } 
      //System.out.println();
    //}
  //}
//}

//Q Print the hollw butterfly

// *           *
// **         **
// *  *     *  *
// *    * *    *
// *    * *    *
// *  *     *  *
// **         **
// *           *

/*public class practice {
  public static void main(String[] args) {
    int n=5;
    
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=i; j++) {
        if(j==1||j==i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      for(int j=1; j<=2*(n-i); j++) {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++) {
        if(j==1||j==i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int i=n; i>=1; i--) {
      for(int j=1; j<=i; j++) {
        if(j==1||j==i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      for(int j=1; j<=2*(n-i); j++) {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++) {
        if(j==1||j==i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
} */

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

//Q Print Half pyramid

//     1
//    1 2 
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5 


//public class practice {
  //public static void main(String[] args) {
    //int n=5;

    //for(int i=0; i<=n; i++) {
      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(" ");
      //}
      //for(int j=1; j<=i; j++) {
        //System.out.print(j+" ");
      //}
      //System.out.println();
    //}
  //}
//}

//QPrint the inverted pyramid

//1 1 1 1
//2 2 2
//3 3
//4

//public class practice {
  //public static void main(String[] args) {
    //int n=5;

    //for(int i=1; i<=n; i++) {
      //for(int j=1; j<=(n-i); j++) {
        //System.out.print(i+" ");
      //}
      //System.out.println();
    //}
  //}
//}

//Q Print a heart shape

//public class practice {
  //public static void main(String[] args) {
    //  for (int i = 0; i < 6; i++) {
      ///    for (int j = 0; j < 7; j++) {
         //     if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0) || (i - j == 2) || (i + j == 8)) {
           //       System.out.print("*");
             // } else {
               //   System.out.print(" ");
              //}
          //}
          //System.out.println();
      //}
  //}
//}


//Q Write a program to enter the umbers till the user wants and at the end
//  it should display the count of positive, negative, zeroes entered.

//import java.util.*;


//public class practice {
   //public static void main(String args[]) {
      // int positive = 0, negative = 0, zeros = 0;
    //   System.out.println("Press 1 to continue & 0 to stop");
  //     try (Scanner sc = new Scanner(System.in)) {
//        int input = sc.nextInt();


         //while(input == 1) {
             //System.out.println("Enter your number : ");
             //int number = sc.nextInt();
             //if(number > 0) {
            //     positive++;
          //   } else if(number < 0) {
        //         negative++;
      //       } else {
    //             zeros++;
  //           }
//
//
          //   System.out.println("Press 1 to continue & 0 to stop");
        //     input = sc.nextInt();
       //  }
      //}
       //System.out.println("Positives : "+ positive);
      // System.out.println("Negatives : "+ negative);
    //   System.out.println("Zeros : "+ zeros);
  // }   
//}

/* public class practice {
  public static void main(String[] args) {
    for(int i=1;i<=10;i++) {
      System.out.println("sushreeta how are you");
    }
  }
} */

/*Print the pascal triangle
    1
  1 2 1
1 2 3 2 1
  1 2 1
    1
  
public class practice {
  public static void main(String[] args) {
    int n=4;

    for(int i=1;i<n;i++) {
      
      //inner loop for spaces
      for(int j=1;j<(n-i);j++) {
        System.out.print(" ");
      }

      //inner loop for stars
      for(int j=1;j<=i;j++) {
        System.out.print(j);
      }
      for(int j=i-1;j>=1;j--) {
        System.out.print(j);
      }
      System.out.println("");
    }
    for(int i=n-2;i>=1;i--) {
      
      //inner loop for spaces
      for(int j=1;j<(n-i);j++) {
        System.out.print(" ");
      }

      //inner loop for stars
      for(int j=1;j<=i;j++) {
        System.out.print(j);
      }
      for(int j=i-1;j>=1;j--) {
        System.out.print(j);
      }
      System.out.println("");
    }
  }
}
*/

//Print the pattern
// * * * * *
//   *   *
//     *
// * * * * * 
//     *
/* 
public class practice {
  public static void main(String args[]) {
    int n=3;
    for(int i=n;i>=1;i--) {
      //spaces
      for(int j=0;j<=(n-i);j++) {
        System.out.print(" ");
      }
      //stars print
      for(int j=1;j<=i;j++) {
        System.out.print("*");
      }

      for(int j=i-1;j>=1;j--) {
        System.out.print("*");
      }
      System.out.println("");
      
    }
    System.out.println(" *****");
    System.out.println("   *");
  }
}

*/
/* 
import java.io.*;
class q8
{
public static void main (String[] args)throws IOException
{
BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter first number: ");
int a= Integer.parseInt(n.readLine());
System.out.println("enter second number: ");
int b= Integer.parseInt(n.readLine());
System.out.println("before swapping two numbers: "+a+"and"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping two numbers: "+a+"and"+b);
}
} */

//REERSE A STRING
// public class practice {
//   public static void main(String[] args) {
//     StringBuilder a = new StringBuilder("Hello");
//     for(int i=0;i<a.length()/2;i++) {
//       int front=i;
//       int back= a.length()-1-i;

//       char frontChar = a.charAt(front);
//       char backChar = a.charAt(back);

//       a.setCharAt(front,backChar);
//       a.setCharAt(back,frontChar);
//     }

//     System.out.println(a);
//   }
// }

public class practice {
  public static void main(String[] args) {
    String a = "Hello world";
    StringBuilder sb = new StringBuilder(a);
    System.out.println(sb);
    sb.append(" of PMEC!");
    System.out.println(sb);
  }
}