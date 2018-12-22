package model;

import javafx.scene.paint.Color;

public class Person {

    private final String name;
    private int points;
    private final Color color;

    public Person(String name, int points, Color color) {
        this.name=name;
        this.points=points;
        this.color=color;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int score) {
        this.points = score;
    }

    public Color getColor() {
        return this.color;
    }
}
