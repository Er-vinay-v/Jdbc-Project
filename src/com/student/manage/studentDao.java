package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentDao {
    public static boolean insertstudentToDB(student st){
        boolean f=false;
        try {
            // jdbc code...
            Connection con=cp.createC();
            String q="insert into students(sname,sphone,scity) values(?,?,?)";
            //preparedStatement
            PreparedStatement pstmt=con.prepareStatement(q);

            //set the value of parameter
            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3,st.getStudentCity());
            //execute...
            pstmt.executeUpdate();
            f=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deletestudent(int userId) {
        boolean f=false;
        try {
            // jdbc code...
            Connection con=cp.createC();
            String q="delete from students where sid=?";
            //preparedStatement
            PreparedStatement pstmt=con.prepareStatement(q);

            //set the value of parameter
            pstmt.setInt(1, userId);
            //execute...
            pstmt.executeUpdate();
            f=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean showAllstudent() {
        boolean f=false;
        try {
            // jdbc code...
            Connection con=cp.createC();
            String q="select * from students;";
           Statement stmt=con.createStatement();

           ResultSet set=stmt.executeQuery(q);

           while (set.next()){
               int id=set.getInt(1);
               String name=set.getString(2);
               String Phone=set.getString(3);
               String city=set.getString("scity");

               System.out.println("ID :"+id);
               System.out.println("Name : "+name);
               System.out.println("phone :"+Phone);
               System.out.println("city :"+city);
               System.out.println("_________________________________________");

           }

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
