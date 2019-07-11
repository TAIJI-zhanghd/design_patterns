package com.zhd.test3;

/**
 * 折扣类
 */
public class CashRebate extends CashSuper {
    private double rebate;
//    根据传入的值来判断折扣
    public CashRebate(String rebate) {
        this.rebate = Double.parseDouble(rebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
