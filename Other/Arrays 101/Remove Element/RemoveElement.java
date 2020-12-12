import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int length = nums.length;

        System.out.print("Length: " + length + "\t");
        printArray(nums);

        length = removeElement(nums, val);

        System.out.print("Length: " + length + "\t");
        printArray(nums);
    }

    public static int removeElement(int[] nums, int val) {

        int length = nums.length;
        int i = 0;

        while (i < length) {

            if (nums[i] == val) {
                // delete and shift left, and decrease total length
                /*for (int k = i+1; k < length; k++) {
                    nums[k-1] = nums[k];
                } */
                nums[i] = nums[length-1];   // smarter solution which doesnt involve loop inside a loop, but messes up the order ( buts its fine)
                length--;
            }
            else {
                i++;
            }
        }

        return length;
    }


    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}