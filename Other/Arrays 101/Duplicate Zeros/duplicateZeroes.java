import java.util.Arrays;

public class duplicateZeroes {

    public static void main(String[] args) {
        
        int[] arr = {1,0,2,3,0,4,5,0};
        printArr(arr);
        dupZeroes(arr);
        printArr(arr);
    }


    static void dupZeroes(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == 0) {
                insert(arr, i+1);
                i++;
            }
        }

    }

    static void insert(int[] arr, int i) {
        for (int k = arr.length-2; k >= i; k--) {
            arr[k+1] = arr[k];
        }
        arr[i] = 0;
    }


    static void printArr(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
}

/*
 - what i had diff with was once i get to the case where i see a 0, i needed to record the next element send it to a function
 which shifts all elements to the right all the way up to the case where we found a 0 + 1, next we just put a 0 in the empty spot and keep going




*/