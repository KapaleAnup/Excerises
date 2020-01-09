package JavaTutorials.OopsConcept;

public class Employee {


    int empId;
    String empname;
    int salary;
    int deptNo;


    public void display(){

        System.out.println(empId);
        System.out.println(empname);
        System.out.println(salary);
        System.out.println(deptNo);
    }


    public static void main(String[] args) {

    Employee employee = new Employee();
    employee.empId=001;
    employee.empname="ANup";
    employee.salary=10000;
    employee.deptNo=90;

    employee.display();


    }
}
