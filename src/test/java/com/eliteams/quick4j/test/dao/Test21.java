package com.eliteams.quick4j.test.dao;

import org.mozilla.universalchardet.UniversalDetector;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test21 {
    /**传入txt路径读取txt文件
     * @param txtPath
     * @return 返回读取到的内容
     */
    public static String readTxt(String txtPath) {
        File file = new File(txtPath);
        if(file.isFile() && file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuffer sb = new StringBuffer();
                String text = null;
                while((text = bufferedReader.readLine()) != null){
                    text += "  ";
                    sb.append(text);
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
//    public static void saveAsUTF8(String inputFileUrl, String outputFileUrl) throws IOException {
////
////        String inputFileEncode = EncodingDetect.getJavaEncode(inputFileUrl);
////        System.out.println("inputFileEncode===" + inputFileEncode);
////        BufferedReader bufferedReader = new BufferedReader(
////                new InputStreamReader(new FileInputStream(inputFileUrl), inputFileEncode));
////        BufferedWriter bufferedWriter = new BufferedWriter(
////                new OutputStreamWriter(new FileOutputStream(outputFileUrl), "UTF-8"));
////        String line;
////        while ((line = bufferedReader.readLine()) != null) {
////            bufferedWriter.write(line + "\r\n");
////        }
////        bufferedWriter.close();
////        bufferedReader.close();
////        String outputFileEncode = EncodingDetect.getJavaEncode(outputFileUrl);
////        System.out.println("outputFileEncode===" + outputFileEncode);
////        System.out.println("txt文件格式转换完成");
//
//    }

//    public static void   haha () throws IOException {
//        InputStream is = null;
//        try {
//            is = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\haha\\2.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        BufferedInputStream reader = new BufferedInputStream(is);
//        byte[] buff = new byte[1024];
//        int len = 0;
////      检测文件编码
//        UniversalDetector detector = new UniversalDetector(null);
//        while((len = reader.read(buff)) != -1 && !detector.isDone()){
//            detector.handleData(buff, 0, len);
//        }
//        detector.dataEnd();
////      获取编码类型
//        String encoding = detector.getDetectedCharset();
//        if(encoding != null){
//            System.out.println("Detected encoding = " + encoding);
//        } else {
//            System.out.println("No encoding detected.");
//        }
//
//        detector.reset();
//        reader.close();
//    }
    public static String[] replaceNull(String[] str){
        //用StringBuffer来存放数组中的非空元素，用“;”分隔
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length; i++) {
            if("".equals(str[i])) {
                continue;
            }
            sb.append(str[i]);
            if(i != str.length - 1) {
                sb.append(";");
            }
        }
        //用String的split方法分割，得到数组
        str = sb.toString().split(";");
        return str;
    }


    public static void main(String[] args){

       String str = readTxt("C:\\Users\\Administrator\\Desktop\\haha\\1.txt");

      // System.out.println(str);
        System.out.println(str.length());
      //  System.out.println(str.replace(" ","").length());


        String[] strlist1  =str.split(" ");
        String[] strlist  =replaceNull(strlist1);
        ArrayList<String> strl = new ArrayList<>();
        for (String string : strlist) {
             strl.add(string);
        }
        int first =0;
        for(int i = 0 ;i< strlist.length; i++ ){
            if(strlist[i].equals("YYYY")){
                System.out.println(i);
                first = i ;
                break;
            }
        }
        String c = "Water Level";
        String d ="Discharge";
        String[] s1 = str.split(c);
        int result1 = s1.length-1;
        String[] s2 = str.split(d);
        int result2 = s2.length-1;
        int all =  first + 5 +(result1+result2)*3+result1;
        int num =result1+result2;
        String yyy = strlist[all+1];
        System.out.println(yyy);
        ArrayList<String> one = new ArrayList<>();
        for (int i = all+1 ; i<all+1+num;i++){
          one.add(strl.get(i));
        }
        ArrayList<ArrayList<String>> l = new ArrayList<ArrayList<String>>();

        for(int i = all+one.size()+1;i<=strl.size();i++){
            ArrayList<String>  list1 =new ArrayList<String>();
            for(int j = i;j<=i+num+6;j++){
                list1.add(strl.get(j));
            }
            l.add(list1);

        }
        System.out.println(one.size());
        System.out.println(l.size());

//        String a =str;
//        String str1="All results of the simulation:";
//        int b =   a.indexOf(str1);
//        String str2="YYYY MM DD HH MM SS";
//        int e =a.indexOf(str2);
//        System.out.println(e);
//
//        String c = "Water Level";
//        String d ="Discharge";
//        String[] s1 = a.split(c);
//        int result1 = s1.length-1;
//        String[] s2 = a.split(d);
//        int result2 = s2.length-1;
//
//        int total =  e + str2.length()+result1*c.length()+result2*d.length();
//        int model = str2.length()+result1*c.length()+result2*d.length();
//        System.out.println(total);
//        System.out.println(model);
    //    int total2 = total+(result1+result2)*2;
   //    System.out.println(total2);
      //  System.out.println(str.substring(10));
        //   String str = a.substring(total2, 100);
        //  System.out.println(str);
       // haha();
    }

//    /**使用FileOutputStream来写入txt文件
//     * @param txtPath txt文件路径
//     * @param content 需要写入的文本
//     */
//    public static void writeTxt(String txtPath,String content){
//        FileOutputStream fileOutputStream = null;
//        File file = new File(txtPath);
//        try {
//            if(file.exists()){
//                //判断文件是否存在，如果不存在就新建一个txt
//                file.createNewFile();
//            }
//            fileOutputStream = new FileOutputStream(file);
//            fileOutputStream.write(content.getBytes());
//            fileOutputStream.flush();
//            fileOutputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


}