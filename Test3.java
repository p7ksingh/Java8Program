package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("one", "newvalue1");
        map.put("two", "newvalue2");
        map.put("three", "newvalue3");
        map.put("four", "newvalue4");
        map.put("five", "newvalue5");
        // System.out.println(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + "  " + "value: " + entry.getValue());

        }
        System.out.println(map.get("two"));
        System.out.println(map.remove("five"));
        System.out.println(map);
    }

}
