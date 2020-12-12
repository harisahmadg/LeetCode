import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
        
        int a[] = {1,1,4,2,1,3};
        System.out.println(checkHeight(a));
    }

    public static int checkHeight(int[] heights) {

        // idea: make a seperate sorted array, then compare the differences of each index and keep a counter

        int counter = 0;
        int[] sorted = new int[heights.length];

        // clean copy, no same refernce, utilizes new space in memeory
        for (int j = 0; j < heights.length; j++) {
            sorted[j] = heights[j];
        }
        Arrays.sort(sorted);
        
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) counter++;
        }
        return counter;
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}

/*
Students are asked to stand in non-decreasing order of heights for an annual photo.
Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.
Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
Current array : [1,1,4,2,1,3]
Target array  : [1,1,1,2,3,4]
On index 2 (0-based) we have 4 vs 1 so we have to move this student.
On index 4 (0-based) we have 1 vs 3 so we have to move this student.
On index 5 (0-based) we have 3 vs 4 so we have to move this student.

*/