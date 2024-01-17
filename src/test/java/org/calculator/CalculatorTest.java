package org.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldReturnSumResultOfTwoNumbers() {
        //Given
        int number1 = 6;
        int number2 = 3;
        int expectedResult = 9;
        //When
        int result = Calculator.add(number1, number2);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnSubstractResultOfTwoNumbers() {
        //Given
        int number1 = 6;
        int number2 = 3;
        int expectedResult = 3;
        //When
        int result = Calculator.substract(number1, number2);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnMultiplyResultOfTwoNumbers() {
        //Given
        int number1 = 2;
        int number2 = 3;
        int expectedResult = 6;
        //When
        int result = Calculator.multiply(number1, number2);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnDivideResultOfTwoNumbers() {
        //Given
        int number1 = 6;
        int number2 = 3;
        int expectedResult = 2;
        //When
        int result = Calculator.divide(number1, number2);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
