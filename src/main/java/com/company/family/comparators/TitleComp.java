package main.java.com.company.family.comparators;


import main.java.com.company.family.Family;

import java.util.Comparator;


public class  TitleComp {
    public static Comparator<Family> reverseTitleComparator() {
        return Comparator
                .comparing(Family::getTitle)
                .reversed();
    }
}
