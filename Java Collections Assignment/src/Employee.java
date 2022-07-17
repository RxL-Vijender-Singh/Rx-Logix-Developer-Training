import java.util.Comparator;

public class Employee {
    private String name;
    private int departmentId;
    private int employeeId;
    public Employee(String name, int employeeId, int departmentId){
        this.name = name;
        this.employeeId = employeeId;
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", employeeId=" + employeeId +
                '}';
    }

}

class SortByEmployeeName implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return -1*(e1.getName().compareTo(e2.getName()));
    }
}

class SortByEmployeeId implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getEmployeeId() - e2.getEmployeeId();
    }
}

class SortByEmployeeDepartmentId implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getDepartmentId()-e2.getDepartmentId();
    }
}

