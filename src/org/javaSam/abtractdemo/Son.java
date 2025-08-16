package org.javaSam.abtractdemo;

public class Son  extends Parent{


    public Son(int age){
        super(age);
    }


    @Override
    void normal(){
        super.normal();
    }

    @Override
    void career(){
        System.out.println("Hi My fav subject is UHV");
    }

    @Override
    void partner() {
        System.out.print("I love my partner nive ");
        System.out.println("She is 22yrs old");

    }
}
