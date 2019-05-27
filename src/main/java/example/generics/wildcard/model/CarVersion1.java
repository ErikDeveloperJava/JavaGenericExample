package example.generics.wildcard.model;

import lombok.*;

public class CarVersion1 extends Car {

    private String color;

    private int fireWoodCount;

    public CarVersion1(int maxSpeed, int weight, String color, int fireWoodCount) {
        super(maxSpeed, weight);
        this.color = color;
        this.fireWoodCount = fireWoodCount;
    }
}