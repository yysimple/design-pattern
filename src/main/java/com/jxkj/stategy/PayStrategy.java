package com.jxkj.stategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述： 策略类，封装所有策略
 *
 * @author wcx
 * @version 1.0
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JDPay";
    public static final String WECHAT_PAY = "WeChatPay";
    public static final String DEFAULT_PAY = "AliPay";

    private static Map<String, Payment> payStrategy = new HashMap<>();
    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(JD_PAY, new JDPay());
        payStrategy.put(WECHAT_PAY, new WeChatPay());
    }
    public static Payment get(String payKey){
        if (!payStrategy.containsKey(payKey)) {
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }
}
