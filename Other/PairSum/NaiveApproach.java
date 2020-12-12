
public class NaiveApproach {


    public static void PairSum(int[] array, int sum) {


        for (int i = 0; i < array.length; i++) {
            
            for (int k = 0; k < array.length; k++) {
                if (i != k && ((array[i] + array[k]) == sum)) {
                    System.out.println("Pair found at index " + i + " and " + k + " (" + array[i] + " + " + array[k] + ")");
                    return;
                }
            }
        }

        System.out.println("Pair not found.");
    }



    public static void main(String[] args) {
       
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        PairSum(arr, sum);
    }
}