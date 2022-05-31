package Sortieren.Postings;

import java.util.Comparator;

public class ShareLikeRatioDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        double werto1 = (double) o1.getShares()/(double) o1.getLikes();
        double werto2 = (double) o2.getShares()/(double) o2.getLikes();
        return Double.compare(werto2, werto1);
    }
}
