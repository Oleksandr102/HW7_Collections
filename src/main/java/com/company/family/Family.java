package main.java.com.company.family;

import java.util.Objects;

public class Family implements Comparable<Family> {


    private String name;
    private int quantityMember;
    private String title;
    private String nameOfEmblem;


    public Family(String name, int quantityMember, String title, String nameOfEmblem) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public int getQuantityMember() {
        return quantityMember;
    }


    @Override
    public int compareTo(Family o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", nameOfEmblem='" + nameOfEmblem + '\'' +
                ", quantityMember=" + quantityMember +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantityMember, title, nameOfEmblem);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
