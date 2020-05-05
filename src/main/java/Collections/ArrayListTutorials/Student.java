package Collections.ArrayListTutorials;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class  Student  {
    private String studentname;
    private int rollno;
    private int studentAge;

    public Student(String studentname, int rollno, int studentAge) {

        this.rollno = rollno;
        this.studentname = studentname;
        this.studentAge = studentAge;
    }

    public String getStudentname() {
        return studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }


   /* @Override
    public int compareTo(Student comparestu) {

        int comapareage = ((Student)comparestu ).getStudentAge();

        return this.studentAge-comapareage;
    }

    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentAge + "]";
    }

*/

    public int compareTo(Student comparestudent) {

        int compareage =((Student) comparestudent).getStudentAge();

        return this.studentAge - compareage;
    }




    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<Student>();

        arrayList.add(new Student("Anup", 11,22));
        arrayList.add(new Student("Anuja",12, 20));
        arrayList.add(new Student("Shubham",13, 25));


       // Collections.sort(arrayList);

        for (Student str :arrayList
             ) {
            System.out.println(str);
        }

    }



}
