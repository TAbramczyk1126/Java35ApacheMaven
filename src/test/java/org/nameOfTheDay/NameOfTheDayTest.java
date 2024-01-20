package org.nameOfTheDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameOfTheDayTest {

    @Test
    void shouldPrintDayName() {
        // Given
        int dayNumber = 3;
        String expected = "Wednesday";
        // When
        String actual = NameOfTheDay.dayName(dayNumber);
        // Then
        assertEquals(expected, actual);
    }
}
