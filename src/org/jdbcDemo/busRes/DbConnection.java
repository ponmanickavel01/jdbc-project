package org.jdbcDemo.busRes;

import java.sql.*;

public class DbConnection {

    private static final String url = "jdbc:mysql://localhost:3306/busreserv";// database busreserv
    private static final String user = "root";
    private static final String pass = "Pmv@28122002";


        public static Connection getConnection() throws Exception{
            return DriverManager.getConnection(url,user,pass);
        }

}
