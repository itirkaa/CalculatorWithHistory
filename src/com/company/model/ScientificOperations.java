package com.company.model;

public class ScientificOperations implements IOperations {
    double num1 = 0;
    double num2 = 0;
    int operator = 0;
    double result= 0;

    public ScientificOperations(double num1, int operator){
        this.num1 = num1;
        this.operator = operator;
    }
    public ScientificOperations(double num1, double num2, int operator){
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double add() {
        return 0;
    }

    public double sub() {
        return 0;
    }

    public double mul() {
        return 0;
    }

    public double div() {
        return 0;
    }

    public boolean checkPrime(){
        boolean flag = true;
        if (this.num1%2==0 && this.num1>=2)
            flag = false;
        for(int i = 3; i <= num1/2; i+=2){
            if (this.num1%i==0){
                flag = false;
                break;
            }
            else
                flag = true;
        }
        return flag;
    }

    public boolean isDivisor(){
        boolean flag = true;
        if(this.num1%num2!=0)
            flag = false;
        return flag;
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
