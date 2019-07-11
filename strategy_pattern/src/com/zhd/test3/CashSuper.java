package com.zhd.test3;

/**
 * 根据实际业务需求可将具体实现分为3类：正常收费类、折扣收费类、满减收费类
 */
public abstract class CashSuper {

    public abstract double acceptCash(double money);
}
