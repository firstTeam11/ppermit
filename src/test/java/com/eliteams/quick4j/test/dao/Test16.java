package com.eliteams.quick4j.test.dao;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Test16 {


    public static void main(String[] args) {
double a = Double.parseDouble("0.0");
System.out.println(Test16.double2ScientificNotation(a));//输出结果 -2.32E-1
}

 public static String double2ScientificNotation(double num){
    String str = String.format("%E", num);//获取直接格式化结果
    str = str.replace("E-0", "E-");//将E-0N处理为E-N
//处理结果
    String temp = str.substring(0,str.indexOf(".")+4);//前4位
//精确到小数点后两位
    String f = String.format("%.3f", Double.parseDouble(temp));
    str = f+str.substring(str.indexOf("E"));
    return str;
}
}