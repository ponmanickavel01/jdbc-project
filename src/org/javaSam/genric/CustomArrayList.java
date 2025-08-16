package org.javaSam.genric;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int defaultsize=0;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[defaultsize];
    }

    private boolean isFull(){
        return size==data.length;
    }

    public void  add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public  int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int ind){
        return size;
    }

    public int set(int ind,int val){
        data[ind]=val;
        return val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(3);
        list.add(9);
        list.add(10);

        System.out.println(list);
    }
}
