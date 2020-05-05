package Collections.ArrayListTutorials;

import java.util.ArrayList;

public class convertTostring {

    private String studentname;
    private  int studentage;

    public convertTostring(String studentname , int age){

        this.studentname = studentname;
        this.studentage = age;

    }

    @Override
    public String toString(){
        return "Name is :" + this.studentname + " & Age is :" + this.studentage;
    }


    public static void main(String[] args) {

        ArrayList<convertTostring> addstudent = new ArrayList<>();
        addstudent.add(new convertTostring("Anup", 24));
        addstudent.add(new convertTostring("Amit", 26));


        for (convertTostring temp : addstudent
             ) {
            System.out.println(addstudent);
        }
    }
}
