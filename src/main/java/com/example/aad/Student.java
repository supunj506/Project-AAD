package com.example.aad;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class Student extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("work fine post method");

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String address = req.getParameter("address");

        System.out.println(id+"\n"+name+"\n"+address);

        if(saveStudent(id,name,address)){
            System.out.println(" ADD Successfully !!!😁");

        }
        else {
            System.out.println(" Something Wrong !!!🤔");
        }


    }

    private boolean saveStudent(String id, String name, String address) {

        return false;
    }


}
