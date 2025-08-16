package org.javaSam.abtractdemo;

public class Daugter extends Parent {

    public Daugter(int age){
        super(age);
    }


    void normal(){
        super.normal();
    }
    @Override
    void career(){
        System.out.println("hi ! my fav sub is maths");
    }
    void partner(){
        System.out.print("He is my love sam");
        System.out.println("He is 22yrs old");
    }
}

