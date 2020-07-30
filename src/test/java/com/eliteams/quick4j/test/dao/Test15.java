package com.eliteams.quick4j.test.dao;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Test15 {
    public static void main(String[] args) {
        NumberFormat nFormat = NumberFormat.getNumberInstance();
        nFormat.setMaximumFractionDigits(2);//设置小数点后面位数e799bee5baa6e79fa5e98193e78988e69d8331333332633063为
        System.out.println(nFormat.format(3.1415));


        double d = 14.7155;
        DecimalFormat df0 = new DecimalFormat("###");
        DecimalFormat df1 = new DecimalFormat("###.0");
        DecimalFormat df2 = new DecimalFormat("###.00");
        System.out.println(df0.format(d));
        System.out.println(df1.format(d));
        System.out.println(df2.format(d));
        double test = Math.round(d);
        System.out.println(test);

    }
}