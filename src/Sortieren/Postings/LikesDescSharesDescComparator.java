package Sortieren.Postings;

import java.util.Comparator;

public class LikesDescSharesDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        int result = Integer.compare(o2.getLikes(), o1.getLikes());
        if (result == 0) {
           return Integer.compare(o2.getShares(), o1.getShares());
        }
        return result;

    }
}
