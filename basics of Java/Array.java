// public class Array {
//     public static void main(String[] args) {
//         // defining an array:
//         //type[] arrayname = new tpe[size];
//         //int[] marks = new int[3];

//         // int[] marks = new int[3];
//         int[] marks = {2,4,3};
//         // int marks[] = new int[3];
//         // marks[0]=83;
//         // marks[1]=99;
//         // marks[2]=95;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for(int i=0;i<3;i++) {
//             System.out.println(marks[i]);
//         }

//         //type arrayName[]={2,4,3,6,4};
//     }
// }
// import java.util.*;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[]  = new int[size];

//         for(int i=0;i<size;i++) {
//             numbers[i] = sc.nextInt();
//         }
//         for(int i=0;i<size;i++) {
//             System.out.println(numbers[i]);
//         }
//         //it will display 0 only
//         //it initialize
//         sc.close();

//     }
// }

//take an array as input from the user. Search for a given number print the index at which it occurs.(LINEAR SEARCH)

// import java.util.*;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of array3:");
//         int size = sc.nextInt();
//         System.out.println("enter the numbere to search:");
//         int x = sc.nextInt();
//         int numbers[]  = new int[size];

//         for(int i=0;i<size;i++) {
//             numbers[i] = sc.nextInt();
//         }

//         // linear search
//         for(int i=0;i<size;i++) {
//             if(numbers[i]==x) {
//                 System.out.println(i);
//                 break;
//             }
//         }

//         sc.close();
//     }
// }

//take an array size as input and take user input names and print the array.

// import java.util.*;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         String name[] = new String[size];

//         for(int i=0;i<name.length;i++) {
//             name[i]=sc.nextLine();
//         }

//         for(int i=0;i<name.length;i++) {
//             System.out.println(name[i]);
//         }
//         sc.close();
//     }
// }

//find the minimum and maximum number present in the array

// import java.util.*;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int num[] = new int[size];

//         for(int i=0;i<num.length;i++) {
//             num[i]=sc.nextInt();
//         }

//         int max = Integer.MAX_VALUE;
//         int min = Integer.MIN_VALUE;

//         for(int i=0;i<num.length;i++) {
//             if(num[i]>max) {
//                 max = num[i];
//             }
//             if(num[i]<num[i]) {
//                 min = num[i];
//             }
//         }

//         sc.close();
//     }
// }

//Take an array of numbers as input and check if it is an array sorted in ascending order

// public class Array {
//     public static void main(String[] args) {
//         int num[]={1,2,4,7};

//         boolean isSorted = true;

//         for(int i=0;i<num.length;i++) {
//             if(num[i]>num[i+1]) {
//                 isSorted =false;
//             }
//         }

//         if(isSorted==true) {
//             System.out.println("array is sorted");
//         } else {
//             System.out.println("array is not sorted");
//         }
//     }
// }

