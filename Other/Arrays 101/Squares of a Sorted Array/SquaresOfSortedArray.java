import java.util.Arrays;

public class SquaresOfSortedArray {


    public static void main(String[] args) {
        
        int[] a1 = {-4,-1,0,3,10};
        int[] a2 = {-7,-3,2,3,11};
        printArray(a1);
        sortedSquares(a1);
        printArray(a1);

    }

    public static int[] sortedSquares(int[] A) {
        
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);

        return A;
    }

    static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}