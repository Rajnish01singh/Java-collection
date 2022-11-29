
package com.mycompany.arraylist;

import java.util.Vector;

public class VectorP {
    Vector<Integer> v =new Vector<Integer>();
    
    public void vector(){
        for(int i=0;i<=5;i++){
            v.add(i);
            
        }
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        for(int i=0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
            
        }
    }
    
}
