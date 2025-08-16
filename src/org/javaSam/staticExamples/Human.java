package org.javaSam.staticExamples;

public class Human {
    int age;
    String name;
    String address;
    boolean married;
    static long population;


    static void  greet(){
        System.out.println(" Hello Hi Welcome ");
       // System.out.println(this.age); //cannot use non static under static



    }

    Human(int age,String name, String address, boolean married){
        this.age=age;
        this.name=name;
        this.address=address;
        this.married=married;
        Human.population+=1;
    }

}
