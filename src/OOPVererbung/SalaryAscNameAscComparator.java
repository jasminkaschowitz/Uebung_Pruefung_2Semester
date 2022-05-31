package OOPVererbung;

import java.util.Comparator;

public class SalaryAscNameAscComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (Double.compare(o1.getFullSalary(), o2.getFullSalary()) == 0) {
            return o2.lastname.compareTo(o1.lastname);
        }
        return Double.compare(o2.getFullSalary(), o1.getFullSalary());

    }
}
