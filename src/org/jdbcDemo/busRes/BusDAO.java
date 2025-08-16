package org.jdbcDemo.busRes;
import java.sql.*;
import java.awt.desktop.SystemEventListener;
import java.sql.CallableStatement;
import java.util.concurrent.Callable;


public class BusDAO {

    public void displayBusInfo() throws Exception {

        String query="select * from bus";
        Connection con = DbConnection.getConnection();

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);

        while(rs.next()){
            System.out.println("Bus no.: "+rs.getInt(1));
            if(rs.getInt(2)==0){
                System.out.println("Ac: no ");
            }
            else System.out.println("Ac: yes ");

            System.out.println("Capacity: "+rs.getInt(3));
        }
        System.out.println("---------------- end of program --------------------");
    }

    public static int getCapacity(int id) throws Exception{

        String query="select capacity from bus where id="+id;
        Connection con=DbConnection.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }

}
