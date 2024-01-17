package org.evenNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class evenNumberTest {

    @Test
    void shouldReturnTrueIfNumberIsEven() {
        //Given
        int number = 8;
        boolean expected = true;
        //When
        boolean result = evenNumber.isEvenNumber(number);
        //Then
        Assertions.assertEquals(expected, result);
    }
}