package main.java.com.company.dups;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void removeDuplicates(String[] str) {
        LinkedHashSet<String> numSet = new LinkedHashSet<>(Arrays.asList(str));
        String[] newArray = numSet.toArray(new String[0]);
        System.out.println(Arrays.toString(newArray));
    }
}
