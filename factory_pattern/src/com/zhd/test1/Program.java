package com.zhd.test1;
/**
 * 只是实现了基本功能的计算器
 */

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        System.out.println("请输入第一个数:");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        System.out.println("请输入运算符:");
        String oper = scanner.next();
        System.out.println("请输入第二个数:");
        double num2 = scanner.nextDouble();

        double result = 0.0;
        switch(oper){
            case "+" :
                result = num1+num2;
                break;
            case "-" :
                result = num1-num2;
                break;
            case "*" :
                result = num1*num2;
                break;
            case "/" :
                result = num1/num2;
                break;
        }

        System.out.println("结果为："+result);
    }
}
