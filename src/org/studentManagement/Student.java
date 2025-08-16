package org.studentManagement;

public class Student{
    int rollno;
    String name;
    double marks;
    String dept;

    public Student(int rollno, String name, double marks, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.dept = dept;
    }

    public int getRollno() {
        return rollno;
    }


    public String getName() {
        return name;
    }


    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if(marks>=0 && marks<=100){
            this.marks = marks;
        }
        else{
            System.out.println("Marks cannot be Negative");
        }

    }

    public String getDept() {
        return dept;
    }

}
