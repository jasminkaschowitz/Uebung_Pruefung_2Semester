package Sortieren.Postings;

import java.util.Comparator;

public class LikesPerViewAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        double werto1 = (double) o1.getLikes()/ (double) o1.getViews();
        double werto2 = (double) o2.getLikes()/(double) o2.getViews();
        return Double.compare(werto1, werto2);
    }
}
