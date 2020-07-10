package main.java.com.company.family;


import java.util.Comparator;

public class EmblemComp {

    public static Comparator<Family> sortByEmblem() {
        return Comparator
                .comparingInt(o -> o.getNameOfEmblem().length());
    }
}
