package com.eliteams.quick4j.test.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test23 {

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
                        all.add(String2Arratlist(str));
                    }
                    if(j+1 == i ){
                        String  str2 = text;
                        all.add(String2Arratlist(str2));
                    }
                    j++;
                }

                String text2 = null;
                while((text2 = bufferedReader.readLine()) != null){
                 //   !text2.startsWith("=")&&
                    if( !text2.equals("\n") ){
                        all.add(String2Arratlist(text2));
                        System.out.print(text2);
                        System.out.print("\n");
                    }
                }
                return  all;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

        list = readTxt("C:\\Users\\Administrator\\Desktop\\haha\\2.txt");
//        System.out.print(list.size());
//        System.out.print("\n");
//        for(ArrayList<String> list1 : list){
//            for(String str : list1){
//                System.out.print(str);
//            }
//            System.out.print("\n");
//        }
//        int i = 0;
//        for(String str : list.get(0)){
//            if (str.equals("COD")){
//                i++;
//            }
//            System.out.print(str);
//        }
//        System.out.print("\n");
//        System.out.print(i);
//        System.out.print("\n");
//        for(String str : list.get(1)){
//            System.out.print(str);
//        }
    }


}
