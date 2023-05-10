package edu.guilford;

import javafx.scene.layout.StackPane;

public class Square extends StackPane {

    // Attributes
    public int xcoord, ycoord;
    public String name;
    public boolean occupied;

    // Constructor

    public Square(int xcoord, int ycoord) {
        this.xcoord = xcoord;
        this.ycoord = ycoord;
        this.occupied = false;
    }

    // Getters and Setters

    public int getXcoord() {
        return this.xcoord;
    }

    public int getYcoord() {
        return this.ycoord;
    }

    public String getName() {
        return this.name;
    }

    public boolean getOccupied() {
        return this.occupied;
    }

    public void setXcoord(int xcoord) {
        this.xcoord = xcoord;
    }

    public void setYcoord(int ycoord) {
        this.ycoord = ycoord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

}
