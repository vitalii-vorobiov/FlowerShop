package flowers;

import java.util.ArrayList;

public class FlowerBucket {

    private ArrayList<FlowerGroup> flowerGroup;

    public FlowerBucket() {
        flowerGroup = new ArrayList<FlowerGroup>();
    }

    public void addFlowerGroup(FlowerGroup fg) {
        flowerGroup.add(fg);
    }

    public double getPrice() {

        double price = 0;

        for(FlowerGroup flower: flowerGroup) {
            price += flower.getPrice();
        }

        return price;
    }

}
