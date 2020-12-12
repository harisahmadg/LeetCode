import java.util.Arrays;

public class ThirdMaxNumber {


    public static void main(String[] args) {
        
        int[] a1 = {1,1,2};
        printArray(a1);
        System.out.println(thirdMax(a1));
    }

    public static int thirdMax(int[] nums) {

      int largest = nums[0];
      int second = Integer.MIN_VALUE;
      int third = Integer.MIN_VALUE;

      int counter = 1;

      for (int i = 1; i < nums.length; i++) {

        if (nums[i] > largest) {
            third = second;
            second = largest;
            largest = nums[i];
            counter++;
        }
        else if (nums[i] > second) {
            third = second;
            second = nums[i];
            counter++;
        }
        else if (nums[i] > third) {
            third = nums[i];
            counter++;
        }
      }

      if (nums.length <= 2) {
          return largest;
      } 
      else if (counter == 2) {
        return second;
      }
      else if (counter == 1) {
          return largest;
      }

      return third;
    }


    static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}

//5,2,1,3