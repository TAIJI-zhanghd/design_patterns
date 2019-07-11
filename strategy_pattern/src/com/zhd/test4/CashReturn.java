package com.zhd.test4;

/**
 * 满减收费类
 */
public class CashReturn extends CashSuper {
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money > moneyCondition){
            result = result - Math.floor(money/moneyCondition) * moneyReturn;
        }
        return result;
    }
}
