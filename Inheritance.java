/*Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class */

package com.mycompany.inheritance;
import com.rajnish1.Animal;
import com.rajnish1.Dog;
import com.rajnish1.Manager;
import com.rajnish1.Employee;
import com.rajnish1.Member;
import com.rajnish1.Rectangle;
import com.rajnish1.Square;



// class Parent{
//    public void run(){
//        System.out.println("this is parent class ");
//    }
//}
//class Child extends Parent{
//    public void child(){
//        System.out.println("this is child clas");
//    }
//}

public class Inheritance {

    public static void main(String[] args) {
//       Parent p=new Parent();
//       p.run();
       Dog d=new Dog();
       d.child();
       d.run();
       
       Manager m= new Manager();
       m.printSalary();
       m.salary=20000;
       System.out.println(m.salary);
       m.name="rajnish kumar";
       System.out.println(m.name);
       m.address="navi mumbai";
       System.out.println(m.address);
       m.age=25;
       System.out.println(m.age);
       m.phone_number="6202223012";
       System.out.println(m.phone_number);
       m.specialization="cse";
       System.out.println(m.specialization);
       
       Employee e=new Employee();      
       e.printSalary();
       e.salary=30000;
       e.name="rajnish kumar";
       e.address="navi mumbai";
       e.age=25;
       e.phone_number="6202223012";
       e.department="it";
       
       Rectangle r=new Rectangle(10,12);
       r.area();
       r.perimeter();
       
       Square obj=new Square(10);
       obj.area();
       obj.perimeter();
    }
}
