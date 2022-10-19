package flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class FlowerBucket {
    public double price;

    public ArrayList<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack pack) {
        this.flowerPacks.add(pack);
        this.setPrice(this.getPrice() + pack.getPrice());
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < flowerPacks.size(); i++) {
            result += flowerPacks.get(i) + "\n";
        }
        return result;
    }
}
