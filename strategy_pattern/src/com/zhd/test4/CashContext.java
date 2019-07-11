package com.zhd.test4;

/**
 * 上下文，用来维护对抽象基类对象的引用
 */
public class CashContext {
/**
 * 最初的策略
  */

//    private CashSuper cashSuper;
//
//    public CashContext(CashSuper cashSuper) {
//        this.cashSuper = cashSuper;
//    }
//    public double getMoney(double money){
//        return cashSuper.acceptCash(money);
//    }

    /**
     * 结合工厂模式的策略
     */
    private CashSuper cashSuper = null;

    public CashContext(String type){
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn("300","100");
                break;
            case "打八折":
                cashSuper = new CashRebate("0.8");
                break;
        }
    }
    public double getTotalMoney(double money){
        return cashSuper.acceptCash(money);
    }
}
