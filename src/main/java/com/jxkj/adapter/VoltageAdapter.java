package com.jxkj.adapter;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class VoltageAdapter implements Voltage5V {

    private final Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }


    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dst = src / 44;
        return dst;
    }
}
