package com.zhd.test1;

/**
 * 商场促销
 */
public class Cashier {

    public static double totalMoney(double price,int num){
        double result = 0;
        result = price * num;
        return result;
    }

    public static void main(String[] args) {
        double price = 12;
        int num = 2;
        double result = totalMoney(price, num);
        System.out.println("结算金额:"+result);
    }
}
