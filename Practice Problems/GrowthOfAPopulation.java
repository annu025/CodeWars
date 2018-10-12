/*
In a small town the population is p0 = 1000 at the beginning of a year.
The population regularly increases by 2 percent per year and moreover 50 new inhabitants
per year come to live in the town. How many years does the town need to see its population
greater or equal to p = 1200 inhabitants?

At the end of the first year there will be:
1000 + 1000 * 0.02 + 50 => 1070 inhabitants

At the end of the 2nd year there will be:
1070 + 1070 * 0.02 + 50 => 1141 inhabitants (number of inhabitants is an integer)

At the end of the 3rd year there will be:
1141 + 1141 * 0.02 + 50 => 1213

It will need 3 entire years.

 */
public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int inhabitants = p0;
        while(inhabitants < p)
        {
            inhabitants = (int)(inhabitants + (inhabitants * (float)(percent/100)) + aug);
            years++;
        }
        return years;
    }
}
/*
import static org.junit.Assert.*;

import org.junit.Test;

public class ArgeTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(Arge.nbYear(1500, 5, 100, 5000),15);
        testing(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
 */