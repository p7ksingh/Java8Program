package com.p1.java8ex;

class A {

    int x = 2;

    public void display() {
        System.out.println("Hello from parent class");
    }

    public static void main(String[] args) {
        B b = new B();
        b.myTest();
    }
}

class B extends A {

    int x = 3;

    public void display() {
        System.out.println("Hello from subclass");
    }

    public void myTest() {
        System.out.println(x); // displays 3
        System.out.println(super.x); // displays 2
        display(); // displays: Hello from subclass
        super.display(); // displays: Hello from parent class
    }
}

public class MyTest{
    public static void main(String[] args) {
        B b = new B();
        b.myTest();
    }
}