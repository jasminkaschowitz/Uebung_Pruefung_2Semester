package Sortieren.Postings;

import java.util.Comparator;

public class ViewsDescSharesAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        int result = Integer.compare(o2.getViews(), o1.getViews());
        if (result == 0) {
            return Integer.compare(o1.getShares(), o2.getShares());
        }
        return result;
    }
}
