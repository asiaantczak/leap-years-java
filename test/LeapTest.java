import org.junit.Test;

import static org.junit.Assert.*;

public class LeapTest {

    @Test
    public void trueForYearsDivisibleBy400() {
        Leap leapYears = new Leap();
        assertEquals(true, leapYears.isLeap(400));
    }

    @Test
    public void falseForYearsDivisibleBy100ButNot400() {
        Leap leapYears = new Leap();
        assertEquals(false, leapYears.isLeap(1700));
    }
    
}