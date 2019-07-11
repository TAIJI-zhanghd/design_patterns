package com.zhd.test3;

public class CashTest {
    public static void main(String[] args) {
        //测试返利 满300减100
        CashSuper cs = new CashReturn("300","100");
        double v = cs.acceptCash(200);
        System.out.println("应付"+v);
    }
}
