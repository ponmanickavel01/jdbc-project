package org.javaSam.singleton;

public class Singleton {
//    private int a=10;


    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        //check whether its created instances
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
