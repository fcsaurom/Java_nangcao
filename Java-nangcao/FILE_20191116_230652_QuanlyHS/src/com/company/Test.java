package com.company;

import java.util.HashMap;

public class Test {
    public static void main(String[] args){
        int[] array = new int[] {123, 45, 56};

        //<Key, Data>
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Integer x = map.get("A");
        //Integer y = map.get("B");
        System.out.println(x);
    }
}
