package org.javaSam.abtractdemo;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age=age;
    }

    static void hello(){
        System.out.println("hey Helloo");
    }

    void normal(){
        System.out.println("Normal method");
    }
    abstract void career();
    abstract void partner();

}
