package com.eliteams.quick4j.test.dao;



    import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
    import org.python.core.PyString;
    import org.python.util.PythonInterpreter;

    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.List;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
public class Test20 {


//            PythonInterpreter interpreter = new PythonInterpreter();
//            interpreter.execfile("C:\\Users\\Administrator\\Desktop\\mikeio-master\\tests\\mytest14.py");
//
//            // 第一个参数为期望获得的函数（变量）的名字，第二个参数为期望返回的对象类型
//            PyFunction pyFunction = interpreter.get("add", PyFunction.class);
//           String haha = "C:\\Users\\Administrator\\Desktop\\1.txt";
//            //调用函数，如果函数需要参数，在Java中必须先将参数转化为对应的“Python类型”
//            PyObject pyobj = pyFunction.__call__(new PyString(haha));
//            System.out.println("the anwser is: " + pyobj);
            public static void main(String[] args) throws IOException {
                try {
                    System.out.println("start");
                    String cmdStr1="C:\\Users\\Administrator\\Desktop\\1.txt";

                    String[] args1 = new String[] { "python", "C:\\Users\\Administrator\\Desktop\\mikeio-master\\tests\\mytest14.py", cmdStr1};
                    Process pr=Runtime.getRuntime().exec(args1);

                    System.out.println("end");
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
//                        try {
//                            //String a=getPara("car").substring(1),b="D34567",c="LJeff34",d="iqngfao";
//                            //String[] args1=new String[]{ "python", "D:\\pyworkpeace\\9_30_1.py", a, b, c, d };
//                            //Process pr=Runtime.getRuntime().exec(args1);
//                            String url="C:\\Users\\Administrator\\Desktop\\1.txt";
//                            System.out.println("start;"+url);
//                            String[] args1 = new String[] { "python", "C:\\Users\\Administrator\\Desktop\\mikeio-master\\tests\\mytest14.py", url};
//                            Process pr=Runtime.getRuntime().exec(args1);
//
//                            pr.waitFor();
//                            System.out.println("end");
//                        }
//                        catch (Exception e) {
//                            e.printStackTrace();
//                        }
                    }
//                    private static String getPara(String string) {
//                        // TODO Auto-generated method stub
//                        return null;
//                    }






