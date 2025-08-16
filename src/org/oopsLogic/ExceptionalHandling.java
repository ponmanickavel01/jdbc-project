package org.oopsLogic;

public class ExceptionalHandling {

    public static void main(String[] args) {
        int a=10,b=0;
        int c=0;
        try{
            c=a/b;
        }
        catch (Exception e){
            System.err.println("Error , it cannot be divided into 0");
        }
        System.out.println(c);
        System.out.println("End of Program Sam");
    }
}

