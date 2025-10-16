//Q Tower of Hanoi

//public class Recursionpart2 {
  //public static void towerOfHanoi(int n,String src, String helper, String dest) {
      //if(n==1) {
        //System.out.println("Transfer disc "+ n + " from " + src + " to " + dest);
        //return;
      //}
      //towerOfHanoi(n-1, src, dest, helper);
      //System.out.println("Transfer disc " + n + " from "+ src + " to " + dest);
      //towerOfHanoi(n-1, helper, src, dest);
  //}
  //public static void main(String[] args) {
    //int n=5 ;
    //towerOfHanoi(n,"S", "H" , "D");
  //}
//}

//Q Print a String in reverse order?

//public class Recursionpart2 {
  //public static void printRev(String str, int idx) {
    //if(idx==0) {
      //System.out.println(str.charAt(idx));
      //return;
    //}
    //System.out.print(str.charAt(idx));
    //printRev(str, idx-1);
  //}
  //public static void main(String[] args) {
    //String str="abcd";
    //printRev(str, 3); 
  //}
//}

//Q Find the First and Last occurence of an element in a String

//.public class Recursionpart2 {
  //public static int First=-1;
  //public static int Last=-1;
  
  //public static void findOccurence(String str, int idx, char element) {
    //if(idx==str.length()) {
      //System.out.println(First);
      //System.out.println(Last);
      //return;
    //}
    //char currchar = str.charAt(idx);
    //if(currchar==element) {
      //if(First==-1) {
        //First=idx;
      //} else {
        //Last=idx;
     // }
    //}

    //findOccurence(str, idx+1, element);
  //}

  //public static void main(String[] args) {
    //String str = "abaacdaefaah";
    //findOccurence(str, 0, 'a');
  //}
//}  

//Q Check if an array is sorted (Strictly increasing)

//public class Recursionpart2 {
  //public static boolean isSorted(int arr[], int idx) {
    //if(idx==arr.length-1) {
      //return true;
    //}
    //if(arr [idx]<arr [idx+1]) {
      //return isSorted(arr, idx+1);
    //} else {
      //return false;
    //}
  //}

  //public static void main(String[] args) {
    //int arr[] ={1,3,5,6,9,10};
     //System.out.println(isSorted(arr, 0));
  //}
//}

//Q Move all the 'x' to the end of the String

//public class Recursionpart2 {
  //public static void moveAllx(String str, int idx, int count, String newstr) {
    //if(idx==str.length()) {
      //for(int i=1; i<=count; i++) {
        //newstr+='x';
      //}
      //System.out.println(newstr);
      //return;
    //}
   //char currchar =str.charAt(idx);
   //if(currchar=='x') {
    //count++;
    //moveAllx(str, idx+1, count, newstr);
   //} else {
    //newstr+=currchar;
  //moveAllx(str, idx+1, count, newstr);
   //}
  //}
  //public static void main(String[] args) {
    //String str = "axbcxxd";
    //moveAllx(str, 0, 0, "");
  //}
//}

//Q Remove duplicates in a strings

//public class Recursionpart2 {
  //public static boolean[] map= new boolean[26];
  //public static void removedup(String str, int idx, String newstr) {
    //if(idx==str.length()) {
      //System.out.println(newstr);
      //return;
    //}
    //char currchar = str.charAt(idx);
    //if(map[currchar -'a']) {
      //removedup(str, idx+1, newstr);
    //} else {
      //newstr+=currchar;
      //map[currchar-'a']=true;
      //removedup(str, idx+1, newstr);
    //}
  //}
  //public static void main(String[] args) {
    //String str= "abbccda";
    //removedup(str, 0, "");
  //}
//}

//Q Print the subsequence of a String 'VERY IMPORTANT'

//public class Recursionpart2 {
  //public static void subsequences(String str, int idx, String newstr) {

    //if(idx==str.length()) {
      //System.out.println(newstr);
      //return;
    //}
    //char currchar=str.charAt(idx);
    //subsequences(str, idx+1, newstr+currchar);
    //subsequences(str, idx+1, newstr); 
  //}

  //public static void main(String[] args) {
    //String str="abc";
    //subsequences(str, 0, "");
  //}
//}

//Q Print all the subsequences

//import java.util.HashSet;

//public class Recursionpart2 {
  //public static void printSubseq(String str, int idx, String res, HashSet<String>allSubseq) {
    //if(idx == str.length()) {
      //if(allSubseq.contains(res)) {
      //return;
      //}
      //allSubseq.add(res);
      //System.out.println(res);
      //return;
    //}    
    //choose
    //printSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
    //don't choose
    //printSubseq(str, idx+1, res, allSubseq);
  //}

  //public static void main(String args[]) {
    //String str2 = "aaa";
    //HashSet<String> allSubseq = new HashSet<>();
    //printSubseq(str2, 0, "", allSubseq);
  //}
//}

//Q Print keypad combination

//0->.
//1-> abc
//2-> def
//3-> ghi
//4-> jkl
//5-> mno
//6-> pqrs
//7-> tu
//8-> vwx
//9-> yz

//public class Recursionpart2 {
  //public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"}; 
  //public static void printKeypadCombination(String number, int idx, String res) {
    //if(idx == number.length()) {
    //System.out.println(res);
    //return;
   //}
    //for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
    //char curr = keypad[number.charAt(idx)-'0'].charAt(i);
    //printKeypadCombination(number, idx+1, res+curr);
    //}
  //}
  //public static void main(String args[]) {
  //String number = "23";
  //printKeypadCombination(number, 0, "");
  //}
//}