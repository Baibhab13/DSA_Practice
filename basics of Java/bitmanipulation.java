// public class bitmanipulation {
//     public static void main(String[] args) {
//         // GET OPERATION
//         int n = 5;
//         int pos = 3;
//         // Creating the mask:
//         int bitmask = 1 << pos;
//         // AND operation on bitmask and the number
//         // If the result is zero: the bit is zero.
//         // If the result is one : the bit is one.
//         if ((bitmask & n) == 0) {
//             System.out.println("Bit was zero");
//         } else {
//             System.out.println("Bit was one");
//         }
//     }
// }

// public class bitmanipulation {
//     public static void main(String[] args) {
//         // SET OPERATION
//         int n = 5;
//         int pos = 3;
//         // Creating the bitmask
//         int bitmask = 1 << pos;
//         // To get the new number: OR operation performed between bitmask and the number
//         int newnumber = bitmask | n;
//         System.out.println(newnumber);
//     }
// }

// public class bitmanipulation {
//     public static void main(String[] args) {
//         // CLEAR OPERATION
//         int n = 5;
//         int pos = 0;
//         // Creating the bitmask
//         int bitmask = 1 << pos;
//         int not = ~(bitmask);
//         // AND operation on the not bitmask
//         int newnumber = not & n;
//         System.out.println(newnumber);
//     }
// }

// public class bitmanipulation {
//     public static void main(String[] args) {
//         // UPDATE OPERATION
//         int n = 5;
//         int pos = 3;
//         int oper = 0; // update bit to 1 else update bit to 0
//         int bitmask = 1 << pos;
//         if (oper == 1) {
//             // set operation
//             int newnumber = bitmask | n;
//             System.out.println(newnumber);
//         } else {
//             int newbitmask = ~(bitmask);
//             int newnumber = newbitmask & n;
//             System.out.println(newnumber);
//         }

//         // TO UPDATE THE BIT TO ZERO
//         // 1. CLEAR OPERATION
//         // i. bitmask=1<<i
//         // ii. AND operation on the notbitmask and the number

//         // TO UPDATE THE BIT ONE
//         // 2. SET OPERATION
//         // i. bitmask = 1<<i
//         // ii. OR operation on the bitmask and the number
//     }
// }