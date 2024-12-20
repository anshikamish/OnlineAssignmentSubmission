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
public class Tdao {
    public String insert(Teacher t){
        String sqlStr="insert into assignment(assignmentNo,subjectCode,assignmentQuestion,Que2,Que3,Que4,Que5) values(?,?,?,?,?,?,?)";
        Assdb db=new Assdb();
        try{
           Connection con= db.getConnection();
           System.out.println("connected"); 
           PreparedStatement psmt=con.prepareStatement(sqlStr);//user se runtime mai query ki values ko lene k liye we use PreparedStatement
           psmt.setString(1,t.assignmenetNo());
           psmt.setString(2, t.getSubjectCode());
           psmt.setString(3,t.getquestions());
           psmt.setString(4, t.question2());
           psmt.setString(5, t.question3());
           psmt.setString(6, t.question4());
           psmt.setString(7, t.question5());
           int rno=psmt.executeUpdate();
           return rno+" record inserted";

        }
        catch(Exception e){
        e.printStackTrace();
        return e.getMessage();
    
     }
    }
}
