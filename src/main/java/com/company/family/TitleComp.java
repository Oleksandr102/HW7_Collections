package main.java.com.company.family;


import java.util.Comparator;


public class TitleComp {
    public static Comparator<Family> reverseTitleComparator() {
        return Comparator
                .comparing(Family::getTitle)
                .reversed();
    }
}
