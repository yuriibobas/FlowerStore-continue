package ua.edu.ucu.apps.lab7.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    /** List of flower packs. */
    private List<FlowerPack> flowerPacks;

    /** FlowerBucket constructor. */
    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    /**
     * Method for getting a price of a bucket.
     * @return the price of a bucket
     */
    public double getPrice() {
        return flowerPacks.stream()
            .mapToDouble(pack -> pack.getPrice()).sum();
    }

    /**
     * Checks whether the flower is in the bucket.
     * @param flowerToFind flower that is checked by the existence in a bucket.
     * @return boolean value identifying the existence of a flower in a bucket.
     */
    public boolean contains(final Flower flowerToFind) {
        for (FlowerPack pack: flowerPacks) {
            if (pack.contains(flowerToFind)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method for adding a flower pack to the flower bucket.
     * @param flowerPack pack to add to the bucket.
     */
    public void add(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
}
