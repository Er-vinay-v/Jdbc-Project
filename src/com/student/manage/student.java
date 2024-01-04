package com.student.manage;

public class student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public student(int studentId,String studentName,String studentPhone,String studentCity){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentPhone=studentPhone;
        this.studentCity=studentCity;
    }
    public student(String studentName,String studentPhone,String studentCity){
        this.studentName=studentName;
        this.studentPhone=studentPhone;
        this.studentCity=studentCity;
    }
    public student(){

    }
    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentPhone(){
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }
    public String getStudentCity(){
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString(){
        return "Student [studentId=" + studentId +",studentName=" + studentName +", studentPhone=" + studentPhone +",studentCity=" + studentCity + "]";
    }
}
