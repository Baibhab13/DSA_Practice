// public class sorting {
//     public static void printArray(int a[]) {
//         for(int i=0;i<a.length;i++) {
//             System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={7,8,1,3,2};

//         //BUBBLE SORT
//         for(int i=0;i<arr.length;i++) {
//             for(int j=0;j<arr.length-1-i;j++) {
//                 if(arr[j]>arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }

//         //time complexity 
//         // outer loop n-1 times
//         // inner time 1st time n-1 times
//         //            2nd time n-2 times...upto 1
//         // the time complexity is O(n^2)

//         printArray(arr);

//         //SELECTION SORT
//         for(int i=0;i<arr.length;i++) {
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++) {
//                 if(arr[smallest]>arr[j]) {
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i]=temp;
//         }
//         printArray(arr);

//         //time complexity O(n^2)
//     //     outer loop runs n times
//     //     inner times runs n-1 times 

//     //INSERTION SORT
//     for(int i=1;i<arr.length;i++) {
//         int curr = arr[i];
//         int j=i-1;
//         while(j>=0 && curr < arr[j]) {
//             arr[j+1] = arr[j];
//             j--;
//         }

//         arr[j+1]=curr;
//     }
//     printArray(arr);

//     }
// }

// MERGE SORT

// public class sorting {
//     public static void conquer(int arr[] ,int si,int mid,int ei) {
//         int merger[]=new int[ei-si+1];

//         int idx1=si;
//         int idx2 = mid+1;
//         int x = 0;

//         //O(n)
//         while(idx1<=mid && idx2 <=ei) {
//             if(arr[idx1]<=arr[idx2]) {
//                 merger[x++]= arr[idx1++];
//             } else {
//                 merger[x++]=arr[idx2++];
//             }
//         }

//         while (idx1==mid) {
//             merger[x++]=arr[idx1++];
//         }

//         while (idx2==ei) {
//             merger[x++]=arr[idx2++];
//         }

//         //copying the element
//         for(int i=0,j=si;i<merger.length;i++,j++) {
//             arr[j]=merger[i];
//         }
//     }

//     public static void divide(int arr[],int si,int ei) {
//         if(si>=ei) {
//             return;
//         }

//         int mid=si+(ei-si)/2;
//         //O(logn)
//         divide(arr, si, mid);
//         divide(arr, mid+1, ei);
//         conquer(arr,si,mid,ei);
//     }
//     public static void main(String[] args) {
//         int arr[]= {6,3,5,4,2,1};
//         int l= arr.length;
//         divide(arr, 0, l-1);
//         for(int i=0;i<l;i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

//  QUICK SORT

public class sorting {
    public static int partition(int arr[],int low,int high) {
        int pivot = arr[high];
        int i=low-1;

        for(int j=low;j<high;j++) {
            if(arr[j]<pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            } 
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }

    public static void quicksort(int arr[],int low,int high) {
        
        if(low<high) {
            int pivot= partition(arr,low,high);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n=arr.length;

        quicksort(arr, 0, n-1);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*time complexity worst case=O(n^2)
 *  average case = O(logn)
 * best case = O(logn)
 */