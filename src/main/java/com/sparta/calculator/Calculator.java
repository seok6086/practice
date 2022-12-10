package com.sparta.calculator;

public class Calculator {

    int plus (int x, int y){
        int result = x + y ;
        return result;
    }
    int multiply (int x, int y){
        int result = x*y;
        return result;
    }
    int subtract (int x, int y){
        int result = x-y;
        return result;
    }
    double divide ( int x , int y){
        double result = (double)x/(double)y;
        return result;

    }
}
