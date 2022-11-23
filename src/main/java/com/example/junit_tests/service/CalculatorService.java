package com.example.junit_tests.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int additionNumbers(int num1, int num2) {
        return (num1 + num2);
    }

    public int subtractionNumbers(int num1, int num2) {
        return (num1 - num2);
    }

    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public float divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }
}
