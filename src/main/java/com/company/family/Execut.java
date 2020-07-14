package main.java.com.company.family;

import main.java.com.company.family.comparators.EmblemComp;
import main.java.com.company.family.comparators.TitleComp;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import static main.java.com.company.dups.RemoveDuplicates.removeDuplicates;

public class Execut {
    public static void run() {
        executable();
    }

    public static void executable() {
        String[] str = {"1", "2", "1", "2", "3", "4", "4", "5", "2", "3", "6", "1"};
        System.out.println(Arrays.toString(str));
        removeDuplicates(str);

        Map<Family, Integer> familyMap = new TreeMap<>();
        Map<Family, Integer> titles = new TreeMap<>(TitleComp.reverseTitleComparator());
        Map<Family, Integer> emblems = new TreeMap<>(EmblemComp.sortByEmblem());

        dropMap(familyMap, titles, emblems);

        System.out.println("Map:");
        familyMap.forEach((((family, integer) -> System.out.println(integer + " : " + family))));

        System.out.println("Sort by title: ");
        printMap(titles);
        System.out.println("Sort by emblems: ");
        printMap(emblems);
    }

    public static void dropMap(Map<Family, Integer>... maps) {
        for (Map<Family, Integer> familyMap : maps) {
            familyMap.put(new Family("Bro", 52, "Yo", "Net"), 0);
            familyMap.put(new Family("Chill", 44, "Sleep", "Set"), 0);
            familyMap.put(new Family("Nuts", 88, "Bet", "Wet"), 0);
            familyMap.put(new Family("Ill", 92, "Knife", "Get"), 0);
            familyMap.put(new Family("Dead", 72, "Wire", "Trip"), 0);
            familyMap.put(new Family("Monster", 45, "Kill", "Oops"), 0);
            familyMap.put(new Family("Dreak", 63, "Low", "Swim"), 0);
            familyMap.put(new Family("Doctor", 12, "Surgeon", "Glad"), 0);
            familyMap.put(new Family("Micro", 94, "Macro", "Nasty"), 0);
            familyMap.put(new Family("Boy", 516, "Skill", "Gret"), 0);
        }
    }

    public static void printMap(Map<Family, Integer> map) {
        map.forEach((Family, Integer) -> System.out.println(Family));
    }
}

