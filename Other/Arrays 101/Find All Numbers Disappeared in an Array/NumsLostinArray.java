import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumsLostinArray {

    public static void main(String[] args) {
        
        int[] a = new int[] {4,3,2,7,8,2,3,1};
        printArray(a);
        System.out.println(findDisappearedNumbersV2(a).toString());
    }

    // 44ms, gonna try faster solution which is O(N) AND O(1) memory
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> fullList = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();
        
        // [1,N] LIST
        for (int i = 1; i <= nums.length; i++) {
            fullList.add(i);
        }
        // nums to set
        for (int tmp : nums) {
            set.add(tmp);
        }
        fullList.removeAll(set);
        return fullList;
    }

    public static List<Integer> findDisappearedNumbersV2(int[] nums) {

        List<Integer> myList = new ArrayList<>();
        

        return myList;
    }

    static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}


/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

- with extra space, we can put all the elements into a set, and the full [1,n] into another list, the set will remove duplicates and when we sub the list to the set we get the missing

*/