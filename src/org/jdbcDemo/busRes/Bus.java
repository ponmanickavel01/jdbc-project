package org.jdbcDemo.busRes;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;   //get and set methid should be added to mutable

    public Bus(int no, boolean ac, int cap) {
        this.busno = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getCapacity(){     //accesser
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBusno() {
        return busno;
    }

    public void setBusno(int busno) {
        this.busno = busno;
    }

    public boolean isAc() {
        return ac;
    }

    public void displayBusInfo(){
        System.out.println("Bus No.: "+ busno +" Ac: "+ ac + "Capacity: "+capacity);
    }
}
