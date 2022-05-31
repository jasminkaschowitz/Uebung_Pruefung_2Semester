package OOPVererbung;

import java.util.Comparator;

public class SalaryDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getFullSalary(), o2.getFullSalary());
    }
}
