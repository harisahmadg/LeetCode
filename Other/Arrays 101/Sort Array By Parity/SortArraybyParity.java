import java.util.Arrays;

public class SortArraybyParity {

    public static void main(String[] args) {
        
        int[] a1 = {8,8,3,1,2,4};
        printArray(a1);
        sortByParity(a1);
        printArray(a1);

    }



    public static int[] sortByParity(int[] A) {

        // first even then odd

        int k = A.length-1;;

        for (int i = 0; i < k; i++) {

            if (A[i] % 2 != 0) {
                int temp = A[k];
                A[k--] = A[i];
                A[i--] = temp;
            }
        }
        return A;
    }

    static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}

// [2,3,4,5],   [3,1,2,4]