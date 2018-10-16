/*
The goal of this exercise is to convert a string to a new string where each character in the new string is '(' if that character appears only once in the original string, or ')' if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples:

"din" => "((("

"recede" => "()()()"

"Success" => ")())())"

"(( @" => "))(("
 */
import java.util.HashMap;
public class DuplicateEncoder {
    public static String encode(String word){

        word = word.toLowerCase();

        HashMap <Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0 ; i < word.length(); i++){
            char letter = word.charAt(i);
            if(!map.containsKey(letter)){
                map.put(letter, 1);
            }
            else {
                int count = map.get(letter);
                map.remove(letter);
                map.put(letter, count+1);
            }
        }
        String result = "";
        for (int i = 0; i < word.length(); i++){
            char letter1 = word.charAt(i);
            if(map.get(letter1) == 1){
                result = result + '(';
            }
            if(map.get(letter1) > 1) {
                result = result + ')';
            }
        }
        System.out.println("result "+ result);
        return result;
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class DuplicateEncoderTest {
    @Test
    public void test() {
      assertEquals(")()())()(()()(",
            DuplicateEncoder.encode("Prespecialized"));
      assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}
 */
