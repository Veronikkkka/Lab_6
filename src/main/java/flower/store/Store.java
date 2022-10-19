package flower.store;

import java.util.ArrayList;

public class Store {
    public ArrayList<FlowerBucket> availableBuckets = new ArrayList<>();
    private int sumOfPrice;

    public Store() {
        for (int i = 0; i < availableBuckets.size(); i++) {
            sumOfPrice += availableBuckets.get(i).getPrice();
        }
    }

    public int search() {
        System.out.println("Now in our store is available: ");
        for (int i = 0; i < availableBuckets.size(); i++) {
            System.out.print(i + 1 + ") " + availableBuckets.get(i));
            System.out.println("Price - " + availableBuckets.get(i).getPrice());
        }
        return sumOfPrice;
    }

    public void add(FlowerBucket bucket1) {
        availableBuckets.add(bucket1);
        this.sumOfPrice += bucket1.getPrice();
    }

    public FlowerBucket getBucket(int i) {
        return availableBuckets.get(i);
    }
}
