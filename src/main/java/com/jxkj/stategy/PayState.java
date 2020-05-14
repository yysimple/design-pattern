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
public class PayState {
    private int code;

    private String msg;

    private Object data;

    @Override
    public String toString(){
        return ("支付状态： [" + code + "]," + msg + ",交易详情: " + data);
    }
}
