package org.nameOfTheDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nameOfTheDayTest {

    @Test
    void shouldPrintDayName() {
        // Given
        int dayNumber = 3;
        String expected = "Wednesday";
        // When
        String actual = nameOfTheDay.dayName(dayNumber);
        // Then
        assertEquals(expected, actual);
    }
}
