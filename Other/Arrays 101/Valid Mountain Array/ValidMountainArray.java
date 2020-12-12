
public class ValidMountainArray {


    public static void main(String[] args) {
        
        int[] A1 = {2,1};
        int[] A2 = {3,5,5};
        int[] A3 = {0,3,2,1};
        int[] A4 = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(validMountArray(A1));
        System.out.println(validMountArray(A2));
        System.out.println(validMountArray(A3));
        System.out.println(validMountArray(A4));


    }

    public static boolean validMountArray(int[] A) {

        /* Valid Mounted iff,
        1. A.length >= 3
        2. There exists some i with 0 < i < A.length -1 s.t:
            - A[0] < A[1] < ... A[i-1] < A[i]
            - A[i] > A[i+1] > ... > A[A.length - 1]
            EDGE CASES: MAKE SURE PEAK IS NOT FIRST OR LAST
        */

        if (A.length < 3) return false;
        if (A[0] >= A[1]) return false;
        boolean passed = false;

        for (int i = 1; i < A.length; i++) {

            if (A[i-1] >= A[i]) {
                passed = true;
            }

            if (passed == false && (A[i-1] >= A[i])) {
                return false;
            }
            else if (passed == true && (A[i-1] <= A[i])) {
                return false;
            }
        }

        if (!passed) return false;
        return true;

    }
}