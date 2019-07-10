package com.zhd.test3;

/**
 * 除
 */
public class Division extends Operation {

    @Override
    public double getResult() {
        return getNum1()/getNum2();
    }
}
