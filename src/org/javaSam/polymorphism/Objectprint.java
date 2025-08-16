package org.javaSam.polymorphism;

public class Objectprint {

    int num;
    public Objectprint(int num){
        this.num=num;
    }

    @Override
    public String toString(){
        return "Objectprint{"+
                "num="+num+
                "}";
    }
    public static void main(String[] args) {
        Objectprint obj=new Objectprint(54);
        System.out.println(obj);
    }
}
