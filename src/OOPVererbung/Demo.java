package OOPVererbung;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        EmployeeManager em = new EmployeeManager(list);
        Employee e1 = new Employee("Kocher", "Max", "IT", 3000);
        FixCommissionEmployee f1 = new FixCommissionEmployee("Frosch", "Heinz", "IT", 2100, 300);
        PercentCommissionEmployee p1 = new PercentCommissionEmployee("Schmidt", "Theres", "HR", 3100, 0.2);
        em.addEmployee(e1);
        em.addEmployee(f1);
        em.addEmployee(p1);
        //Collections.sort(list, new DepartmentAscNameDescComparator());
        Collections.sort(list);
        System.out.println(list.toString());
        System.out.println(em.calcTotalSalary());
        System.out.println(em.getSalaryByDepartment());



    }
}
