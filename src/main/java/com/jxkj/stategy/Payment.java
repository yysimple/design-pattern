package com.jxkj.stategy;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public abstract class Payment {
    public abstract String getName();

    public abstract double queryBalance(String uid);

    public PayState pay(String uid, double amount){
        if (queryBalance(uid) < amount) {
            return new PayState(500, "支付失败", "余额不足");
        } else {
            return new PayState(200, "支付成功", "支付金额" + amount);
        }
    }
}
