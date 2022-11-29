package com.mycompany.arraylist;

import java.util.LinkedList;

public class LinkedListP {

    LinkedList<Integer> l = new LinkedList<Integer>();

    public void linkList() {
        for (int i = 1; i <= 5; i++) {
            l.add(i);

        }
        System.out.println(l);
        l.remove(3);
        System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }

}
