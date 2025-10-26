package ua.edu.ucu.apps.lab7.flower;

import java.util.ArrayList;
import java.util.List;

public class Store {
    /** List of flower buckets. */
    private List<FlowerBucket> flowerBuckets;

    /**
     * Searches a flower in all buckets available in a store.
     * @param flowerToFind flower that is searched in a store.
     * @return a list of buckets where the flower was found.
     */
    public List<FlowerBucket> search(final Flower flowerToFind) {
        List<FlowerBucket> resultList = new ArrayList<>();
        for (FlowerBucket bucket: flowerBuckets) {
            if (bucket.contains(flowerToFind)) {
                resultList.add(bucket);
            }
        }
        return resultList;
    }
}
