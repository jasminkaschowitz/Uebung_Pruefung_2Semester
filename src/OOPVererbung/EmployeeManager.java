package OOPVererbung;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    private ArrayList<Employee> list;

    public EmployeeManager(ArrayList<Employee> list) {
        this.list = list;
    }

    public double calcTotalSalary() {
        double sum = 0;
        for (Employee e:list) {
            sum += e.getFullSalary();

        }
        return sum;
    }

    public void addEmployee(Employee e) {
        list.add(e);
    }

    public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> getSalaryByDepartment = new HashMap<>();
        for (Employee e:list) {
            if (getSalaryByDepartment.containsKey(e.department)) {
                double wert = getSalaryByDepartment.get(e.department);
                getSalaryByDepartment.put(e.department, wert + e.getFullSalary());
            }

                else {
                    getSalaryByDepartment.put(e.department, e.getFullSalary());

            }

        }
        return getSalaryByDepartment;
    }


}
