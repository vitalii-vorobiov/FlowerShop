package flowers;

import lombok.Getter;

public class FlowerGroup {

    private Flower flower;
    @Getter
    private int quantity;

    public FlowerGroup(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
