package com.jxkj.adapter.improve;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        int dst = output220V() / 44;
        return dst;
    }
}
