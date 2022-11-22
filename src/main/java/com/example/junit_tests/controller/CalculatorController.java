package com.example.junit_tests.controller;

import com.example.junit_tests.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String greetingCalc() {
        return "Добро пожаловать в калькулятор";
    }
}
