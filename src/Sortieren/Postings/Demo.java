package Sortieren.Postings;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Posting> postings = new ArrayList<>();
        Posting posting1 = new Posting(10, "Mustermann", "m_mann", LocalDateTime.of(2021,3,10,19,30,15), 200, 50, 400);
        Posting posting2 = new Posting(87, "Tanja", "t_1995", LocalDateTime.of(2021,5,12,22,30,40), 500, 200, 600);
        Posting posting3 = new Posting(101, "Sarah", "sarah_k", LocalDateTime.of(2021,9,6,12,20,30), 100, 20, 300);
        Posting posting4 = new Posting(423, "Kimberly", "kimmy", LocalDateTime.of(2022,2,20,14,34,50), 500, 300, 1000);
        Posting posting5 = new Posting(782, "Anne", "anny_d", LocalDateTime.of(2021,5,30,10,20,50), 28, 1, 50);
        Posting posting6 = new Posting(1084, "Patrick", "patzi97", LocalDateTime.of(2021,8,1,20,15,45), 45, 5, 50);
        Posting posting7 = new Posting(455, "Nancy", "nancy_t", LocalDateTime.of(2021,9,24,15,34,22), 500, 20, 700);
        Posting posting8 = new Posting(767, "Nathalie", "natty", LocalDateTime.of(2022,1,1,6,2,23), 543, 2, 800);
        Posting posting9 = new Posting(2, "Verena", "veri_94", LocalDateTime.of(2021,7,4,10,3,12), 376, 2, 400);
        Posting posting10 = new Posting(89, "Sofie", "sofieee", LocalDateTime.of(2021,11,25,21,23,50), 245, 7, 433);

        postings.add(posting1);
        postings.add(posting2);
        postings.add(posting3);
        postings.add(posting4);
        postings.add(posting5);
        postings.add(posting6);
        postings.add(posting7);
        postings.add(posting8);
        postings.add(posting9);
        postings.add(posting10);

        Collections.sort(postings);
        System.out.println(postings.toString());
        Collections.sort(postings, new DateTimeDescComparator());
        System.out.println(postings.toString());
        Collections.sort(postings, new LikesDescSharesDescComparator());
        System.out.println(postings.toString());
        Collections.sort(postings, new LikesPerViewAscComparator());
        System.out.println(postings.toString());
        Collections.sort(postings, new RealnameAscComparator());
        System.out.println(postings.toString());
        Collections.sort(postings, new ShareLikeRatioDescComparator());
        System.out.println(postings.toString());
        Collections.sort(postings, new ViewsDescSharesAscComparator());
        System.out.println(postings.toString());
    }
}
