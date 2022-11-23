package com.example.junit_tests.controller;

import com.example.junit_tests.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/calculator/plus")
    public String additionNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " + " + num2 + " = " + calculatorService.additionNumbers(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String subtractionNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " - " + num2 + " = " + calculatorService.subtractionNumbers(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " * " + num2 + " = " + calculatorService.multiplyNumbers(num1, num2);
    }

    @GetMapping("/calculator/divide")
    public String divideNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " / " + num2 + " = " + calculatorService.divideNumbers(num1, num2);
    }
}
