package Assignment_Database;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author ajay4
 */
public class Assdb {
     public Connection getConnection()throws Exception{
       Class.forName( "com.mysql.cj.jdbc.Driver");//driver ko memory mai load krna jo ki Class.forName krega
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assdb","root","root");//
       System.out.println("database connected");
       return con;
    }
    }