
package com.rajnish1;


public class Square extends Rectangle{
    int side;
    public Square(int s){
        super(s,s);
    }
    public void area(){
        System.out.println((side*side));
    }
    public void perimeter(){
        System.out.println(4*side);
    }
    
}
