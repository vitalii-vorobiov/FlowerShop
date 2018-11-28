package flowers;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {

    private FlowerSpec flowerSpec;

    public Flower() {

    }

    public Flower(Flower flower) {
        flowerSpec.setColor(flower.getColor());
        price = flower.price;
        smell = flower.smell;
        country = flower.country;
    }

}
