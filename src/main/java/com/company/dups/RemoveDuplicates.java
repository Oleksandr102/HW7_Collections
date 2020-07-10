package main.java.com.company.dups;

import java.util.Arrays;

public class RemoveDuplicates {
    public static String removeDuplicates(char str[]) {
        int index = 0;
        int j;
        for (int i = 0; i < str.length; i++) {
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
}
