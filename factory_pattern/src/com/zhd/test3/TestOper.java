package com.zhd.test3;

import java.util.Scanner;

public class TestOper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        double num1 = scanner.nextDouble();
        System.out.println("请输入运算符:");
        String oper = scanner.next();
        System.out.println("请输入第二个数:");
        double num2 = scanner.nextDouble();

        Operation instance = DaoFactory.Instance(oper);
        instance.setNum1(num1);
        instance.setNum2(num2);
        double result = instance.getResult();
        System.out.println("结果为:"+result);

    }
}
