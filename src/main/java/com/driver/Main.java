package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B objB = new B();
        System.out.println(objB.meth()); // This will call the overridden method in class B

        // Task 5: Call the overridden method from object of class B
        System.out.println(objB.meth()); // This will call the overridden method in class B
    }
}