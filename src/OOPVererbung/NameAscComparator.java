package OOPVererbung;

import java.util.Comparator;

public class NameAscComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.lastname.compareTo(o1.lastname);
    }
}
