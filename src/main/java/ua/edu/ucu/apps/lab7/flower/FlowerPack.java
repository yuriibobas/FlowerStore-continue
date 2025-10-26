package ua.edu.ucu.apps.lab7.flower;

public class FlowerPack {
    /** An attribute of a class Flower. */
    private Flower flower;
    /** Quantity of flowers in a pack. */
    private int quantity;

    /**
     * FlowerPack constructor.
     * @param someFlower flower that is a part of that flower pack.
     * @param someQuantity amount of flowers in a pack.
     */
    public FlowerPack(final Flower someFlower, final int someQuantity) {
        this.flower = new Flower(someFlower);
        this.quantity = someQuantity;
    }

    /**
     * Method for getting a price of a flower pack.
     * @return price of a flower pack
     */
    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    /**
     * Checks whether the flower is in the pack.
     * @param flowerToFind flower that is checked by the existence in a pack.
     * @return boolean value identifying the existence of a flower in the pack.
     */
    public boolean contains(final Flower flowerToFind) {
        return this.flower.equals(flowerToFind);
    }
}
