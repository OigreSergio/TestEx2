import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void Test_Year() {
        OffsetDateTime yearTest = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(2023, Main.yearMethodh(yearTest));
    }

    @Test
    public void Test_Month() {
        OffsetDateTime monthTest = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(Month.MARCH, Main.monthMethodh(monthTest));
    }

    @Test
    public void Test_Day_Of_Month() {
        OffsetDateTime dayOfMonthTest = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(1, Main.dayOfMonthMethodh(dayOfMonthTest));
    }

    @Test
    public void Test_Day_Of_Week() {
        OffsetDateTime dayOfWheekTest = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(DayOfWeek.WEDNESDAY, Main.dayOfWeek(dayOfWheekTest));
    }
}