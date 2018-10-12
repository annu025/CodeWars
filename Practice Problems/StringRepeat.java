/*
Write a function called repeatStr which repeats the given string string exactly n times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        int repeatTimes = repeat;
        String finalString = "";
        if (repeatTimes <= 0){
            return "";
        }
        while(repeatTimes> 0){
            finalString = finalString + string;
            //System.out.print(string);
            repeatTimes--;
        }
        return finalString;
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test public void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Solution.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", Solution.repeatStr(0, "kata"));
    }
    @Test public void testNegativeRepeat() {
        assertEquals("", Solution.repeatStr(-10, "kata"));
    }
}
 */