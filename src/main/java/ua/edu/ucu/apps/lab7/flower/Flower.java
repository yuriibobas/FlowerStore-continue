package ua.edu.ucu.apps.lab7.flower;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    /** Length of a sepal. */
    @Getter
    private double sepalLength;
    /** Color of a flower. */
    private FlowerColor color;
    /** Price of a flower. */
    @Getter
    private double price;
    /** Type of a flower. */
    @Getter
    private FlowerType flowerType;

    /**
     * Flower constructor with parameter flower.
     * @param flower flower to create.
     */
    public Flower(final Flower flower) {
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
    }

    /** Flower constructor without parameters. */
    public Flower() {
    }

    public Flower(FlowerColor color, int price, int sepalLength, FlowerType type) {
        this.color = color;
        this.flowerType = type;
        this.sepalLength = sepalLength;
        this.price = price;
    }

    /** Getter for an attribute color.
     *
     * @return the flower color in string representation
     */
    public String getColor() {
        return color.toString();
    }
}
