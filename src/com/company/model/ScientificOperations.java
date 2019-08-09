package com.company.model;

public class ScientificOperations extends Operations {
    public ScientificOperations(double num1, int operator){
        super(num1, operator);
    }
    public ScientificOperations(double num1, double num2, int operator){
        super(num1, num2, operator);
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
}
