package com.zhd.test3;

public class DaoFactory {

    public static Operation Instance(String oper){
        Operation operation = null;
        switch (oper){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Subtract();
                break;
            case "*":
                operation = new Pursue();
                break;
            case "/":
                operation = new Division();
                break;
        }
        return operation;
    }
}
