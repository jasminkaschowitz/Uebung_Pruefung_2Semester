package Uebungsabende.Einwohner;

import java.util.Comparator;

public class GeburtsjahrNameComparator implements Comparator<Einwohner> {

    @Override
    public int compare(Einwohner o1, Einwohner o2) {
       if(Integer.compare(o2.getGeburtsjahr(), o1.getGeburtsjahr()) == 0) {
           return o1.getName().compareTo(o2.getName());
       }
        return Integer.compare(o2.getGeburtsjahr(), o1.getGeburtsjahr());
    }


}
