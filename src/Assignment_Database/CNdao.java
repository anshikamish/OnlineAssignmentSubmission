/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ajay4
 */
public class CNdao {
    public String insert(Student s){
         String str="insert into cn(EnrollNo,Assignmentno,ans1,ans2,ans3,ans4,ans5) values(?,?,?,?,?,?,?)";
          Assdb db=new Assdb();
        try{
           Connection con= db.getConnection();
           System.out.println("connected"); 
           PreparedStatement psmt=con.prepareStatement(str);//user se runtime mai query ki values ko lene k liye we use PreparedStatement
           psmt.setString(1,s.getEnroll());
           psmt.setString(2, s.assignmenetNo());
           psmt.setString(3,s.getAns1());
           psmt.setString(4, s.getAns2());
           psmt.setString(5, s.getAns3());
           psmt.setString(6, s.getAns4());
           psmt.setString(7, s.getAns5());
           int rno=psmt.executeUpdate();
           return rno+" record inserted";

        }
        catch(Exception e){
        e.printStackTrace();
        return e.getMessage();
    
     }
     }
         
}
