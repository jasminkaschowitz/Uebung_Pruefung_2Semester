package Sortieren.Postings;

import java.util.Comparator;

public class RealnameAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return o1.getRealname().compareTo(o2.getRealname());
    }
}
