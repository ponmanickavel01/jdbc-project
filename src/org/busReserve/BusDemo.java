package org.busReserve;
import java.util.*;

public class BusDemo {
    public static void main(String[] args) {

        int user_option=1;
        Scanner sc=new Scanner(System.in);

        ArrayList<Booking> bookings=new ArrayList<Booking>();

        ArrayList<Bus> buses=new ArrayList<Bus>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,3));
        buses.add(new Bus(3,true,4));


        for(Bus b: buses){
            b.displayBusInfo();
            
        }


        while(user_option==1){
            System.out.println("Enter 1 for booking 2 for exit");
            user_option=sc.nextInt();
            if(user_option==1){
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else{
                    System.out.println("Sorry !..Booking was full ..\n Try some other Buses ..!");
                }

            }
        }

    }
}
