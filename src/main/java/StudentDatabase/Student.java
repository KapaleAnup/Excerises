package StudentDatabase;

import java.util.Scanner;

public class Student {


    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tutionbalance = 0;
    private  int costOfcourse= 600;
    private static int id = 1000;
    public Student(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name :" );
        this.firstname = in.nextLine();

        System.out.println("Enter student last name :" );
        this.lastname = in.nextLine();

        System.out.println(" 1  Freshmen\n2 Biology\n3 Mathematics\n Enter the student class level:  " );
        this.gradeYear = in.nextInt();
        setStudentID();
        System.out.println(firstname + " "+ lastname + "  " + gradeYear +" " + studentID);


    }

    private void setStudentID(){

        id++;
       this.studentID =  gradeYear + " " +id;
    }

    public void Enroll() {
        System.out.print("Enter course to enroll (Q to quite): ");
        Scanner in = new Scanner(System.in);
        String courseline = in.nextLine();
        do {
            if (!courseline.equals("Q")) {
                courses = courses + " \n" + courseline;
                tutionbalance = tutionbalance + costOfcourse;
            } else {
                System.out.println("Break!!");
                break;
            }
        }
            while (1 != 0) ;

            System.out.println("Enrolled in :" + courses);
            System.out.println("TUTION balance: " + tutionbalance);
        }
    }

