package org.jdbcDemo;

import java.awt.desktop.SystemEventListener;
import java.sql.*;
import java.util.concurrent.Callable;

public class JdbcDemo {


    public static void main(String[] args) throws Exception {
            batchdemo();
            sp();
    }

    public static void readData() throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="Pmv@28122002";
        String query="select * from employee";
        Connection con= DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);

        while(rs.next()) {
            System.out.println("Id: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Salary: " + rs.getInt(3));
        }
        con.close();

    }


    //insertData
    public static void insertData() throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="Pmv@28122002";


        int id=5;
        String name="Kiren";
        int salary=300000;
        String query="insert into employee values(" +id+ ",'" + name + "'," +salary +" );";


        Connection con= DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();        // 1. Normal Statement
        int row=st.executeUpdate(query);

        System.out.println("No. of rows affects: "+row);
        con.close();

    }

    //insert data using Prepared Statement
    public static void insertUsingPst() throws Exception {   //Prepared Statement
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String user = "root";
        String password = "Pmv@28122002";


        int id = 6;
        String name = "Komala";
        int salary = 100000;
        String query = "insert into employee values(?,?,?);";


        Connection con = DriverManager.getConnection(url, user, password);


        PreparedStatement pst=con.prepareStatement(query);     // 2. prepared Statement
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setInt(3,salary);
        int row= pst.executeUpdate();

        System.out.println("No. of rows affected: "+row);
        con.close();

    }

    //delete
    public static void delete() throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String user = "root";
        String password = "Pmv@28122002";


        int id = 6;

        String query = "delete from employee where empid= "+id ;


        Connection con = DriverManager.getConnection(url, user, password);
        Statement st=con.createStatement();
        int row=st.executeUpdate(query);

        System.out.println("No. of rows affected: "+row);
        con.close();

    }

    //update
    public static void  update() throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String user = "root";
        String password = "Pmv@28122002";


        String query = "update employee set salary=150000 where empid=1";


        Connection con = DriverManager.getConnection(url, user, password);
        Statement st=con.createStatement();
        int row=st.executeUpdate(query);

        System.out.println("No. of rows affected: "+row);
        con.close();

    }


    //Types of Statement
    // 1. Normal Statement
    // 2. Prepared Statement
    // 3. Callable Statement


    //Simple stored procedure
    public static void sp() throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="Pmv@28122002";

        Connection con=DriverManager.getConnection(url,user,password);

        CallableStatement cst=con.prepareCall("{call GetEmp()}");
        ResultSet rs=cst.executeQuery();

        while(rs.next()){
            System.out.println("Id is: "+rs.getInt(1));
            System.out.println("Name is: "+rs.getString(2));
            System.out.println("Salary is: "+rs.getInt(3));

        }
    }


    //Stored procedure with id

    public static void spbyid() throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="Pmv@28122002";

        Connection con=DriverManager.getConnection(url,user,password);

        int id=3;
        CallableStatement cst=con.prepareCall("{call GetEmpbyId(?)}");
        cst.setInt(1,id);
        ResultSet rs=cst.executeQuery();

        while(rs.next()){
            System.out.println("Id is: "+rs.getInt(1));
            System.out.println("Name is: "+rs.getString(2));
            System.out.println("Salary is:"+rs.getInt(3));
        }
        con.close();
    }

    //call by storing the name into some
    public static void  sp3() throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="Pmv@28122002";

        //establish connection
        Connection con=DriverManager.getConnection(url,user,password);

        int id=3;
        CallableStatement cst=con.prepareCall("{call GetNamebyId(?,?)}");
        cst.setInt(1,id);
        cst.registerOutParameter(2,Types.VARCHAR);
        cst.executeUpdate();
        System.out.println(cst.getString(2));

    }

    //commit vs auto commit
    public static void sp4commit() throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String pass="Pmv@28122002";

        String query1="update employee set salary=55000 where empid=1";
        String query2="update employee set salary=55000 where empid=2";

        Connection con=DriverManager.getConnection(url,user,pass);
        con.setAutoCommit(false);
        Statement st=con.createStatement();
        int row1=st.executeUpdate(query1);
        int row2=st.executeUpdate(query2);

        System.out.println("rows affected: "+row1);
        System.out.println("rows affected: "+row2);

        if(row1>0 && row2>0){
            con.commit();
        }
    }

    //batchwise commit

    public static void batchdemo() throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String user = "root";
        String pass = "Pmv@28122002";

        String query1="update employee set salary = 500000 where empid=1";
        String query2="update employee set salary = 500000 where empid=2";
        String query3="update employee set salary = 500000 where empid=3";
        String query4="update employee set salary = 500000 where empid=4";


        Connection con = DriverManager.getConnection(url, user, pass);
        con.setAutoCommit(false);
        Statement st=con.createStatement();
        st.addBatch(query1);
        st.addBatch(query2);
        st.addBatch(query3);
        st.addBatch(query4);


        int[] res=st.executeBatch();
        for(int i:res){
            if(i>0) continue;
            else{
                con.rollback();
            }
        }
        con.commit();



    }
    
}



