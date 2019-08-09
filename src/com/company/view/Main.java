package com.company.view;

import com.company.model.NormalOperations;
import com.company.model.Operations;
import com.company.model.ScientificOperations;
import com.company.controller.getHistory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Operations [] calculate = new Operations[10];
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULATOR");
        while (true){
            double num1, num2;
            System.out.println("Enter first number");
            num1 = scanner.nextDouble();

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Is number prime");
            System.out.println("6. Check Divisor");

            System.out.println("Enter the operation you want to perform");
            int operation = scanner.nextInt();

            if(operation != 5){
                System.out.println("Enter second number");
                num2 = scanner.nextDouble();
            }
            else{
                num2 = 0;
            }

            switch (operation){
                case 1:
                    calculate[index] = new NormalOperations(num1, num2, operation);
                    System.out.println(calculate[index].add());
                    break;
                case 2:
                    calculate[index] = new NormalOperations(num1, num2, operation);
                    System.out.println(calculate[index].sub());
                    break;
                case 3:
                    calculate[index] = new NormalOperations(num1, num2, operation);
                    System.out.println(calculate[index].mul());
                    break;
                case 4:
                    calculate[index] = new NormalOperations(num1, num2, operation);
                    System.out.println(calculate[index].div());
                    break;
                case 5:
                    calculate[index] = new ScientificOperations(num1, operation);
                    System.out.println(calculate[index].checkPrime());
                    break;
                case 6:
                    calculate[index] = new ScientificOperations(num1, num2, operation);
                    System.out.println(calculate[index].isDivisor());
                    break;
                default:
                    System.out.println("invalid operation!!");
            }

            System.out.println("Do you want to continue?? 1");
            int response = scanner.nextInt();
            if(response==1) {
                System.out.println("1. Do more calculations.");
                System.out.println("2. Check History.");
                response = scanner.nextInt();
            }
            else{
                System.exit(0);
            }

            if(response==2){
                while(true) {
                    System.out.println("Enter 0 to check previous operation /*and 1 to check next operation/*");
                    //TODO: add check history function
                    response = scanner.nextInt();
                    getHistory history = new getHistory();
                    Operations printHistory = history.getHistory(calculate, response);
                    System.out.println(printHistory.getNum1()+","+printHistory.getNum2()+","+printHistory.getResult());

                    System.out.println("Do you want to continue?? 1");
                    response = scanner.nextInt();
                    if(response==1){
                        System.exit(0);
                    }
                }
            }
            index++;
        }
    }
}
