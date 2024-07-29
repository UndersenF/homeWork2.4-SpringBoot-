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

    @GetMapping()
    public String sayHello() {
        return calculatorService.sayHello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null) {
            return "Не передан первый параметр";
        }
        else if (num2 == null) {
            return "Не передан второй параметр";
        }
            return calculatorService.summation(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null) {
            return "Не передан первый параметр";
        }
        else if (num2 == null) {
            return "Не передан второй параметр";
        }
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null) {
            return "Не передан первый параметр";
        }
        else if (num2 == null) {
            return "Не передан второй параметр";
        }
        else if (num2 == 0) {
            return "На ноль делить нельзя!!!";
        }
        return calculatorService.division(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        if(num1 == null) {
            return "Не передан первый параметр";
        }
        else if (num2 == null) {
            return "Не передан второй параметр";
        }
        return calculatorService.multiplication(num1, num2);
    }
}
