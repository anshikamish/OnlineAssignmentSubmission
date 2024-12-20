/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Database;

/**
 *
 * @author ajay4
 */
public class Teacher {
    public String subjectCode,assignmentQuestion,Que2,Que3,Que4,Que5;
    public String assignmentNo;
    
    public Teacher(String assignmentNo ,String subjectCode,String assignmentQuestion,String Que2,String Que3,String Que4,String Que5 ){
      this.subjectCode= subjectCode;
      this.assignmentQuestion=assignmentQuestion;
      this.assignmentNo=assignmentNo;
      this.Que2=Que2;
      this.Que3=Que3;
      this.Que4=Que4;
      this.Que5=Que5;
      
     
    }
    public String getSubjectCode(){
        return subjectCode ;
    } 
    public String getquestions(){
        return assignmentQuestion ;
    }
    public String assignmenetNo(){
        return assignmentNo;
    }
     public String question2(){
         return Que2;
     }
     public String question3(){
         return Que3;
     }
     public String question4(){
         return Que4;
     }
     public String question5(){
         return Que5;
     }
}


