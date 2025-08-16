package org.javaSam.inheritence;

public class Box {
    private double l;
    double h;
    double w;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    //cude or square
    Box(double s){
        this.w=s;
        this.l=s;
        this.h=s;

    }
    Box(double l, double h, double w){
        System.out.println("Box class consttructor");;
        this.l=l;
        this.h=h;
        this.w=w;
    }


}
