package org.javaSam.staticExamples;


class Test{
    String name;

    public Test(String name) {
        this.name = name;
    }
}
//outside class cannot be a static one because it is not dependent on another class
public class InnerClass {


    public static void main(String[] args) {
        Test a=new Test("Sam");
        Test b=new Test("Nivi");

        System.out.println(a.name);
        System.out.println(b.name);
    }

}
