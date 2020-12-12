import java.util.Arrays;

public class MoveZeroes {


    public static void main(String[] args) {
        
        int[] a1 = {0,1,0,3,12};
        printArray(a1);
        moveZeros(a1);
        printArray(a1);
    }

    public static void moveZeros(int[] nums) {

        // 2 pointer method
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        for (int j = k; j < nums.length; j++) {
            nums[j] = 0;
        }
    }


    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}