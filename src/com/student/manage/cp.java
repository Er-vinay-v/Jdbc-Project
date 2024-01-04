package com.student.manage;



import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class cp {
    static Connection con;
    public static Connection createC(){
       try {
           //load the driver
          forName("com.mysql.jdbc.Driver");
          String url="jdbc:mysql://localhost:3306/student_manage";
          String user="root";
          String password="Vinay@2002";
          con= DriverManager.getConnection(url,user,password);
       }catch (Exception e){
           e.printStackTrace();
       }
       return con;
    }

}
