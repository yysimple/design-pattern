package com.jxkj.adapter.improve;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class Phone {

    public void charging(Voltage5V v){
        if (v.output5V() == 5) {
            System.out.println("ke yi chong dian ...");
        }else if (v.output5V() > 5){
            System.out.println("> 5 bu neng chong dian ");
        }else {
            System.out.println(" < 5");
        }
    }
}
