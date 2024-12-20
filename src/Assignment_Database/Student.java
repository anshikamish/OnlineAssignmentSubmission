/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Database;

/**
 *
 * @author ajay4
 */
public class Student {
    public String EnrollNo,Assignmentno,ans1,ans2,ans3,ans4,ans5;
    
    
    public Student(String EnrollNo ,String Assignmentno,String ans1,String ans2,String ans3,String ans4,String ans5 ){
      this.EnrollNo= EnrollNo;
      this.Assignmentno=Assignmentno;
      this.ans1=ans1;
      this.ans2=ans2;
      this.ans3=ans3;
      this.ans4=ans4;
      this.ans5=ans5;
      
     
    }
    public String getEnroll(){
        return EnrollNo ;
    } 
    public String getAns1(){
        return ans1 ;
    }
    public String assignmenetNo(){
        return Assignmentno;
    }
     public String getAns2(){
         return ans2;
     }
     public String getAns3(){
         return ans3;
     }
     public String getAns4(){
         return ans4;
     }
     public String getAns5(){
         return ans5;
     }

}
