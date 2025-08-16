package org.jdbcDemo.busRes;
import java.util.Date;
import java.sql.*;

public class BookingDAO {
    public int getBookingCount(int busNo,Date date) throws Exception {

        String query="select count(pass_name) from booking where bus_no=? and travel_date=?";
        Connection con=DbConnection.getConnection();
        PreparedStatement pst=con.prepareStatement(query);
        //convert java util date to sql date
        java.sql.Date sqldate=new java.sql.Date(date.getTime());
        pst.setInt(1,busNo);
        pst.setDate(2,sqldate);
        ResultSet rs=pst.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }

    public void addBooking(Booking booking) throws Exception{
        String query="Insert into booking values(?,?,?)";
        Connection con=DbConnection.getConnection();
        PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1,booking.pass_name);
        pst.setInt(2,booking.busNo);

        //convert java util date to sql date
        java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
        pst.setDate(3,sqldate);

        pst.executeUpdate();

    }
}
