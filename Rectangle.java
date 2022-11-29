/*
 Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length and
breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with
its constructor having a parameter for its side (suppose s) calling the constructor 
of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.

 */
package com.rajnish1;


public class Rectangle {
    public int length;
    public int breadth;
    
    public Rectangle(int a,int b){
        length=a;
        breadth=b; 
    }
    public void area(){
        int area=length*breadth;
        System.out.println("Area of rectangle is: "+area);
    }
    public void perimeter(){
        int perimeter=2*(length+breadth);
        System.out.println("perimeter of rectangle:"+perimeter);
    }
    
}
