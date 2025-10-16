// BINARY SEARCH USING RECURSSION

// public class bs {
//     public static int binarySearch(int[] arr,int start,int end,int target) {
//         if(end>=start) {
//             int mid=start+(end-start)/2;
//             if(arr[mid]==target)
//                 return mid;
//             if(arr[mid]>target) {
//                 return binarySearch(arr, start, mid, target);
//             } else {
//                 return binarySearch(arr, mid+1, end, target);
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr={1,3,5,6};
//         int target=5;
//         int start=0;
//         int end=arr.length-1;
//         int idx=binarySearch(arr, start, end, target);
//         System.out.println(idx);
//     }
// }

// BINARY SEARCH USING ITERATION

// public class bs {
//     public static int binarySearch(int[] arr,int target) {
//         int start=0;
//         int end=arr.length-1;

//         while(start<=end) {
//             int mid=start+(end-start)/2;
//             if(arr[mid]==target)
//                 return mid;
//             if(arr[mid]>target) {
//                 end=mid-1;
//             } else {
//                 start=mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr={1,3,5,6};
//         int target=5;
//         int idx=binarySearch(arr, target);
//         System.out.println(idx);
//     }
// }

public class bs {
    public static String capitalize(String s, char target) {
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a') {
                s=s.toUpperCase();
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String s="baibhab";
        char target='a';
        String ans=capitalize(s,target);
        System.out.println(ans);
    }
}