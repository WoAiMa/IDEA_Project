package com.maq;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    private String name;

    private int age;


    public static void main(String[] args) {
        System.out.println("hello world");
        List list = new ArrayList<String>();

        list.add("c");
        list.add("d");

        for (Object o : list) {
                    
        }

        if (list == null) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
                
        String[] strs = new String[]{"a","b"};

        for (int i = 0; i < strs.length; i++) {
            
        }
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        for (String s : strs) {
            System.out.println(s);
        }
    }








    public void test() {
//     哈哈
//        虎
        System.out.println("HelloWorld.test");
        System.out.println("");
    }
}
