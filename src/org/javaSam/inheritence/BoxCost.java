package org.javaSam.inheritence;

public class BoxCost extends BoxWeight{
    // to print the cost of the box using weight and height and length
    // formula--> cost = h*w*l*costone
//    SingleInherit cost=new SingleInherit();
//    System.out.println("Enter")

    double cost;

    BoxCost(){
        super();
        this.cost=-1;
    }
//    BoxCost(BoxCost other){
//        super(other);
//        this.cost=other.cost;
//    }

    public BoxCost(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
