package com.david;

/**
 * Created by z00473307 on 2019/3/19.
 */
public class JavaBean {




        public static void main(String[] args) {

            String s = "hello\n\rworld\njjj\nddd\n";
            System.out.println(s.length());
            s = s.replaceAll("\\r|\\n","");
            System.out.println(s.length());
        }


}
