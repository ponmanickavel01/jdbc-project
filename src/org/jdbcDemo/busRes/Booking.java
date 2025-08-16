package org.jdbcDemo.busRes;

import org.w3c.dom.CDATASection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.*;
public class Booking {
    String pass_name;
    int busNo;
    Date date;

    Booking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Passenger name: ");
        pass_name=sc.next();
        System.out.println("Enter Bus no: ");
        busNo=sc.nextInt();
        System.out.println("Enter data in (dd-mm-yyyy) format");
        String dateInput=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean  isAvailable() throws Exception {

        BusDAO  busdao=new BusDAO();
        BookingDAO bookingdao=new BookingDAO();
        int capacity= busdao.getCapacity(busNo);

        int booked=bookingdao.getBookingCount(busNo, date);

        return booked < capacity;
    }
}
