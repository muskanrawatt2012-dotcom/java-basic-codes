import java.util.*;

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public void show() { System.out.println("Employee: " + name); }
}

class Department {
    private String deptName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String deptName) { this.deptName = deptName; }
    public void addEmployee(Employee e) { employees.add(e); }
    public void showDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) e.show();
    }
}

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) { this.name = name; }

    public void addDepartment(Department d) { departments.add(d); }

    public void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) d.showDept();
    }
}

public class CompanySystem {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));

        comp.addDepartment(dev);
        comp.showCompany();
    }
}
