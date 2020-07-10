package main.java.com.company;


import main.java.com.company.family.Execut;

import static main.java.com.company.dups.RemoveDuplicates.removeDuplicates;

public class Main {

    public static void main(String[] args) {
        char str[] = "121234452361".toCharArray();
        System.out.println(removeDuplicates(str));

       Execut.run();

    }
}
