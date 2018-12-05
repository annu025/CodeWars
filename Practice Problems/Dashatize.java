/*
Sourcec: CodeWars

Problem Statement: Given a number, return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark.

Ex:

dashatize(274) -> '2-7-4'
dashatize(6815) -> '68-1-5'
 */

public class Solution {

        public static String dashatize(int num) {

            String tmp = String.valueOf(Math.abs(num));
            StringBuilder sb = new StringBuilder();

            for (char c : tmp.toCharArray()) {
                if (c != '-') {
                    if (Integer.parseInt(c + "") % 2 == 0) {
                        sb.append(c);
                    } else {
                        sb.append("-" + c + "-");
                    }
                }
            }

            if (sb.charAt(0) == '-') {
                sb.replace(0, 1, "");
            }

            if (sb.charAt(sb.length() - 1) == '-') {
                sb.setLength(sb.length() - 1);
            }

            return sb.toString().replaceAll("--", "-");
        }
}

//    public static String dashatize(int num) {
//        String result = "";
//        while(num > 0){
//            int number = num;
//
//            int digit = number % 10;
//
//
//            if(digit % 2 == 0){
//                result = result + "digit";
//            }
//
//            else {
//                result = '-' + result;
//            }
//
//            number = number / 10;
//
//        }
//        return result;
//
//    }


/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void testBasic() {
        assertEquals("2-7-4", Solution.dashatize(274));
        assertEquals("5-3-1-1", Solution.dashatize(5311));
        assertEquals("86-3-20", Solution.dashatize(86320));
        assertEquals("9-7-4-3-02", Solution.dashatize(974302));
    }

    @Test
    public void testWeird() {
        assertEquals("0", Solution.dashatize(0));
        assertEquals("1", Solution.dashatize(-1));
        assertEquals("28-3-6-9", Solution.dashatize(-28369));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", Solution.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", Solution.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", Solution.dashatize(-1111111111));
    }

}
 */