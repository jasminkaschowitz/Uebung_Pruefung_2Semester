package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        int[] numbers = {3,7,1,5,2,8};
        arrangeOrder(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void arrangeOrder(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int numberifix = numbers[i];

                if (numbers[i] > numbers[i + 1]) {
                    numbers[i] = numbers[1 + i]; //5, 5
                    numbers[i + 1] = numberifix;
                }

            }
        }
       }
    }
