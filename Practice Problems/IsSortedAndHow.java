/* Complete the method which accepts an array of integers, and returns one of the following:

        "yes, ascending" - if the numbers in the array are sorted in an ascending order
        "yes, descending" - if the numbers in the array are sorted in a descending order
        "no" - otherwise
        You can assume the array will always be valid, and there will always be one correct answer.

*/
public static String isSortedAndHow(int[] array){
    // Variable to store result
    String result = "";

    // Set two pointers previous and next
    int previous = array[0];
    int next = array[1];

    // This is given in the problem
    if(previous == next){
        result = "no";
    }

    //
    for(i = 0; i < array.length; i++);{
        if (array[i] < array[i+1]) {
            result = "yes, ascending";
        }
        else {
            result = "no";
        }
    }

    for(i = 0; i < array.length; i++);{
        if (array[i] > array[i+1]) {
            result = "yes, descending";
        }
        else {
            result = "no";
        }
    }
}


/* import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        assertEquals("yes, ascending", Solution.isSortedAndHow(array));
    }

    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        assertEquals("yes, descending", Solution.isSortedAndHow(array));
    }

    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        assertEquals("no", Solution.isSortedAndHow(array));
    }
}
*/