import org.junit.Test;

import static org.junit.Assert.*;

public class LeapTest {

    @Test
    public void trueForYearsDivisibleBy400() {
        Leap leapYears = new Leap();
        assertEquals(true, leapYears.isLeap(2000));
    }

    @Test
    public void falseForYearsDivisibleBy100ButNot400() {
        Leap leapYears = new Leap();
        assertEquals(false, leapYears.isLeap(1700));
    }

    @Test
    public void trueForYearsDivisibleBy4ButNot100() {
        Leap leapYears = new Leap();
        assertEquals(true, leapYears.isLeap(2008));
    }

    @Test
    public void falseForYearsNotDivisibleBy4() {
        Leap leapYears = new Leap();
        assertEquals(false, leapYears.isLeap(2018));
    }
}