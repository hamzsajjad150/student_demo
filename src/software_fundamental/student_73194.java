/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_fundamental;

/**
 *
 * @author khanh
 */
public class student_73194 {
    private int studId;
    private String studName;

    public student_73194() {
    }

    public student_73194(int studId, String studName) {
        this.studId = studId;
        this.studName = studName;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }
    
    public static void main(String[] args) {
        student_73194 s1 = new student_73194();
        student_73194 s2 = new student_73194(2, "Hamza");
        
        student_73194 [] studentList = new student_73194[5];
        
        studentList[0] = s1;
        studentList[1] = s2;
        for (int i = 0; i < studentList.length; i++){
            System.out.println("student name: " + studentList[i].getStudName()); 
            System.out.println("student id " + studentList[i].getStudId()); 
        }
    }
}
