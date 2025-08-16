package org.jdbcDemo.busRes;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) throws Exception {


        BusDAO busdao=new BusDAO();
        busdao.displayBusInfo();

        int user_option=1;
        Scanner sc=new Scanner(System.in);

//
//
        while(user_option==1){
            System.out.println("Enter 1 for booking 2 for exit");
            user_option=sc.nextInt();
            if(user_option==1){
                Booking booking=new Booking();
                if(booking.isAvailable()){
                    BookingDAO bookingdao= new BookingDAO();
                    bookingdao.addBooking(booking);
                    System.out.println("Your booking is confirmed");
                }
                else{
                    System.out.println("Sorry !..Booking was full ..\n Try some other Buses ..!");
                }

            }
        }

    }
}
