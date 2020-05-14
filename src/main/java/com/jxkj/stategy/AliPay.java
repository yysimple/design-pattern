package com.jxkj.stategy;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 900;
    }
}
