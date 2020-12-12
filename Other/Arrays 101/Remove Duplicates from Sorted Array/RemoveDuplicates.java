import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
        // Sorted array nums, renove dupes in-place
        int[] nums = {1,1,2};   // return {1,2,x} length = 2
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int length = nums1.length;

        System.out.print("Length: " + length + "\t");
        printArray(nums1);

        length = RemoveDuplicatesSorted(nums1);

        System.out.print("Length: " + length + "\t");
        printArray(nums1);
    }

    // SLOW SOLUTION
    public static int RemoveDuplicatesSorted (int[] nums) {

        // BAD (O(N^2))
        if (nums.length == 0) return 0;

        int current = nums[0];
        int length = nums.length;

        for (int i = 1; i < length; i++) {

            if (nums[i] == current) {
                // then remove and shift left
                for (int k = i+1; k < length; k++) {
                    nums[k-1] = nums[k];
                }
                i--;
                length--;
            }
            current = nums[i]; 
        }
        return length;
    }

    // FASTER SOLUTION, SKIP IF DUP ELSE INPUT IT
    public static int RemoveDuplicatesSortedV2 (int[] nums) {

        if (nums.length == 0) return 0;

        int current = nums[0];
        int k = 1;      // slow runner, only updates if diff val

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != current) {
                current = nums[i];
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}



// TWO POINTER TECHNIQUE I USED IS VERY POPULAR IN DOING IN-PLACE Array ALGORITHMS