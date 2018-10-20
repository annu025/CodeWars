/*
Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.

For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"

your_order("is2 Thi1s T4est 3a")
[1] "Thi1s is2 3a T4est"
 */
import java.util.*;

public class Order {
    public static String order(String words) {
        if(words.length() == 0){
            return "";
        }

        // Character list of numbers that can be used to identify in each word : words
        List<Character> numbers = new ArrayList<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));

        // String array of words
        String wordsArray [] = words.split(" ");

        String resultantArray [] = new String[wordsArray.length];

        for(int i = 0; i < wordsArray.length; i++){
            for(int j = 0; j < wordsArray[i].length(); j++){
                if (numbers.contains(wordsArray[i].charAt(j))) {
                    resultantArray[numbers.indexOf(wordsArray[i].charAt(j))] = wordsArray[i];
                }
            }
        }

        // Append the words after placing them at the correct index
        StringBuilder sb = new StringBuilder();
        for (String s: resultantArray) {
            sb.append(s + ' ');
        }

        // result stringbuilder
        return sb.toString().trim();
    }
}
/*
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class OrderTest {
  @Test
  public void test1() {
    assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
  }

  @Test
  public void test2() {
    assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
  }

  @Test
  public void test3() {
    assertThat("Empty input should return empty string", Order.order(""), equalTo(""));
	}
}
 */