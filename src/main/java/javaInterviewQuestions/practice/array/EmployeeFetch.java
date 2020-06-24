package javaInterviewQuestions.practice.array;

public class EmployeeFetch {

    public static void main(String[] args) {

        Employee[] employees;
        employees = new Employee[5];

        employees[0]= new Employee("Anup", 1234);
        employees[1] = new Employee("sarika ", 3333);

        employees[2] = new Employee("AssignmentOne ", 12);

        employees[3] = new Employee("Dummy ", 23);

        employees[4] = new Employee("igore ", 34);


        for (int i= 0; i<employees.length;i++){
            System.out.println("Employee at "+ i + ":" +"Name is : "+ employees[i].employeeName + ": " +"employee id is: "+employees[i].employeeId);
        }

    }
}
