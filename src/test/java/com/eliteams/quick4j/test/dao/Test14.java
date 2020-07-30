package com.eliteams.quick4j.test.dao;

import com.eliteams.quick4j.web.controller.GetFiles;
import com.eliteams.quick4j.web.model.Shui;

import java.util.ArrayList;
import java.util.List;

public class Test14 {
    public static void main(String[] args) {
        String moni ="2017";
        String path = "C:\\Users\\Administrator\\Desktop\\project";
        List<Object> list = new GetFiles().getFiles(path);
        List<String> bb = new ArrayList<String>();
        List<Shui> cc = new ArrayList<Shui>();


        for (Object obj : list) {


            String a = (String) obj;
            String b = "C:\\Users\\Administrator\\Desktop\\project\\";

            String c = a.replace(b, "");
            bb.add(c);

        }
        for (String str : bb) {
            Shui s = new Shui();
            int a = str.length();
            String str2 = str.replace("\\", "");
            int b = str2.length();
            if (a - b == 3) {
               String temp[] = str.split("\\\\");
                if (temp[2].equals(moni)) {
                    s.setShuixi(temp[0]);
                    s.setYijiheliu(temp[1]);
                    s.setMoni(temp[2]);
                    s.setFangan(temp[3]);
                    cc.add(s);
                }
            }
        }

    for(Shui sw :cc){
        System.out.println(sw.getFangan());
    }
    }
}
