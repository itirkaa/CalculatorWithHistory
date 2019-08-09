package com.company.model;


public class Operations {
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

    public double add(){
        return 0;
    }
    public double sub(){
        return 0;
    }
    public double mul(){
        return 0;
    }
    public double div(){
        return 0;
    }

    public boolean checkPrime(){
        return true;
    }
    public boolean isDivisor(){
        return true;
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
