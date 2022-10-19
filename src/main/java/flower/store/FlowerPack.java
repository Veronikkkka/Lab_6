package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower_, int quantity_) {
        flower = flower_;
        quantity = quantity_;
    }

    public FlowerPack() {

    }

    public double getPrice(){
        return flower.getPrice() * quantity;
    }
}
