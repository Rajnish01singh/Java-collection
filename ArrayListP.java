

package com.mycompany.arraylist;
//import java.io.*;
//import java.util.*;
import java.util.ArrayList;


public class ArrayListP {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("ArrayList operation are:-");
            
           for(int i=1;i<=5;i++){
               al.add(i);
               
           } 
           System.out.println(al);
           al.remove(3);
           System.out.println(al);
           //printing one by one
           for(int i=0;i<al.size();i++){
               System.out.print(al.get(i)+ " ");
           }
           System.out.println("\r\n");
           System.out.println( "Linkedlist operation are:-");
           // calling the Linked list methid
           LinkedListP obj=new LinkedListP();
           obj.linkList();
           // calling the vector method
           System.out.println("\r\n");
           System.out.println( "vector operation are:-");
           VectorP t=new VectorP ();
           t.vector();
           
           System.out.println("\r\n");
           System.out.println( "Stack operation are:-");
           
           // calling the stack method
           StackP s=new StackP();
           s.stack();
           System.out.println();
  
       
           
    }
}
