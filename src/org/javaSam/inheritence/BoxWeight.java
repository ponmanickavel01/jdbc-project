package org.javaSam.inheritence;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

//    public BoxWeight(double l,double h, double w, double weight){
//
//    }

//    BoxWeight(BoxWeight other ){
//        super(other);
//        weight=other.weight;
//    }

    BoxWeight(double s,double weight){
        super(s);
        this.weight=weight;

    }


    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
