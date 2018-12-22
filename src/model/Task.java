package model;

import java.util.Date;

public class Task {

    private final String name;
    private int value;
    private Date date;
    private Person actor;

    public Task(String name, int value, Date date) {
        this.name=name;
        this.value=value;
        this.date=date;
        this.actor=null;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getActor() {
        return actor;
    }

    public void setActor(Person actor) {
        this.actor = actor;
    }
}
