package com.example.junit_tests;

import com.example.junit_tests.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JUnitTestsApplicationTests {

    private int num1 = 5;
    private int num2 = 5;

    private int num3 = 8;
    private int num4 = 2;
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void checkSum() {
        int sum = calculatorService.additionNumbers(num1, num2);
        assertEquals(sum, num1 + num2);
        int sum1 = calculatorService.additionNumbers(num3, num4);
        assertEquals(sum1, num3 + num4);
    }

    @Test
    void checkSub() {
        int sub = calculatorService.subtractionNumbers(num1, num2);
        assertEquals(sub, num1 - num2);
        int sub1 = calculatorService.subtractionNumbers(num3, num4);
        assertEquals(sub1, num3 - num4);
    }

    @Test
    void checkMultiply() {
        int multiplyNumbers = calculatorService.multiplyNumbers(num1, num2);
        assertEquals(multiplyNumbers, num1 * num2);
        int multiplyNumbers1 = calculatorService.multiplyNumbers(num3, num4);
        assertEquals(multiplyNumbers1, num3 * num4);
    }

    @Test
    void checkDivide() {
        float divideNumbers = calculatorService.divideNumbers(num1, num2);
        assertEquals(divideNumbers, num1 / num2);
        float divideNumbers1 = calculatorService.divideNumbers(num3, num4);
        assertEquals(divideNumbers1, num3 / num4);
    }

    @ParameterizedTest
    @MethodSource("dataForTest")
    void checkDivideParamTest(int num1, int num2) {
        float divideNumbers = calculatorService.divideNumbers(num1, num2);
        assertEquals(divideNumbers, num1 / num2);
    }

    public static Stream<Arguments> dataForTest() {
        return Stream.of(Arguments.of(10, 8),
                Arguments.of(5, 5),
                Arguments.of(6, 2),
                Arguments.of(9, 3)
        );
    }
}
