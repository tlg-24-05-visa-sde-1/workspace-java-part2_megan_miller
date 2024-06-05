package com.crisp;

/*
 * Natural order is defined by size, a double.
 * Size is the "sort key"
 */
public class Radish implements Comparable<Radish> {
    private String color;
    private double size;
    private double tailLength;
    private int sproutsOnTop;

    // constructors

    public Radish(String color, double size, double tailLength, int sproutsOnTop) {
        setColor(color);
        setSize(size);
        setTailLength(tailLength);
        setSproutsOnTop(sproutsOnTop);
    }

    // business methods

    // accessor methods

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getSproutsOnTop() {
        return sproutsOnTop;
    }

    public void setSproutsOnTop(int sproutsOnTop) {
        this.sproutsOnTop = sproutsOnTop;
    }

    @Override  // interface comparable
    public int compareTo(Radish other) {
        return Double.compare(this.getSize(), other.getSize());
    }

    @Override
    public String toString(){
        return new String("Radish Color: " + getColor() + "Radish Size: " + getSize() +
                "Radish Tail Length: " + getTailLength() + "Radish Sprouts on Top: " + getSproutsOnTop());
    }
}
