package com.company.model;

public class NormalOperations extends Operations {

    public NormalOperations(double num1, double num2, int operator){
        super(num1, num2, operator);
    }

    public double add(){
        result = num1 + num2;
        return result;
    }

    public double sub() {
        result = num1 - num2;
        return result;
    }

    public double mul() {
        result = num1 * num2;
        return result;
    }

    public double div() {
        result = num1 / num2;
        return result;
    }
}
