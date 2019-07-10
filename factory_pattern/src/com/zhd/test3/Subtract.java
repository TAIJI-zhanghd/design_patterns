package com.zhd.test3;

/**
 * 减
 */
public class Subtract extends Operation {

    @Override
    public double getResult() {
        return getNum1()-getNum2();
    }
}
