import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathServiceTest {

    @Test
    public void leap_year_should_be_divisible_by_four() {
        assertTrue(MathService.isLeapYear(2016));
    }

    @Test
    public void non_leap_year_should_not_be_divisible_by_four() {
        assertFalse(MathService.isLeapYear(3));
    }

    @Test
    public void non_leap_year_should_not_be_divisible_by_one_hundred() {
        assertFalse(MathService.isLeapYear(1000));
    }

    @Test
    public void leap_year_should_be_divisible_by_four_hundred() {
        assertTrue(MathService.isLeapYear(1200));
    }


}
