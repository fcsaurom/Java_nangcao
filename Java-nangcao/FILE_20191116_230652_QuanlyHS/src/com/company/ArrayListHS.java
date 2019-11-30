package com.company;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListHS {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(9);
        list.add(12);
        list.add(21);
        list.add(222);

        System.out.println("Duyet giong trong list: ");
        for (Object element: list){
            System.out.println(element);
        }

        System.out.println("Duyet giong nhu array");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("Iterator: ");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            int x = (int) iterator.next();
            System.out.println(x);
        }
    }
}
