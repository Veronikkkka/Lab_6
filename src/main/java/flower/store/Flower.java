package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;

    public Flower(){

    }
    public Flower(double sepalLength_, FlowerColor color_, double price_){
        this.price = price_;
        this.color = color_;
    }

    public String getColor() {
        return color.toString();
    }
}
