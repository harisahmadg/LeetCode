
public class SortingApproach {


    // O(nlog(n)) solution using sorting
    public static void PairSum(int[] a, int sum) {

        /*  Sort array in ascending order
        */
        insertionSort(a);
        bubbleSort(a);
    }


    public static void bubbleSort(int[] a) {        // O(n^2) complexity

        boolean sorted = false;

        while (!sorted) {

            sorted = true;

            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            int current = a[i];
            int j = i-1;        // always 1 less than i

            while (j >= 0 && current < a[j]) {
                int temp = a[j];
                a[j] = current;
                a[j+1] = temp;
                j--;
            }
        }

    }

    public static void main(String[] args) {
       
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        PairSum(arr, sum);
    }
}