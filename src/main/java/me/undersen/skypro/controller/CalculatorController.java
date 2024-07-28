package me.undersen.skypro.controller;

import me.undersen.skypro.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return calculatorService.sayHello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1,
                       @RequestParam int num2) {
        return calculatorService.summation(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1,
                       @RequestParam int num2) {
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1,
                       @RequestParam int num2) {
        return calculatorService.division(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1,
                       @RequestParam int num2) {
        return calculatorService.multiplication(num1, num2);
    }
}
