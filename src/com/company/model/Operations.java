package com.company.model;

// using abstract class
public abstract class Operations {
    protected double num1;
    protected double num2;
    protected int operator;
    protected double result;

    public Operations(){}
    public Operations(double num1, int operator){
        this.num1 = num1;
        this.operator = operator;;
    }
    public Operations(double num1, double num2, int operator){
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    abstract public double add();
    abstract public double sub();
    abstract public double mul();
    abstract public double div();

    abstract public boolean checkPrime();
    abstract public boolean isDivisor();

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
