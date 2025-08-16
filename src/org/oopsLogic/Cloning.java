package org.oopsLogic;

class Department implements Cloneable{
    int deptId;
    String name;

    public Department(int deptId, String name) {
        this.deptId = deptId;
        this.name = name;
    }

    public void display() {
        System.out.println("Dept id: "+deptId);
        System.out.println("Dept Name: "+name);
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Student implements Cloneable{     //to give permission for cloning u  should give Implements Cloneable
    int id;
    String name;
    Department dept;

    public Student(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    void display(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
        dept.display();
    }

    protected Object clone() throws CloneNotSupportedException {
        Student s=(Student)super.clone();
        s.dept = (Department) s.dept.clone();  //deep copy so that dept canot be changed when cloning
        return s;
    }
}


public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dept=new Department(1,"cse");
        Student s1=new Student(1,"sam",dept);
        Student s2=(Student)s1.clone();

        dept.name="IT";
        s1.display();
        s2.display();

    }
}
