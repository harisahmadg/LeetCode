

public class mySolution {


    public static int numberOfSteps (int num) {
        
        int result = 0;
        
        while (num > 0) {

            if (num % 2 == 0) {
                num /= 2;
                result++;
            }
            else {
                num--;
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

}