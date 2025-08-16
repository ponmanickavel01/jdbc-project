package org.javaSam.intro;

public class Object {
    public static void main(String[] args) {
        Student sam=new Student();
//        System.out.println(sam.roll);
        Student nive=new Student(22,"pattu",99.6f);

        System.out.println(nive.roll);
        System.out.println(nive.name);

        sam.changeName("Nannu");
        sam.greet();

        Student random1=new Student();
        System.out.println(random1.name);
//

    }

}


//template for every student
class Student{
    int roll;
    String name;
    float mark;

    void greet(){
        System.out.println("Hi "+this.name+", Welcome to IntelliJ");
    }

    void changeName(String newName){
        name=newName;
    }

    //one word to access every properties
//    Student(){
//        this.roll=13;
//        this.name="sam";
//        this.mark=100.0f;
//    }

    Student(){
        this(45,"defualt person",65.9f);
    }

    Student(int roll,String name, float mark){
        this.roll=roll;
        this.name=name;
        this.mark=mark;
    }


}