package org.age;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {

    @Test
    void shouldReturnTrueIfAgeIsBiggerOrEqualEighteen() {
        //Given
        int age = 98;
        boolean expectedResult = true;
        //When
        boolean result = Age.isAdult(age);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
