package com.zhd.test3;

/**
 * 加
 */
public class Add extends Operation {

    @Override
    public double getResult() {
        return getNum1()+getNum2();
    }
}
