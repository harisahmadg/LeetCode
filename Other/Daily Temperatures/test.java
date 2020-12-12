import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public static int[] dailyTemperatures(int[] T) {

        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = T.length-1; i>=0; i--){

            while(!stack.isEmpty() && T[i] >= T[stack.peek()]){
                stack.pop();
            }

            if (stack.isEmpty()){
                res[i] = 0;
            }
            else{
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
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