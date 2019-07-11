package com.zhd.test3;

public class CashTest {
    public static void main(String[] args) {
        //测试返利 满300减100
        CashSuper cashSuper = CashFactory.instance("八折");
        double v = cashSuper.acceptCash(200);
        System.out.println("应付"+v);
    }
}
