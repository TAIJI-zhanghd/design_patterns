package com.zhd.test3;

public class CashFactory {
    public static CashSuper instance(String type){
        CashSuper cs = null;
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "八折":
                cs = new CashRebate("0.8");
                break;
            case "满300减100":
                cs = new CashReturn("300","100");
                break;
        }
        return cs;
    }
}
