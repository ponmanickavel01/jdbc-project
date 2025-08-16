package org.javaSam.staticExamples;

public class Main {

    public static void main(String[] args) {

        Human sam= new Human(22,"sam","chennai",false);
        Human nivi=new Human(22,"nivi","pattabiram",false);
        System.out.println(Human.population);
        fun();;

        // fun2();  couldnot use fun2 as it is non static
        Main obj=new Main();  // create obj for static
        obj.fun2();;



    }
    static void fun(){
        System.out.println("hi");
        //greeting(); // should no t use non static under static
        Main g=new Main();
        g.greeting();

    }

    void fun2(){
        greeting();;
    }
    void greeting(){
        System.out.println("hii welcome");
    }

}
