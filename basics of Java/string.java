// import java.util.*;

// public class string {
//     public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // String name = "Tony";
        // String fullname = "Tony Stark";
        // String sentence="My name is Tony Stark";
        // String name=sc.nextLine();//to take the whole line as input
        // System.out.println("Your name is: "+ name);

        //concatenation function
        
        // String firstname ="Tony";
        // String lastname ="Stark";
        
        // String fullname = firstname.concat(lastname);
        // System.out.println(fullname);

        //length function: provide the length of the function
        // int x=firstname.length();
        // System.out.println(x);

        //charAt: give the character in the string
        // for(int i=0;i<firstname.length();i++) {
        //     System.out.println(firstname.charAt(i));
        // }

        //compare function: compare two string
        //check three case
        // s1>s2 return a positive value
        // s1=s2 return a zero
        // s1<s2 return a negative value

        // String firstname ="Tony";
        // String lastname ="Tony";
        // if(firstname.compareTo(lastname)==0) {
        //     System.out.println("String are equal");
        // }else {
        //     System.out.println("String are not equal");
        // }

        //in some cases == fails to give the correct output
        // if(firstname==lastname) {
        //     System.out.println("String are equal");
        // }else {
        //     System.out.println("String are not equal");
        // }

        // if(new String("Tony") == new String("Tony")) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("String are not  equal");
        // }

        //substring: a part of the string
        // String sentence ="My name is tony";
        // String name = sentence.substring(11,15);
        // System.out.println(name);

        // string are immuatble to modify that we need to make the new string
//     }
// }


// 1 Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

// import java.util.*;

// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a= sc.nextLine();
//         String b = sc.nextLine();

//         String c = a.concat(b);
//         int l=c.length();
//         System.out.println(l);
//         sc.close();
//     }
// }


// 2 Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

// import java.util.*;

// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a= sc.nextLine();
//         String b=a.replace('e', ' ');
//         System.out.println(b);
//         sc.close();
//     }
// }


//3 Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”
import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email: ");
        String username="";
        String email= sc.nextLine();
        for(int i=0;i<email.length();i++) {
            if(email.charAt(i)=='@') {
                break;
            } else {
                username+=email.charAt(i);
            }
        }
        
        System.out.println(username);
        sc.close();
    }
}
