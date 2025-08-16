package org.busReserve;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
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

    public boolean  isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusno()==busNo){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for(Booking b:bookings ){
            if(b.busNo==busNo && b.date.equals(date)){
                booked++;
            }
        }
        return booked < capacity ? true:false;
    }
}
