import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
     ArrayList<Employee> list =new ArrayList<Employee>();
         list.add(new Employee(1,"Ankit", 50000));
         list.add(new Employee(2,"Vikas", 60000));
         list.add(new Employee(3,"Rahul", 55000));
         list.add(new Employee(4,"Amit", 70000));
         list.add(new Employee(5,"Sumit", 65000));
         List<String> employeeNames = list.stream()
                 .filter(emp -> emp.salary > 55000)
                 .map(emp -> emp.name)
                 .collect(Collectors.toList()); 
            System.out.println("Employees with salary greater than 55000: " + employeeNames);
}
}