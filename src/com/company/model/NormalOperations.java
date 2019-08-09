package com.company.model;

public class NormalOperations implements IOperations {
    double num1 = 0;
    double num2 = 0;
    int operator = 0;
    double result= 0;

    public NormalOperations(double num1, double num2, int operator){
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
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

    public boolean checkPrime() {
        return false;
    }

    public boolean isDivisor() {
        return false;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public int getOperator() {
        return operator;
    }
}
