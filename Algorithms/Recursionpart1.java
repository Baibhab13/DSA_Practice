// Print number from 5 to 1

//public class Recursionpart1 {
  //  public static void printnumber(int n) {
    //    if(n==0) {
      //      return;
        //}
        //System.out.println(n);
        //printnumber(n-1);
        //return;
    //}
    //public static void main(String[] args) {
      //  int n=5;
        //printnumber(n);
    //}
//}

// Q Print number from 1 to 5

//public class Recursionpart1 {
    //public static void printnumber(int n ) {
        //if(n==6) {
          //  return;
        //}
        //System.out.println(n);
      //  printnumber(n+1);
    //}

    //public static void main(String[] args) {
      //  int n=1;
    //    printnumber(n);
  //  }
//}

// Q Print sum of first n natural number

//public class Recursionpart1 {
    //public static void printsum(int i, int n, int sum) {
        //if(i==n) {
           // System.out.println(sum);
          //  return;
        //}
        //sum += i;
      //  printsum(i+1, n, sum);
    //}

    //public static void main(String[] args) {
    //  printsum(1, 5, 0);
  //  }
//}

//Q print the factorial of a number n

//import java.util.*;

//public class Recursionpart1 {
  //public static int calcfactorial(int n) {
    //if(n==1||n==0) {
      //return 1;
    //}
    //int fact_nm1 = calcfactorial(n-1);
    //int fact_n = n*fact_nm1;
   // return fact_n;
  //} 

  //public static void main(String[] args) {
    //try (Scanner sc = new Scanner(System.in)) {
      //int n=sc.nextInt();
      //int ans = calcfactorial(n);
      //System.out.println(ans);
    //}
  //}
//}

//Q Print the fibonacci series till nth term.

//public class Recursionpart1 {
  //public static void printfib(int a, int b, int n) {
    //if(n==0) {
      //return;
    //}
    //int c= a+b;
    //System.out.println(c);
    //printfib(b,c,n-1);
    //return;
  //}
  //public static void main(String[] args) {
    //int a=0;
    //int b=1;
    //System.out.println(a);
    //System.out.println(b);
    //int n=7;
    //printfib(a,b,n-2);
  //}
//}

//QPrint x^n(Stack height =n).

//import java.util.*;

//public class Recursionpart1 {
 // public static int calcPower(int x, int n) {
   // if(n==0) {   //base casé1
     // return 1;
    //}
    //if(x==0) {  //base case 2
      //return 0;
    //}
    //int xPower1 = calcPower(x, n-1);   //kaam
    //int xPower = x * xPower1;
    //return xPower;
  //}

  //public static void main(String[] args) {

    //Scanner sc = new Scanner(System.in);
    //int x=sc.nextInt();
    //int n=sc.nextInt();

    //int ans= calcPower(x, n);
    //System.out.println(ans);
  //}
//}

//Q Print x^n(stack height = logn).

//public class Recursionpart1 {
  //public static int calcPower(int x, int n) {
    //if(n==0) {
      //return 1;
    //}
    //if(x==0) {
      //return 0;
    //}
    //if(n%2==0) {  //if n is even
      //return calcPower(x, n/2)*calcPower(x, n/2);
    //} else {   //if n is odd
      //return calcPower(x, n/2)*calcPower(x, n/2)*x;
    //}
  //}
  //public static void main(String[] args) {
    //int x=2;
    //int n=5;
    //int ans= calcPower(x, n);
    //System.out.println(ans);
  //} 
//}