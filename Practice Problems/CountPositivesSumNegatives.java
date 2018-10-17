/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.

If the input array is empty or null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

 */
public class CountPositivesSumNegatives
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int result[] = new int[2];
        if(input == null || input.length == 0){
            return new int [] {};
        }

        int positiveCount = 0;
        int negativeSum = 0;

        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                positiveCount++;
            }
            if(input[i] < 0){
                negativeSum = Math.abs(input[i]) + negativeSum;
            }
        }
        negativeSum = -(negativeSum);
        result[0] = positiveCount;
        result[1] = negativeSum;
        return result;
    }
}
/*
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class KataTests {
    @Test
    public void countPositivesSumNegatives_BasicTest() {
      int[] expectedResult = new int[] {10, -65};
      assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
      int[] expectedResult = new int[] {8, -50};
      assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
}
 */