package OOPVererbung;

public class Employee implements Comparable<Employee>{
    protected String lastname;
    protected String firstname;
    protected String department;
    protected double baseSalary;

    public Employee(String lastname, String firstname, String department, double baseSalary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }



    public double getFullSalary() {
        return baseSalary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.lastname.compareTo(o.lastname);
    }
}
