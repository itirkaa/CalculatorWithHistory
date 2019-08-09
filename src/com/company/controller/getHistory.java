package com.company.controller;

import com.company.model.Operations;

public class getHistory {
    public Operations getHistory(Operations [] calc, int dir){
        int index = calc.length-1;
        if(dir==0){
            index--;
        }
        else if(dir==1 && index < calc.length-1){
            index++;
        }
        
        return calc[index];
    }
}
