package main.java.com.company.family;

import java.util.Map;
import java.util.TreeMap;

public class Execut {
    public static void run(){
        familyRealization();
    }
    public static void familyRealization() {
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
        for (Map<Family, Integer> map : maps) {
            map.put(new Family("Dan", 52, "Beer", "Freeman"), 0);
            map.put(new Family("Leroy", 44, "Jenkins", "Foul"), 0);
            map.put(new Family("Baal", 88, "==Skull==", "Daemon"), 0);
            map.put(new Family("Zero", 92, "Knife", "TreasureHunter"), 0);
            map.put(new Family("Ironman", 72, "====Steel====", "Hero"), 0);
            map.put(new Family("Artur", 45, "=====Stone=====", "King"), 0);
            map.put(new Family("Axton", 63, "=======Ghost=======", "Sniper"), 0);
            map.put(new Family("Salvador", 12, "========Shotgun========", "Gunzerker"), 0);
            map.put(new Family("Maya", 94, "Cry", "Syrena"), 0);
            map.put(new Family("Cat", 516, "Mr", "Justcat"), 0);
        }
    }
    public static void printMap(Map<Family, Integer> map) {
        map.forEach((Family, Integer) -> System.out.println(Family));
    }
}

