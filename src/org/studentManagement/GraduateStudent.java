package org.studentManagement;

public class GraduateStudent extends Student{

    private String specialization;

    public GraduateStudent(int rollno, String name, double marks, String dept, String specialization) {
        super(rollno, name, marks, dept);
        this.specialization = specialization;
    }

    
}
