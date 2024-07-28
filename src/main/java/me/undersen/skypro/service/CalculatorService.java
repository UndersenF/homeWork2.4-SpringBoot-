package me.undersen.skypro.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public String sayHello() {

        return "Добро пожаловать в калькулятор!";
    }

    public String summation (int num1, int num2 ) {
        String summary = String.valueOf(num1) + " + " + String.valueOf(num2) + " = " + (num1 + num2);
        return summary;
    }
    public String subtraction (int num1, int num2 ) {
        String difference = String.valueOf(num1) + " - " + String.valueOf(num2) + " = " + (num1 - num2);
        return difference;
    }
    public String division (int num1, int num2 ) {
        String divide = String.valueOf(num1) + " / " + String.valueOf(num2) + " = " + (num1 / num2);
        return divide;
    }
    public String multiplication (int num1, int num2 ) {
        String multiply = String.valueOf(num1) + " * " + String.valueOf(num2) + " = " + (num1 * num2);
        return multiply;
    }

}
