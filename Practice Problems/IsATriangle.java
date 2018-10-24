/*
Implement a method that accepts 3 integer values a, b, c.
The method should return true if a triangle can be built with the sides of given length and false in any other case.

(In this case, all triangles must have surface greater than 0 to be accepted).
 */
public class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        // Sum of two sides of the triangle must always be greater than the third side
        // Do this to all combinations
        // a + b > c
        // a + c > b
        // b + c > a
        if((a + b > c) && (a + c > b) && (b + c > a)){
            return true;
        }
        else {
            return false;
        }
    }
}
/*
import static org.junit.Assert.*;
import org.junit.Test;


public class TriangleTesterTest {
    @Test
    public void publicTests() {
        assertEquals(TriangleTester.isTriangle(1,2,2), true);
        assertEquals(TriangleTester.isTriangle(7,2,2), false);
    }
}
 */