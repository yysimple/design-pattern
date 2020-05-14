package com.jxkj.stategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String uid;

    private String orderId;

    private double amount;

    public PayState pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayState pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用：" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "开始扣款...");
        return payment.pay(uid, amount);
    }
}
