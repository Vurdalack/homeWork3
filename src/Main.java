import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        double[] numbers = {1.2, 3.4, 43.4, -1.2, 36.4, -2.7, 3.5, -93.4, -21.7, 54.6, 20.4, 65.4, -5.6, -43.5, 15.0};
        double sum = 0.0;

        boolean negativeFound = false;




        for (double number : numbers) {
            if (number > 0) {
                negativeFound = true;
            }
            if (negativeFound) {
                sum = sum + number;
            }
            System.out.println(sum);
        }
        System.out.println("All COrretto");
        }




    }

