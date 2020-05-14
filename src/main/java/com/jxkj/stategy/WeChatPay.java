package com.jxkj.stategy;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "微信";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
