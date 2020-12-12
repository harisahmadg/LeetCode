
public class CheckIfExist {
    
    public static void main(String[] args) {
        
        int[] arr = {10,2,5,3};
        int[] arr1 = {-2,0,10,-19,4,6,-8};
        System.out.println(checkExistence(arr1));
    }

    public static boolean checkExistence(int[] arr) {

        // N = 2 * M

        for (int i = 0; i < arr.length; i++) {

            for (int k = i+1; k < arr.length; k++) {

                int M = arr[k];
                if (arr[i] == 2*M || ((arr[i] * 2) == M)) {
                    return true;
                }
            }
        }


        return false;
    }
}