package org.javaSam.staticExamples;


//to show initialization of static variables
public class StaticBlocks {
    static int a=10;
    static int b;

    static {
        System.out.println("Im Stsic block");
        b=a*5;

    }

    public static void main(String[] args) {
        StaticBlocks obj=new StaticBlocks();
        System.out.println(StaticBlocks.a+" "+StaticBlocks.b);

        StaticBlocks.b+=3;

        System.out.println(StaticBlocks.a+" "+StaticBlocks.b);
    }

}
