package OOPVererbung;

import java.util.Comparator;

public class DepartmentAscNameDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.department.compareTo(o2.department) == 0) {
            return o2.lastname.compareTo(o2.lastname);
        }
        return o2.department.compareTo(o1.department);
    }
}
