package com.eliteams.quick4j.test.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test22 {

    public static  ArrayList<String>  String2Arratlist(String str){
        ArrayList<String> point = new ArrayList<String>();
        if(str!= ""){
            String[] strlist = str.split(" ");

            for(String string : strlist ){
                point.add(string);
            }
        }

        return  point;
    }



    public static ArrayList<ArrayList<String>> readTxt(String txtPath) {
        File file = new File(txtPath);
        if(file.isFile() && file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuffer sb = new StringBuffer();
                String text = null;
                int i =21;
                int j =-1;
                ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
                while(j+1 <= i &&(text = bufferedReader.readLine()) != null){

                        if(text.startsWith("YYYY")){
                            String  str = text;
//                            String[] strlist1  =str.split(" ");
//                            String c = "Water Level";
//                            String d ="Discharge";
//                            String[] s1 = str.split(c);
//                            int result1 = s1.length-1;
//                            String[] s2 = str.split(d);
//                            int result2 = s2.length;
//                            System.out.println(result1+ " "+result2);
                            all.add(String2Arratlist(str));
                        }
                        if(j+1 == i ){
                            String  str2 = text;
//                            String[] strlist = str2.split(" ");
//                            ArrayList<String> point = new ArrayList<String>();
//                            for(String str : strlist ){
//                                point.add(str);
//                               // System.out.print(str);
//                            }
                            all.add(String2Arratlist(str2));
                        }
                      j++;
                    }

                String text2 = null;
                while((text2 = bufferedReader.readLine()) != null){
                    if(!text2.startsWith("=")&& text2!= "\n"){
                        all.add(String2Arratlist(text2));
                    }
                    //sb.append(text2);
                }
               // return sb.toString();
                return  all;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

        list = readTxt("C:\\Users\\Administrator\\Desktop\\haha\\1.txt");
        System.out.print(list.size()-2);
        System.out.print("\n");
        for(ArrayList<String> list1 : list){
            for(String str : list1){
                System.out.print(str);
            }
            System.out.print("\n");
        }
        //System.out.println(str);
       // System.out.println(str.length());
        int i = 0;
        int j = 0;
        for(String str : list.get(0)){
            if (str .equals("Water")){
                i++;
            }
            if (str.equals("Discharge")){
                j++;
            }
            System.out.print(str);
        }
        System.out.print("\n");
        System.out.print(i+" "+j);
        System.out.print("\n");
        for(String str : list.get(1)){
            System.out.print(str);
        }
    }


}
