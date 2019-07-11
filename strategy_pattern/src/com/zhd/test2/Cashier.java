package com.zhd.test2;

/**
 * 商场促销 增加打八折、五折
 */
public class Cashier {

    static String [] list = {"正常销售","八折","五折"};

    public static double totalMoney(double price,int num,String string){
        double result = 0;
        switch (string){
            case "正常销售":
                result = price * num;
                break;
            case "八折":
                result = price * num * 0.8;
                break;
            case "五折":
                result = price * num * 0.5;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        double price = 5;
        int num = 2;
        String str = "八折";
        double result = totalMoney(price, num, str);
        System.out.println("结果为："+ result);
    }
}
