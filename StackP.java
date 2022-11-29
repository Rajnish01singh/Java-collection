package com.mycompany.arraylist;

import java.util.Stack;
import java.util.Iterator;

public class StackP {

    Stack<String> stack = new Stack<String>();

    public void stack() {
        stack.push("rajnish");
        stack.push("pratiksha");
        stack.push("vaidhik");
        stack.push("sourya");
        stack.push("krishna");
         // iterator for stack       
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
         stack.pop();
  
        // Iterator for the stack
        itr = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

}
