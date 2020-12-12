import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        
        int nums1[] = {2,5,6,0,0,0};
        int nums2[] = {1,2,3};

        printArray(nums1);
        merge(nums1, 3, nums2, 3);
        printArray(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int count = m + n - 1;
        --m;
        --n;

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                // that means the bigger in nums1, put it at the end
                nums1[count] = nums1[m];
                count--; m--;
            }
            else {
                nums1[count] = nums2[n];
                count--; n--;
            }
        }

        // case where m passes 0

        while (n >= 0) {
            nums1[count] = nums2[n];
            count--; n--;
        }
    }


    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

/*
m = size of nums1
n = size of nums2

nums1 = m + n




*/