import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DailyTemp {

    public static int[] dailyTemperatures(int[] T) {

        int[] days = new int[T.length];

        int i = 1;

        while (i < T.length) {

            int current = T[i-1];
            int counter = 1;

            for (int k = i; k < T.length; k++) {

                if (current >= T[k]) {
                    if (k == T.length-1) {
                        i++;
                        break;
                    }
                    counter++;
                }
                else {
                    days[i-1] = counter;
                    i++;
                    break;
                }
            }



        }

        return days;
    }

    public static void main(String[] args) {

        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        
        List<Integer> list = new ArrayList<Integer>();
        for (int e : T) {
            list.add(e);
        }

        System.out.println(Arrays.toString(dailyTemperatures(T)));
    }
}