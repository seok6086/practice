package com.sparta.calculator;

import java.util.Scanner;

public class Example {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int firsstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        Calculator calculator = new Calculator();

        int resultPlus = calculator.plus(firsstNum, secondNum);
        System.out.println("Plus :" + resultPlus);

        int resultSubtract = calculator.subtract(firsstNum, secondNum);
        System.out.println("Subtract :" + resultSubtract);

        int resultMultiply = calculator.multiply(firsstNum, secondNum);
        System.out.println("Multiply :" + resultMultiply);

        double resultDivide= calculator.divide(firsstNum, secondNum);
        System.out.println("Divide :" + resultDivide);

    }
}
