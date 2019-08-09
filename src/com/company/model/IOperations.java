package com.company.model;

// using abstract class
public interface IOperations {
//    double num1 = 0;
//    double num2 = 0;
//    int operator = 0;
//    double result= 0;
//
    abstract public double add();
    abstract public double sub();
    abstract public double mul();
    abstract public double div();

    abstract public boolean checkPrime();
    abstract public boolean isDivisor();

    double getNum1();
    double getNum2();
    double getResult();
    int getOperator();
}
