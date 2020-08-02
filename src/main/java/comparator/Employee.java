package comparator;


import java.util.Comparator;

public class Employee {


    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


//    @Override
//    public int compareTo(Employee emp) {
//         return (this.id - emp.id);
//    }
//
//    @Override
//    //this is required to print the user-friendly information about the Employee
//    public String toString() {
//        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
//                this.salary + "]";
//    }

    public static Comparator<Employee> nameTest = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());

        }
    };
}
