/*
Given an array (arr) as an argument complete the function countSmileys that should return the total
number of smiling faces.

Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
:) :D ;-D :~)
Invalid smiley faces:
;( :> :} :]

Example cases:

countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

Note: In case of an empty array return 0. You will not be tested with invalid input
(input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same
 */
package Strings;

import java.util.*;
import java.lang.String;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        int count = 0;

        String[] stringArray = arr.toArray(new String[0]);

        for(String eachElement : arr){
            String zero = eachElement.substring(0,1);
            String first = eachElement.substring(1,2);
            String second = eachElement.substring(2);

            if(eachElement.length() == 2){
                if((zero.contains(":") || (zero.contains(";"))) &&
                        (first.contains(")") || first.contains("D"))){
                    count++;
                }
            }
            else if (eachElement.length() == 3){
                if((zero.contains(":") || (zero.contains(";"))) &&
                        (first.contains("-") || first.contains("~")) &&
                        (second.contains(")") || second.contains("D")))
                {
                    count++;
                }
            }
//            System.out.println(zero);
//            System.out.println(first);
//            System.out.println(second);

        }
        return count;
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;

public class SmileFacesTest {

    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, SmileFaces.countSmileys(a));
    }
}
 */