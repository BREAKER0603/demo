package com.example.demo.demo_test;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 15:43 2018/7/31
 * @modified By
 */
public class demoTest {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        demoTest demoTest = (demoTest) o;

        return name.equals(demoTest.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void boxing() {
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("i1==i2: " + (i1 == i2));
        System.out.println("i3==i4: " + (i3 == i4));
        System.out.println("i1.equals(i2): " + i1.equals(i2));

        System.out.println("i3.equals(i4): " + i3.equals(i4));
    }

    public static void main(String[] args) {
        boxing();
        long value = true ? null : 1; // NullPointerException
    }
}

class demoTest02 {
    public static void main(String[] args) throws Exception {
        /*demoTest demoTest = new demoTest();
        demoTest.getClass();
        Class<?> clazz = Class.forName("demoTest");
        clazz.newInstance();*/
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "shaiguo");
        hashMap.put(1, "xiaofan");
        System.out.println(hashMap.get(1));
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"s");
        treeMap.put(1,"w");
        System.out.println(treeMap.get(1));
    }
}
