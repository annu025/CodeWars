/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */

public class VowelsCount {

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here


        char charArray[] = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'){
                vowelsCount++;
            }

        }
        return vowelsCount;
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
      assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}
 */

