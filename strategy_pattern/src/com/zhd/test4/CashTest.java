package com.zhd.test4;

public class CashTest {
    public static void main(String[] args) {

/**
 *         策略模式 使用上下文维护类来测试
 */
//        CashContext cashContext = new CashContext(new CashReturn("700", "200"));
//        double money = cashContext.getMoney(750);
//        System.out.println("应付款："+money);
/**
 * 加入工厂模式的策略模式
  */
        CashContext context = new CashContext("满300减100");
        double money = context.getTotalMoney(400);
        System.out.println("总金额为:"+money);
    }
}
