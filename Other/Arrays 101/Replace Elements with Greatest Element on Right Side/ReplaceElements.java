import java.util.Arrays;

public class ReplaceElements {

    public static void main(String[] args) {
        
        int[] a1 = {17,18,5,4,6,1};
        int[] a2 = {1,2,3,4,5,6,7};
        //printArray(a1);
        printArray(a2);
        System.out.println();
        replaceEleV2(a2);
        printArray(a2);
    }

    // NAIVE METHOD (O(N^2))
    public static int[] replaceEle(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];

            for (int k = i; k < arr.length; k++) {
                if (arr[k] >= current) {
                    current = arr[k];
                }
            }
            arr[i-1] = current;
        }

        arr[arr.length-1] = -1;

        return arr;
    }

    // TRICKY METHOD, DO IT IN ONE TRAVERSAL O(N)
    public static int[] replaceEleV2(int[] arr) {

        // start from rightmost and fill it backwards

        int right_most = arr[arr.length-1];
        arr[arr.length-1] = -1;

        for (int i = arr.length-2; i >= 0; i--) {

            int tmp = arr[i];

            arr[i] = right_most;

            if (tmp > right_most) {
                right_most = tmp;
            }
        }

        return arr;
    }
    

    public static void printArray(int[] arr) {

        System.out.println(Arrays.toString(arr));
    }
}

/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
After doing so, return the array.

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]

*/
