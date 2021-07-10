package com.ranzan.idenditycardproblemcontinuation;

public class Person {
    private String companyName;
    private int age;
    private String profession;
    private int imageID;

    public Person(String companyName, int age, String profession, int imageID) {
        this.companyName = companyName;
        this.age = age;
        this.profession = profession;
        this.imageID = imageID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public int getImageID() {
        return imageID;
    }
}
