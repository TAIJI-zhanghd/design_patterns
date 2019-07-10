package com.zhd.test2;

import java.util.Scanner;

/*
通过封装将计算器的业务逻辑和显示界面分开
 */
public class Operation {

    public static double getTesult(double num1,double num2,String oper){
        double result = 0d;
        switch (oper){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println("请输入第一个数:");
            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();
            System.out.println("请输入运算符:");
            String oper = scanner.next();
            System.out.println("请输入第二个数:");
            double num2 = scanner.nextDouble();
            double result = getTesult(num1, num2, oper);
            System.out.println("结果为："+result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
