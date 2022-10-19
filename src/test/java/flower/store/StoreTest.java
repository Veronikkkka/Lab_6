package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private Store store;
    private  FlowerBucket bucket1;
    private  FlowerBucket bucket2;

    @BeforeEach
    public void init() {
        flower = new Flower();
        FlowerPack pack_rose = new FlowerPack(new Rose(), 3);
        FlowerPack pack_tulip = new FlowerPack(new Tulip(), 4);
        bucket1 = new FlowerBucket();
        bucket2 = new FlowerBucket();
        bucket2.add(pack_rose);
        bucket1.add(pack_rose);

        this.store = new Store();
        store.add(bucket2);
        bucket1.add(pack_tulip);
        store.add(bucket1);
    }

    @Test
    public void testSearch() {
        int sum = store.search();
        Assertions.assertEquals(bucket2, store.getBucket(0));
        Assertions.assertEquals(bucket1, store.getBucket(1));
        Assertions.assertEquals(520.0, sum);
    }


}
