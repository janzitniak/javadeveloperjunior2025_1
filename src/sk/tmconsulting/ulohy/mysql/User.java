package sk.tmconsulting.ulohy.mysql;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String relation;
    private Date birthDate;


    // Gettery a settery
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Použivateľ: " +
                "\nid=" + id +
                "\nname='" + name  +
                "\nrelation='" + relation +
                "\nbirthDate=" + birthDate;
    }
}

