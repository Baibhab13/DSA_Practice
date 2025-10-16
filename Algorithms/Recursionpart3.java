//Q Print all permutation oƒa string "abc"

//public class Recursionpart3 {
  //  public static void printPermutation(String str, String permutation) {
    //    if (str.length() == 0) {
      //      System.out.println(permutation);
        //    return;
        //}

        //for (int i = 0; i < str.length(); i++) {
          //  char currchar = str.charAt(i);
            //String newstr = str.substring(0, i) + str.substring(i + 1);
            //printPermutation(newstr, permutation + currchar);
        //}
   // }
    //public static void main(String[] args) {
      //  String str ="abc";
        //printPermutation(str, "");
    //}
//}

//Q Count the number in a maze to move from (0,0) to (n,m). let (n,m)=(3,3)

//public class Recursionpart3 {
  //  public static int countPath(int i, int j, int n, int m) {
    //    if(i==n || j==m) {
      //      return 0;
        //}
        //if(i==n-1 || j==m-1) {
          //  return 1;
        //}

        //move downwards
        //int downpaths = countPath(i+1,j,n,m);

        //move rightward
        //int rightpath = countPath(i, j+1, n, m);
        //return downpaths+rightpath;
    //}
    //public static void main(String[] args) {
      //  int n=3;
        //int m=3;
        //int totalpath = countPath(0,0,n,m);
        //System.out.println(totalpath);
    //}
//}

//Q Place the tile of 1*m in a floor of size of n*m and 
// count the number of ways we can put the tile.

//public class Recursionpart3 {
  //public static int placeTile(int n, int m) {
   
//    if(n==m) {
  //    return 2;
    //}
    //if(n<m) {
      //return 1;
    //}

    //vertically placed 
    //int verticallyplaced = placeTile(n-m, m);

    //horizontally placed
    //int horizontallyplaced = placeTile(n-1,m);

    //return verticallyplaced + horizontallyplaced;
  //}
  //public static void main (String[] args) {
    //int n=1;
    //int m=6;
    //System.out.println(placeTile(n, m));
  //}
//}

//Q Find the number ways in which you can incite n people to your party,
// single or in pairs

//public class Recursionpart3 {
  //public static int callGuest(int n) {
    //if(n<=1) {
      //return 1;
    //}

    //single way
    //int ways1 = callGuest(n-1);

    //pair
    //int ways2 = callGuest(n-2)*(n-1);

    //return ways1+ways2;
  //}
  //public static void main(String[] args) {
    //int n = 10;
    //System.out.println(callGuest(n));
  //}
//}

//Q Print all the subsets of set of first n natural number

//import java.util.*;

//public class Recursionpart3 {
  //public static void printSubsets(ArrayList<Integer>subset) {
    //for(int n=0; n<subset.size(); n++) {
      //System.out.print(subset.get(n)+" ");
    //}
    //System.out.println();
  //}
  //public static void findSubset(int n, ArrayList<Integer>subset) {
    //if(n==0) {
      //printSubsets(subset);
      //return;
    //}

    //yes
    //subset.add(n);
    //findSubset(n-1, subset);

    //no
    //subset.remove(subset.size()-1);
    //findSubset(n-1, subset);
  //}
  //public static void main(String[] args) {
    //int n=3;
    //findSubset(n, new ArrayList<Integer>());
  //}
//}