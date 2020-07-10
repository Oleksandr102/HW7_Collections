package main.java.com.company.family;

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

//        reverseTitleComparator();
//        lengthNameOfEmblemComparator();
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


}
