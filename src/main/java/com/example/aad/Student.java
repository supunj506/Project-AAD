package com.example.aad;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("work fine post method");

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String address = req.getParameter("address");

        System.out.println(id + "\n" + name + "\n" + address);

//        try {
//            if (saveStudent(id, name, address)) {
//                System.out.println(" ADD Successfully !!!😁");
//
//            } else {
//                System.out.println(" Something Wrong !!!🤔");
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            throw new RuntimeException(e);
//        }


    }

    private boolean saveStudent(String id, String name, String address) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aad", "root", "1234");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO student VALUES (?,?,?)");

//        statement.setString(1, id);
//        statement.setString(2, name);
//        statement.setString(3, address);
//        return statement.executeUpdate() > 0;
        return false;

    }


}
